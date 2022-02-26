package org.example;

public class Message {
    private String msg;

    public Message(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return this.msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
