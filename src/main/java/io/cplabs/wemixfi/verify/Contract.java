package io.cplabs.wemixfi.verify;

import java.util.List;

public class Contract {
    private List<ABIItem> abi; // List of ABI items
    private EVM evm; // EVM section containing bytecode and deployedBytecode
    private String metadata; // Metadata as a JSON string

    public List<ABIItem> getAbi() {
        return abi;
    }

    public void setAbi(List<ABIItem> abi) {
        this.abi = abi;
    }

    public EVM getEvm() {
        return evm;
    }

    public void setEvm(EVM evm) {
        this.evm = evm;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}