package io.cplabs.wemixfi.verify;

import java.util.List;

public class ArrayResult {
    private List<SourceCodeResult> result;

    // 생성자
    public ArrayResult(List<SourceCodeResult> result) {
        this.result = result;
    }

    // result 필드에 대한 getter
    public List<SourceCodeResult> getResult() {
        return result;
    }

    // result 필드에 대한 setter
    public void setResult(List<SourceCodeResult> result) {
        this.result = result;
    }
}
