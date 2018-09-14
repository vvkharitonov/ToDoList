package com.luxoft.bbc.upskilling.implementations;

import com.luxoft.bbc.upskilling.interfaces.Tooglable;

public class TodoListItemImpl implements Tooglable {

    private String title;

    private boolean toogled;

    public TodoListItemImpl(String title) {
        if (title == "")
            throw new IllegalArgumentException("n must be positive");
        this.title = title;
        toogled=false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == "")
            throw new IllegalArgumentException("n must be positive");
        this.title = title;
    }

    public boolean isToggled(){
        return toogled;
    }

    @Override
    public void toggle()
    {
        toogled=!toogled;
    }


}
