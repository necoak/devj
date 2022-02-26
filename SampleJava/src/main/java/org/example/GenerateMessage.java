package org.example;

public class GenerateMessage {
    public Message generate(String msg) {
        return new Message(msg);
    }

    public Message generate() {
        String blankMsg = "Blank Message";
        return generate(blankMsg);
    }
}
