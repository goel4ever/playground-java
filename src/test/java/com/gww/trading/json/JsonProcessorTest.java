package com.gww.trading.json;

import org.junit.Test;

import javax.json.JsonObject;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonProcessorTest {

    @Test
    public void givenJsonDataInString() throws Exception {
        // Arrange
        JsonProcessor jsonProcessor = new JsonProcessor();

        // Act
        JsonObject jsonObject = jsonProcessor.loadJsonString();

        // Assert
        assertThat(jsonObject.get("version")).isNull();
        assertThat(jsonObject.getString("name")).isEqualTo("john");
        assertThat(jsonObject.getJsonArray("subjects").size()).isEqualTo(2);
        assertThat(jsonObject.getBoolean("active")).isTrue();
        assertThat(jsonObject.getInt("age")).isEqualTo(22);
        assertThat(jsonObject.getJsonObject("address").getString("city")).isEqualTo("New York");
        assertThat(jsonObject.getJsonArray("subjects").getJsonObject(0).getString("maths")).isEqualTo(99);

    }
}
