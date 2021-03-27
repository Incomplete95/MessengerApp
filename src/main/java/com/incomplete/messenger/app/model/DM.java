package com.incomplete.messenger.app.model;

/**
 * Created by Incomplete on 3/26/21.
 */
public class DM extends ChatThread {
    private String user1;
    private String user2;

    public DM(String id, String user1, String user2) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
    }

    public String getId() {
        return id;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }
}
