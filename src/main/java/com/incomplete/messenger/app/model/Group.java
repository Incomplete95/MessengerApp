package com.incomplete.messenger.app.model;

/**
 * Created by Incomplete on 3/26/21.
 */
public class Group extends ChatThread {
    public Group(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
