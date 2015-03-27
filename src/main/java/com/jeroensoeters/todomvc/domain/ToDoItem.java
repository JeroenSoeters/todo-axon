package com.jeroensoeters.todomvc.domain;

import com.jeroensoeters.todomvc.todomvc.ports.MarkCompletedCommand;
import com.jeroensoeters.todomvc.todomvc.ports.commands.CreateToDoItemCommand;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

/**
 * Created by jeroens on 3/24/15.
 */
public class ToDoItem extends AbstractAnnotatedAggregateRoot {

    @AggregateIdentifier
    private String todoId;

    public ToDoItem() {

    }

    @CommandHandler
    public ToDoItem(CreateToDoItemCommand command) {
        apply(new ToDoItemCreatedEvent(command.getTodoId(), command.getDescription()));
    }

    @CommandHandler
    public void markCompleted(MarkCompletedCommand command) {
        apply(new ToDoItemCompletedEvent(todoId));
    }

    @EventHandler
    public void on(ToDoItemCreatedEvent event) {
        this.todoId = event.getTodoId();
    }
}
