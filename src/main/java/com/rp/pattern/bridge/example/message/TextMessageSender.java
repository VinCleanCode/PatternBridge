package com.rp.pattern.bridge.example.message;

public class TextMessageSender implements MessageSender {
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }
}
