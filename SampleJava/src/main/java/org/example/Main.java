package org.example;

public class Main {
    public static void main(String[] args) {

        GenerateMessage generateMessage = new GenerateMessage();
        Message message = generateMessage.generate();
        System.out.println(message);
    }
}
