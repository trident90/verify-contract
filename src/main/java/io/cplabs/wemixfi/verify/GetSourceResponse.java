package io.cplabs.wemixfi.verify;

import java.util.List;

public class GetSourceResponse {
    private String status;
    private String message;
    private List<Result> result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Result {

        private String SourceCode;
        private String ABI;
        private String ContractName;
        private String CompilerVersion;
        private String OptimizationUsed;
        private String Runs;
        private String ConstructorArguments;
        private String EVMVersion;
        private String Library;
        private String LicenseType;
        private String Proxy;
        private String Implementation;
        private String SwarmSource;

        // Getter and Setter methods here...
        public String getSourceCode() {
            return SourceCode;
        }

        public void setSourceCode(String sourceCode) {
            this.SourceCode = sourceCode;
        }
        
        public String getABI() {
            return ABI;
        }

        public void setABI(String abi) {
            this.ABI = abi;
        }
        
        public String getContractName() {
            return ContractName;
        }

        public void setContractName(String contractName) {
            this.ContractName = contractName;
        }
        
        public String getCompilerVersion() {
            return CompilerVersion;
        }

        public void setCompilerVersion(String compilerVersion) {
            this.CompilerVersion = compilerVersion;
        }
        
        public String getOptimizationUsed() {
            return OptimizationUsed;
        }

        public void setOptimizationUsed(String optimizationUsed) {
            this.OptimizationUsed = optimizationUsed;
        }
        
        public String getRuns() {
            return Runs;
        }

        public void setRuns(String runs) {
            this.Runs = runs;
        }
        
        public String getConstructorArguments() {
            return ConstructorArguments;
        }

        public void setConstructorArguments(String constructorArguments) {
            this.ConstructorArguments = constructorArguments;
        }
        
        public String getEVMVersion() {
            return EVMVersion;
        }

        public void setEVMVersion(String evmVersion) {
            this.EVMVersion = evmVersion;
        }
        
        public String getLibrary() {
            return Library;
        }

        public void setLibrary(String library) {
            this.Library = library;
        }
        
        public String getLicenseType() {
            return LicenseType;
        }

        public void setLicenseType(String licenseType) {
            this.LicenseType = licenseType;
        }
        
        public String getProxy() {
            return Proxy;
        }

        public void setProxy(String proxy) {
            this.Proxy = proxy;
        }
        
        public String getImplementation() {
            return Implementation;
        }

        public void setImplementation(String implementation) {
            this.Implementation = implementation;
        }
        
        public String getSwarmSource() {
            return SwarmSource;
        }

        public void setSwarmSource(String swarmSource) {
            this.SwarmSource = swarmSource;
        }
        
    }
}
