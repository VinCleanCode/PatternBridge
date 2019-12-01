package com.rp.pattern.bridge.example.message;

//https://springframework.guru/gang-of-four-design-patterns/bridge-pattern/bridge-pattern
public abstract  class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    abstract public void send();
}
