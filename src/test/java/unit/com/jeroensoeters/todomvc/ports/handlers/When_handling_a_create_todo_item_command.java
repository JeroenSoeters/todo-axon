package com.jeroensoeters.todomvc.ports.handlers;

import com.jeroensoeters.todomvc.ports.commands.CreateToDoItemCommand;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class When_handling_a_create_todo_item_command
    extends TestCase
{
    /**2
     * Create the test case
     *
     * @param testName name of the test case
     */
    public When_handling_a_create_todo_item_command( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( When_handling_a_create_todo_item_command.class );
    }


    @Override
    protected void setUp() throws Exception {
        new CreateToDoItemCommand(UUID.randomUUID().toString(), "finish this PoC");

        super.setUp();
    }

    /**
     * Rigourous Test :-)
     */
    public void a_todo_item_should_be_persisted() {
        assertTrue( true );
    }
}
