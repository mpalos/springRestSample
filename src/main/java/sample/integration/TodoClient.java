package sample.integration;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import sample.model.Todo;
import sample.resource.TodoResource;

import java.util.List;

public interface TodoClient {

    @RequestLine("GET /{id}")
    TodoResource findById(@Param("id") String id);

    @RequestLine("GET")
    List<TodoResource> findAll();

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void create(Todo book);

}
