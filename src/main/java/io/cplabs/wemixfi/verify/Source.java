package io.cplabs.wemixfi.verify;

import java.util.List;

public class Source {
    private String content;
    private String keccak256;
    private List<String> urls;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeccak256() {
        return keccak256;
    }

    public void setKeccak256(String keccak256) {
        this.keccak256 = keccak256;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
