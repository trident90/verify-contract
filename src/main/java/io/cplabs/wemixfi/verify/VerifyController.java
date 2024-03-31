package io.cplabs.wemixfi.verify;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class VerifyController {
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
