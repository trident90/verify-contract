package io.cplabs.wemixfi.verify;

import java.util.Map;

public class Evm {

    private String assembly;
    private Object legacyAssembly; // Can be a HashMap (old-style assembly)
    private Bytecode bytecode;
    private Bytecode deployedBytecode;
    private Map<String, String> methodIdentifiers; // Key: function signature, Value: method identifier hash
    private GasEstimates gasEstimates;

    // Getters and Setters for each field
    public String getAssembly() {
        return this.assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public Object getLegacyAssembly() {
        return this.legacyAssembly;
    }

    public void setLegacyAssembly(Object legacyAssembly) {
        this.legacyAssembly = legacyAssembly;
    }

    public Bytecode getBytecode() {
        return this.bytecode;
    }

    public void setBytecode(Bytecode bytecode) {
        this.bytecode = bytecode;
    }

    public Bytecode getDeployedBytecode() {
        return this.deployedBytecode;
    }

    public void setDeployedBytecode(Bytecode deployedBytecode) {
        this.deployedBytecode = deployedBytecode;
    }

    public Map<String, String> getMethodIndentifiers()
    {
		return this.methodIdentifiers;
	}

    public void setMethodIdentifiers(Map<String, String> methodIdentifiers) 
    {
		this.methodIdentifiers = methodIdentifiers;
	}

    public GasEstimates getGasEstimates() {
        return this.gasEstimates;
    }

    public void setGasEstimates(GasEstimates gasEstimates) {
        this.gasEstimates = gasEstimates;
    }
  
    // Optional: Ewasm field (not shown here)
    @Override
    public String toString() {
        return "EVM{" +
            "assembly='" + assembly +
            ", legacyAssembly=" + legacyAssembly +
            ", bytecode=" + bytecode +
            ", deployedBytecode=" + deployedBytecode +
            ", methodIdentifiers=" + methodIdentifiers +
            ", gasEstimates=" + gasEstimates +
        "}";
    }
}