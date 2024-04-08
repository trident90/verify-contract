package io.cplabs.wemixfi.verify;

public class ApiResponse {
    private String status;
    private String message;
    private Object result; // Object 대신 ResultType 인터페이스 사용

    // status 필드에 대한 getter
    public String getStatus() {
        return status;
    }

    // status 필드에 대한 setter
    public void setStatus(String status) {
        this.status = status;
    }

    // message 필드에 대한 getter
    public String getMessage() {
        return message;
    }

    // message 필드에 대한 setter
    public void setMessage(String message) {
        this.message = message;
    }

    // result 필드에 대한 getter, ResultType 반환
    public Object getResult() {
        return result;
    }

    // result 필드에 대한 setter, ResultType 입력 받음
    public void setResult(Object result) {
        this.result = result;
    }
}
