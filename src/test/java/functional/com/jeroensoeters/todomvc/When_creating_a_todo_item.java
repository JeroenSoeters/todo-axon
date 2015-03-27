package com.jeroensoeters.todomvc;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jeroens on 3/26/15.
 */
public class When_creating_a_todo_item {

    @Test
    public void the_location_of_the_item_should_be_returned() throws IOException, InterruptedException {
        HttpResponse response = Request.Post("http://localhost:8888/todos")
                .bodyString("{title:'something I have to do'}", ContentType.APPLICATION_JSON)
                .execute().returnResponse();
        String location = response.getHeaders("Location")[0].getValue();
        assertNotNull(location);
    }

    @Test
    public void a_resource_should_be_created() {

    }
}
