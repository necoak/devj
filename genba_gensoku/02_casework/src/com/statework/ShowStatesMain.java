package com.statework;

public class ShowStatesMain {
    public static void main(String[] args) {
        State[] states = State.values();
        for (State state : states) {
            System.out.println(state);
        }
    }
}
