package io.cplabs.wemixfi.verify;

import java.util.List;

public class Error {

    // Optional: sourceLocation field
    private SourceLocation sourceLocation;
  
    // Optional: secondarySourceLocations field
    private List<SourceLocation> secondarySourceLocations;
  
    // Mandatory: type field
    private String type;
  
    // Mandatory: component field
    private String component;
  
    // Mandatory: severity field
    private String severity;
  
    // Optional: errorCode field
    private String errorCode;
  
    // Mandatory: message field
    private String message;
  
    // Optional: formattedMessage field
    private String formattedMessage;
  
    // Getters and Setters for each field
    public SourceLocation getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(SourceLocation sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public List<SourceLocation> getSecondarySourceLocations() {
        return secondarySourceLocations;
    }

    public void setSecondarySourceLocations(List<SourceLocation> secondarySourceLocations) {
        this.secondarySourceLocations = secondarySourceLocations;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFormattedMessage() {
        return formattedMessage;
    }

    public void setFormattedMessage(String formattedMessage) {
        this.formattedMessage = formattedMessage;
    }
}