package io.cplabs.wemixfi.verify;

public class EVM {
    private Bytecode bytecode; // Bytecode section
    private Bytecode deployedBytecode; // Deployed bytecode section

    public Bytecode getBytecode() {
        return bytecode;
    }

    public void setBytecode(Bytecode bytecode) {
        this.bytecode = bytecode;
    }

    public Bytecode getDeployedBytecode() {
        return deployedBytecode;
    }

    public void setDeployedBytecode(Bytecode deployedBytecode) {
        this.deployedBytecode = deployedBytecode;
    }
}
