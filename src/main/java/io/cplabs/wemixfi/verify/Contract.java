package io.cplabs.wemixfi.verify;

import java.util.List;

public class Contract {

    // Use String as a placeholder for complex types like ABI
    private List<Abi> abis;
    private String metadata;
    private Object userdoc; // Can be a HashMap representing user documentation
    private Object devdoc; // Can be a HashMap representing developer documentation
    private String ir;
    private StorageLayout storageLayout;
    private Evm evm;
    private Ewasm ewasm;

    // Getters and Setters for each field
    public List<Abi> getAbis() {
        return this.abis;
    }

    public void setAbis(List<Abi> abis) {
        this.abis = abis;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Object getUserdoc() {
        return this.userdoc;
    }

    public void setUserdoc(Object userdoc) {
        this.userdoc = userdoc;
    }

    public Object getDevdoc() {
        return this.devdoc;
    }

    public void setDevdoc(Object devdoc) {
        this.devdoc = devdoc;
    }

    public String getIr() {
        return this.ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
    }

    public StorageLayout getStorageLayout() {
        return this.storageLayout;
    }

    public void setStorageLayout(StorageLayout storageLayout) {
        this.storageLayout = storageLayout;
    }

    public Evm getEvm() {
        return this.evm;
    }

    public void setEvm(Evm evm) {
        this.evm = evm;
    }

    public Ewasm getEwasm() {
        return ewasm;
    }
    
    public void setEwasm(Ewasm ewasm) {
        this.ewasm = ewasm;
    }

    @Override
    public String toString() {
        return "Contract{" +
            "abi='" + abis + '\'' +
            ", metadata='" + metadata + '\'' +
            ", userdoc=" + userdoc +
            ", devdoc=" + devdoc +
            ", ir='" + ir + '\'' +
            ", storageLayout=" + storageLayout +
            ", evm=" + evm +
            ", ewasm=" + ewasm +
            '}';
    }
}