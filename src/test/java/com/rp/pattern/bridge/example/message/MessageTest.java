package com.rp.pattern.bridge.example.message;

import org.junit.Test;

class MessageTest {

    @Test
    void testSend() {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender=new EmailMessageSender();
        Message emailMessage=new TextMessage(emailMessageSender);
        emailMessage.send();
    }
}