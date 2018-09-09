package sample.integration;

import sample.model.Todo;
import sample.resource.TodoResource;

import java.util.List;

public class TodoClientImpl implements TodoClient {
    @Override
    public TodoResource findById(String id) {

        return null;

    }

    @Override
    public List<TodoResource> findAll() {
        return null;
    }

    @Override
    public void create(Todo book) {

    }
}
