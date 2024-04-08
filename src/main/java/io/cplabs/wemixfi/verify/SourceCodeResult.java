package io.cplabs.wemixfi.verify;

import com.google.gson.annotations.SerializedName;

public class SourceCodeResult {
    @SerializedName("SourceCode")
    private String SourceCode;
    @SerializedName("ABI")
    private String ABI;
    @SerializedName("ContractName")
    private String ContractName;
    @SerializedName("CompilerVersion")
    private String CompilerVersion;
    @SerializedName("OptimizationUsed")
    private String OptimizationUsed;
    @SerializedName("Runs")
    private String Runs;
    @SerializedName("ConstructorArguments")
    private String ConstructorArguments;
    @SerializedName("EVMVersion")
    private String EVMVersion;
    @SerializedName("Library")
    private String Library;
    @SerializedName("LicenseType")
    private String LicenseType;
    @SerializedName("Proxy")
    private String Proxy;
    @SerializedName("Implementation")
    private String Implementation;
    @SerializedName("SwarmSource")
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