package io.cplabs.wemixfi.verify;

public class SourceFile {

    private int id;
    private Object ast; // Can b

    // Getters and Setters for each field
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getAst() {
        return this.ast;
    }

    public void setAst(Object ast) {
        this.ast = ast;
    }
}