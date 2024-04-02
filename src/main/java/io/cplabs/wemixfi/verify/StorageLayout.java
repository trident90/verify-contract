package io.cplabs.wemixfi.verify;

import java.util.List;
import java.util.Map;

public class StorageLayout {

    private List<StorageItem> storage;
    private Map<String, String> types; // Key: t

    // Getters and Setters for each field
    public List<StorageItem> getStorage() {
        return this.storage;
    }

    public void setStorage(List<StorageItem> storage) {
        this.storage = storage;
    }

    public Map<String, String>getTypes() {
		return this.types;
	}

    public void setTypes(Map<String, String> types) {
		this.types = types;
	}
}