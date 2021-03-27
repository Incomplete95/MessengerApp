package com.incomplete.messenger.app.model;

/**
 * Created by Incomplete on 3/26/21.
 */
public class Message {
    private String sequenceId;
    private String author;
    private long ts;
    private String threadId;


    public Message(String sequenceId, String author, long ts, String threadId) {
        this.sequenceId = sequenceId;
        this.author = author;
        this.ts = ts;
        this.threadId = threadId;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public String getAuthor() {
        return author;
    }

    public long getTs() {
        return ts;
    }

    public String getThreadId() {
        return threadId;
    }
}
