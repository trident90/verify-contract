package io.cplabs.wemixfi.verify;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ApiResponseSerializer implements JsonSerializer<ApiResponse> {
    @Override
    public JsonElement serialize(ApiResponse src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", src.getStatus());
        jsonObject.addProperty("message", src.getMessage());

        Object result = src.getResult();
        if (result instanceof StringResult) {
            jsonObject.addProperty("result", ((StringResult) result).getResult());
        } else if (result instanceof ArrayResult) {
            // ArrayResult 타입인 경우 커스텀 직렬화 처리기를 사용하여 직렬화
            JsonElement resultElement = context.serialize(result, ArrayResult.class);
            jsonObject.add("result", resultElement);
        } else {
            JsonElement resultElement = context.serialize(result);
            jsonObject.add("result", resultElement);
        }

        return jsonObject;
    }
}
