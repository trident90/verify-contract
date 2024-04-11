package io.cplabs.wemixfi.verify;

import java.util.List;
import java.util.Map;

public class Bytecode {
    private String object;
    private String opcodes;
    private String sourceMap;
    private Map<String, List<Reference>> immutableReferences;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getOpcodes() {
        return opcodes;
    }

    public void setOpcodes(String opcodes) {
        this.opcodes = opcodes;
    }

    public String getSourceMap() {
        return sourceMap;
    }

    public void setSourceMap(String sourceMap) {
        this.sourceMap = sourceMap;
    }

    public Map<String, List<Reference>> getImmutableReferences() {
        return this.immutableReferences;
    }

    public void setImmutableReferences(Map<String, List<Reference>> immutableReferences) {
        this.immutableReferences = immutableReferences;
    }
}
