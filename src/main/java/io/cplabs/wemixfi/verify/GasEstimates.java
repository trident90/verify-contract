package io.cplabs.wemixfi.verify;

import java.util.Map;

public class GasEstimates {

    private CreationCost creation;
    private Map<String, Integer> external;  // Key: function signature, Value: estimated gas cost
    private Map<String, String> internal;

    public CreationCost getCreation() {
        return creation;
    }
    
    public void setCreation(CreationCost creation) {
        this.creation = creation;
    }
    
    public Map<String, Integer> getExternal() {
        return external;
    }
    
    public void setExternal(Map<String, Integer> external) {
        this.external = external;
    }
    
    public Map<String, String> getInternal() {
        return internal;
    }
    
    public void setInternal(Map<String, String> internal) {
        this.internal = internal;
    }
}