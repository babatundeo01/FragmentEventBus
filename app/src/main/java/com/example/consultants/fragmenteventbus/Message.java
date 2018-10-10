package com.example.consultants.fragmenteventbus;

public class Message {

    private final String message;
    private final int messageID;

    public Message(String message, int messageID) {
        this.message = message;
        this.messageID = messageID;
    }

    public String getMessage() {
        return message;
    }

    public int getMessageID() {
        return messageID;
    }
}
