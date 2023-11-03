package com.example.mainactivity;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }
    public void setDone(boolean isChecked) {
        done = isChecked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { return name;}

    public UUID getId() { return id;}

}
