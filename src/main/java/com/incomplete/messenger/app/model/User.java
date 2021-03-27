package com.incomplete.messenger.app.model;

/**
 * Created by Incomplete on 3/26/21.
 */
public class User {
    private String id;
    private String alias;

    public User(String id, String alias) {
        this.id = id;
        this.alias = alias;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
