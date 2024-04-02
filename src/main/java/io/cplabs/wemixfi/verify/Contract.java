package io.cplabs.wemixfi.verify;

public class Contract {

    // Use String as a placeholder for complex types like ABI
    private String abi;
    private String metadata;
    private Object userdoc; // Can be a HashMap representing user documentation
    private Object devdoc; // Can be a HashMap representing developer documentation
    private String ir;
    private StorageLayout storageLayout;
    private Evm evm;

    // Getters and Setters for each field
    public String getAbi() {
        return this.abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
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
}