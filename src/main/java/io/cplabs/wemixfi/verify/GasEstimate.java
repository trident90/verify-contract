package io.cplabs.wemixfi.verify;

public class GasEstimate {

    private String codeDepositCost;
    private String executionCost;
    private String totalCost;

    // Getters and Setters for each field
    public String getCodeDepositCost() {
        return this.codeDepositCost;
    }

    public void setCodeDepositCost(String codeDepositCost) {
        this.codeDepositCost = codeDepositCost;
    }

    public String getExecutionCost() {
        return this.executionCost;
    }

    public void setExecutionCost(String executionCost) {
        this.executionCost = executionCost;
    }

    public String getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }
}