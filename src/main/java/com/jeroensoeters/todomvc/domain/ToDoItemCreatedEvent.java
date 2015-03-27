package com.jeroensoeters.todomvc.domain;

/**
 * Created by jeroens on 3/24/15.
 */
public class ToDoItemCreatedEvent {
    private String id;

    public ToDoItemCreatedEvent(String id, String title) {
        this.id = id;
    }

    public String getTodoId() {
        return this.id;
    }
}
