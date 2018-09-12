package com.luxoft.bbc.upskilling.implementations;

import com.luxoft.bbc.upskilling.interfaces.Tooglable;

public class TodoListItemImpl implements Tooglable {

    private String title;

    private boolean toogled;

    public TodoListItemImpl(String title) {
        this.title = title;
        toogled=false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean IsToogled(){
        return toogled;
    }

    @Override
    public void toogle()
    {}


}
