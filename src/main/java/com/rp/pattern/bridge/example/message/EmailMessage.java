package com.rp.pattern.bridge.example.message;

public class EmailMessage extends Message{

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    public void send() {
        messageSender.sendMessage();
    }
}
