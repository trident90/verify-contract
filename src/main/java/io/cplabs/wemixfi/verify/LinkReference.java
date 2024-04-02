package io.cplabs.wemixfi.verify;

import java.util.List;

public class LinkReference {

    private List<BytecodeReference> references;

    // Getters and Setters for each field
    public List<BytecodeReference> getReferences() {
        return this.references;
    }

    public void setReferences(List<BytecodeReference> references) {
        this.references = references;
    }
}