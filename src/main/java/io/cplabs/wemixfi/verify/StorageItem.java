package io.cplabs.wemixfi.verify;

public class StorageItem {

    private int astId; // Optional
    private String contract; // Optional
    private String label;
    private int offset;
    private String slot;
    private String type; // U

    // Getters and Setters for each field
    public int getAstId() {
        return this.astId;
    }

    public void setAstId(int astId) {
        this.astId = astId;
    }

    public String getContract() {
        return this.contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getSlot() {
        return this.slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
  