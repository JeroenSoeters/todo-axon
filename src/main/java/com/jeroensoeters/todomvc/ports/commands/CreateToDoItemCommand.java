package com.jeroensoeters.todomvc.ports.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

import java.util.UUID;

/**
 * Created by jeroens on 3/24/15.
 */
public class CreateToDoItemCommand {

    @TargetAggregateIdentifier
    private final String todoId;
    private final String description;

    public CreateToDoItemCommand(String todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public String getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }
}