package io.cplabs.wemixfi.verify;

import java.util.List;
import java.util.Map;

public class Bytecode {

    private FunctionDebugData functionDebugData;
    private String object;
    private String opcodes;
    private String sourceMap;
    private List<GeneratedSource> generatedSources;
    private Map<String, List<LinkReference>> linkReferences;
  
    // Getters and Setters for each field
    public FunctionDebugData getFunctionDebugData() {
        return this.functionDebugData;
    }

    public void setFunctionDebugData(FunctionDebugData functionDebugData) {
        this.functionDebugData = functionDebugData;
    }

    public String getObject() {
        return this.object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getOpcodes() {
        return this.opcodes;
    }

    public void setOpcodes(String opcodes) {
        this.opcodes = opcodes;
    }

    public String getSourceMap() {
        return this.sourceMap;
    }

    public void setSourceMap(String sourceMap) {
        this.sourceMap = sourceMap;
    }

    public List<GeneratedSource> getGeneratedSources() {
        return this.generatedSources;
    }

    public void setGeneratedSources(List<GeneratedSource> generatedSources) {
        this.generatedSources = generatedSources;
    }

    public Map<String,List<LinkReference>>getLinkReferences() {
		return this.linkReferences;
	}

    public void setLinkReferences(Map<String,List<LinkReference>> linkReferences) {
		this.linkReferences = linkReferences;
	}
}