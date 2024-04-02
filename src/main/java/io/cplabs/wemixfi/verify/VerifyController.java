package io.cplabs.wemixfi.verify;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

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
    public ResponseEntity<VerifyResponse> verify(
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
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                SolidityStandardOutput object = gson.fromJson(line, SolidityStandardOutput.class);
                System.out.println("=============================================================================");
                System.out.println(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isValid = true;
        // Response
        VerifyResponse response = new VerifyResponse();
        response.setValid(isValid);

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/api")
    public ResponseEntity<GetSourceResponse> getSource(
            @RequestParam String apikey,
            @RequestParam String module,
            @RequestParam String action,
            @RequestParam String address) {
        System.out.println("apikey =" + apikey);
        System.out.println("module =" + module);
        System.out.println("action =" + action);
        System.out.println("address =" + address);

        // Response
        GetSourceResponse response = new GetSourceResponse();
        response.setStatus("0");
        response.setMessage("NOK");
        response.setResults("Contract source code not verified");
        // List<Result> results = new ArrayList<Result>();

        // Result result = new Result();
        // result.setSourceCode("");
        // result.setABI("");
        // result.setCompilerVersion("");
        // result.setConstructorArguments("");
        // result.setContractName("");
        // result.setLicenseType("");
        // result.setLibrary("");
        // result.setOptimizationUsed("");
        // result.setEVMVersion("");
        // result.setProxy("");
        // result.setRuns("");
        // result.setImplementation("");
        // result.setSwarmSource("");

        // results.add(result);
        // response.setResults(results);
        return ResponseEntity.ok().body(response);
    }
}
