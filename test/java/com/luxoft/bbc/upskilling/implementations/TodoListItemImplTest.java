package com.luxoft.bbc.upskilling.implementations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TodoListItemImplTest {

    protected TodoListItemImpl todoItem;
    protected String title;

    @BeforeAll
    public static void setUpGlobal(){


    }

    @BeforeEach
    public void setUp(){
        title = "Test";
        todoItem = new TodoListItemImpl(title);
    }
//
//    @Test
//    public void todoItemIsNotNUllAfterCreation() {
//    }

    @Test
    public void itemHasAssignedTitleAfterCreation(){
        Assertions.assertTrue(title.equalsIgnoreCase(todoItem.getTitle()));
    }

    @Test
    public void itemHasNewTitleTitleAfterCreation() {
        String newTitle = "New";
        todoItem.setTitle(newTitle);
        Assertions.assertTrue(()->newTitle.equalsIgnoreCase(todoItem.getTitle()));
    }

    @Test
    public void todoItemIsNotNullAfterCreation(){
        Assertions.assertNotNull(todoItem);
    }

    @AfterEach
    public void tearDown(){

    }

    @AfterAll
    public static void tearDownGlobal(){

    }
}