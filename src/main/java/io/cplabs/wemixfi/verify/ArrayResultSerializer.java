package io.cplabs.wemixfi.verify;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ArrayResultSerializer implements JsonSerializer<ArrayResult> {
    @Override
    public JsonElement serialize(ArrayResult src, Type typeOfSrc, JsonSerializationContext context) {
        // ArrayResult의 리스트를 JSON 배열로 직렬화
        JsonArray jsonArray = new JsonArray();
        for (SourceCodeResult item : src.getResult()) {
            JsonElement jsonItem = context.serialize(item);
            jsonArray.add(jsonItem);
        }
        return jsonArray;
    }
}