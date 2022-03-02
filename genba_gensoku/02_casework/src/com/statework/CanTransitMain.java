package com.statework;

public class CanTransitMain {
    static StateTransitions stateTransitions;
    public static void main(String[] args) {
        stateTransitions = new StateTransitions();
        printCanTransitText(State.examination, State.close);
        printCanTransitText(State.examination, State.rejected);
        printCanTransitText(State.executing, State.close);
        printCanTransitText(State.close, State.executing);
    }

    private static void printCanTransitText(State from, State to){
        boolean canTransit = stateTransitions.canTransit(from, to);
        System.out.println(from + "  -> " + to + " is " + canTransit);
    }
}
