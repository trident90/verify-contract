package io.cplabs.wemixfi.verify;

import java.util.List;
import java.util.Map;

public class SolidityStandardOutput {
   // Optional: errors field
  private List<Error> errors;

  // Mandatory: sources field
  private Map<String, SourceFile> sources;

  // Mandatory: contracts field
  private Map<String, Contract> contracts;

  // Getters and Setters for each field
  public List<Error> getErrors() {
    return this.errors;
  }

  public void setError(Error error) {
    this.errors.add(error);
  }

  public Map<String, SourceFile> getSources() {
    return sources;
  }
  
  public void setSources(Map<String, SourceFile> sources) {
    this.sources = sources;
  }
  
  public Map<String, Contract> getContracts() {
    return contracts;
  }
  
  public void setContracts(Map<String, Contract> contracts) {
    this.contracts = contracts;
  }
} 

