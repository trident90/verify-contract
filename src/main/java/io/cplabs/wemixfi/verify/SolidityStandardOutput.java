package io.cplabs.wemixfi.verify;

import java.util.List;
import java.util.Map;

public class SolidityStandardOutput {
  // Mandatory: contracts field
  private Map<String, Map<String, Contract>> contracts;

  // Mandatory: sources field
  private Map<String, Source> sources;

  // Optional: errors field
  //private List<Error> errors;

  // Getters and Setters for each field
//  public List<Error> getErrors() {
//    return this.errors;
//  }
//
//  public void setError(Error error) {
//    this.errors.add(error);
//  }

  public Map<String, Map<String, Contract>> getContracts() {
    return this.contracts;
  }
  
  public void setContracts(Map<String, Map<String, Contract>> contracts) {
    this.contracts = contracts;
  }

  public Map<String, Source> getSources() {
    return this.sources;
  }

  public void setSources(Map<String, Source> sources) {
    this.sources = sources;
  }
}

