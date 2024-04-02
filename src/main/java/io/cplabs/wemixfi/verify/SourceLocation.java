package io.cplabs.wemixfi.verify;

public class SourceLocation {

    private String file;
    private int start;
    private int end;
  
    // Optional: message field for secondarySourceLocations
    private String message;
  
    // Getters and Setters for each field
    public String getFile() {
        return file;
    }
      
    public void setFile(String file) {
        this.file = file;
    }
      
    public int getStart() {
        return start;
    }
      
    public void setStart(int start) {
        this.start = start;
    }
      
    public int getEnd() {
        return end;
    }
      
    public void setEnd(int end) {
        this.end = end;
    }
      
    public String getMessage() {
        return message;
    }
      
    public void setMessage(String message) {
        this.message = message;
    }
  }