package io.cplabs.wemixfi.verify;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.READER;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCall;
import org.web3j.protocol.core.methods.response.EthGetCode;
import org.web3j.protocol.http.HttpService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/")
public class VerifyController {

    public static File createTempFile(String content) throws IOException {
        // Get the system's temporary directory
        String tempDir = System.getProperty("java.io.tmpdir");

        // Create a unique filename using System.currentTimeMillis()
        String fileName = "temp_file_" + System.currentTimeMillis() + ".txt";

        // Create a temporary file
        File tempFile = new File(tempDir, fileName);
        tempFile.createNewFile();

        // Write the string content to the temporary file
        Files.write(tempFile.toPath(), content.getBytes());

        return tempFile;
    }

    @PostMapping("/api")
    public ResponseEntity<ApiResponse> verify(
            @RequestParam String apikey,
            @RequestParam String module,
            @RequestParam String action,
            @RequestParam String contractaddress,
            @RequestParam String sourceCode,
            @RequestParam String codeformat,
            @RequestParam String contractname,
            @RequestParam String compilerversion,
            @RequestParam String constructorArguements) {
        System.out.println("apikey =" + apikey);
        System.out.println("module =" + module);
        System.out.println("action =" + action);
        System.out.println("contractaddress =" + contractaddress);
        System.out.println("sourceCode =" + sourceCode);
        System.out.println("codeformat =" + codeformat);
        System.out.println("contractname =" + contractname);
        System.out.println("compilerversion =" + compilerversion);
        System.out.println("constructorArguements =" + constructorArguements);

        String[] str = contractname.split(":");

        try {
            File tempFile = createTempFile(sourceCode);
            ProcessBuilder processBuilder = new ProcessBuilder(compilerversion, "--standard-json", tempFile.getAbsolutePath());
            System.out.println("Step 1");
            Process process = processBuilder.start();
            System.out.println("Step 2");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            System.out.println("Step 3");
            String line;
            Gson gson = new Gson();

            Web3j web3j = Web3j.build(new HttpService("https://api.wemix.com"));
            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                SolidityStandardOutput object = gson.fromJson(line, SolidityStandardOutput.class);
                System.out.println("=============================================================================");
                for (String key : object.getContracts().keySet()) {
                    System.out.println("key:" + key);
                    if (key.equals(str[0])) {
                        Map<String, List<LinkReference>> iRefs = object.getContracts().get(key).get(str[1]).getEvm().getDeployedBytecode().getImmutableReferences();
                        for (LinkReference iRef : iRefs) {

                        }
                        String byteCode = object.getContracts().get(key).get(str[1]).getEvm().getBytecode().getObject() + constructorArguements;
                        //System.out.println(object.getContracts().get(key).get(str[1]).getEvm().getBytecode().getObject());
                        System.out.println("bytecode = " + byteCode);

                        String compiled = null;
                        Transaction tx = Transaction.createEthCallTransaction(null, null, byteCode);
                        EthCall ethCall = web3j.ethCall(tx, DefaultBlockParameterName.LATEST).send();
                        if (ethCall.getResult() != null) {
                            compiled = ethCall.getResult().substring(0, ethCall.getResult().length() - 106);
                            System.out.println("compiled = " + compiled);
                        }
                        EthGetCode ethGetCode = web3j.ethGetCode(contractaddress, DefaultBlockParameterName.LATEST).send();
                        String registered = ethGetCode.getResult().substring(0, ethGetCode.getResult().length() - 106);
                        System.out.println("registered = " + registered);
                        if (compiled != null && compiled.equals(registered)) {
                            System.out.println(">>>>>>>>>>> The submitted smart contract and registered smart contract are equal !!!");
                        } else {
                            System.out.println(">>>>>>>>>>> The submitted smart contract and regsitered smart contract are NOT euqal !!!");
                        }
                //         ContractNames contractName = object.getContractNames().get(key);
                //         System.out.println(contractName.getContract().toString());
                    }
                };
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Response
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus("1");
        apiResponse.setMessage("OK");
        apiResponse.setResult("a7lpxkm9kpcpicx7daftmjifrfhiuhf5vqqnawhkfhzfrcpnxj");

        return ResponseEntity.ok().body(apiResponse);
    }

    @GetMapping("/api")
    public ResponseEntity<ApiResponse> getSource(
            @RequestParam String apikey,
            @RequestParam String module,
            @RequestParam String action,
            @RequestParam(required = false) String address,
            @RequestParam(required = false) String guid) {
        System.out.println("apikey =" + apikey);
        System.out.println("module =" + module);
        System.out.println("action =" + action);
        System.out.println("address =" + address);
        System.out.println("guid =" + guid);

        // Response
        ApiResponse apiResponse = new ApiResponse();
        if (action.equals("checkverifystatus")) {
            apiResponse.setStatus("1");
            apiResponse.setMessage("OK");
            apiResponse.setResult("Pass - Verified");
        } else {
            apiResponse.setStatus("1");
            apiResponse.setMessage("OK");

            SourceCodeResult sourceCodeResult = new SourceCodeResult();
            sourceCodeResult.setSourceCode("");
            sourceCodeResult.setABI("Contract source code not verified");
            sourceCodeResult.setContractName("");
            sourceCodeResult.setCompilerVersion("");
            sourceCodeResult.setOptimizationUsed("action");
            sourceCodeResult.setRuns("");
            sourceCodeResult.setConstructorArguments("");
            sourceCodeResult.setEVMVersion("Default");
            sourceCodeResult.setLibrary("");
            sourceCodeResult.setLicenseType("Unknown");
            sourceCodeResult.setProxy("0");
            sourceCodeResult.setImplementation("");
            sourceCodeResult.setSwarmSource("");

            List<SourceCodeResult> arrayResults = new ArrayList<>();
            arrayResults.add(sourceCodeResult);

            apiResponse.setResult(arrayResults);
        }
        return ResponseEntity.ok().body(apiResponse);
    }
}
