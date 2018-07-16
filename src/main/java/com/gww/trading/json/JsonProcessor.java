package com.gww.trading.json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

public class JsonProcessor {
    private String JSON = "{\"name\":\"john\",\"age\":22,\"class\":\"mca\",\"address\":{\"city\":\"New York\"},\"subjects\":[\"maths\":99,\"science\":98],\"active\":true}";

    public JsonObject loadJsonString() {

        JsonReader jsonReader = Json.createReader(new StringReader(JSON));
        JsonObject jsonObject = jsonReader.readObject();
        jsonReader.close();

        return jsonObject;
    }

}
