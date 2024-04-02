package io.cplabs.wemixfi.verify;

public class FunctionInfo {

    private int entryPoint; // Optional
    private Integer id; // Optional (AST ID)
    private int parameterSlots; // Optional
    private int returnSlots; // Optional

    // Getters and Setters for each field
    public int getEntryPoint() {
        return this.entryPoint;
    }

    public void setEntryPoint(int entryPoint) {
        this.entryPoint = entryPoint;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParameterSlots() {
        return this.parameterSlots;
    }

    public void setParameterSlots(int parameterSlots) {
        this.parameterSlots = parameterSlots;
    }

    public int getReturnSlots() {
        return this.returnSlots;
    }

    public void setReturnSlots(int returnSlots) {
        this.returnSlots = returnSlots;
    }
}