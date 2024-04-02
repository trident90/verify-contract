package io.cplabs.wemixfi.verify;

import java.util.Map;

public class FunctionDebugData {

    private Map<String, FunctionInfo> functions; // Key: function name (internal name), Value: FunctionInfo object

    // Getters and Setters for each field
    public Map<String, FunctionInfo>getFunctions()
    {
		return this.functions;
	}

    public void setFunction(Map<String,FunctionInfo> functions)
    {
		this.functions = functions;
	}
}