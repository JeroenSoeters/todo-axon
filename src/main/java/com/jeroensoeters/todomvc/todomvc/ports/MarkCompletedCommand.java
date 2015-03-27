package com.jeroensoeters.todomvc.todomvc.ports;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by jeroens on 3/24/15.
 */
public class MarkCompletedCommand {

    @TargetAggregateIdentifier
    private final String todoId;

    public MarkCompletedCommand(String todoId) {
        this.todoId = todoId;
    }

    public String getTodoId() {
        return todoId;
    }
}
