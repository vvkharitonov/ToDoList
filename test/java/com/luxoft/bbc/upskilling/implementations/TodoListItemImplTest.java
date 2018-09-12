package com.luxoft.bbc.upskilling.implementations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TodoListItemImplTest {

    protected TodoListItemImpl todoItem;

    @BeforeAll
    public static void setUpGlobal(){


    }

    @BeforeEach
    public void setUp(){
        String title = "Test";
        todoItem = new TodoListItemImpl(title);
    }

    @Test
    void todoItemIsNotNUllAfterCreation() {
    }

    @AfterEach
    public void tearDown(){

    }

    @AfterAll
    public static void tearDownGlobal(){

    }
}