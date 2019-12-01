package com.rp.pattern.bridge.example.message;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    public void send() {
        messageSender.sendMessage();
    }
}
