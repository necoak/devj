package com.statework;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateTransitions {
    private Map<State, Set<State>> allowed;

    public StateTransitions(){
        this.allowed = new HashMap<>();

        this.allowed.put(State.examination, EnumSet.of(State.approved, State.rejected));
        this.allowed.put(State.rejected, EnumSet.of(State.examination, State.close));
        this.allowed.put(State.approved, EnumSet.of(State.executing, State.close));
        this.allowed.put(State.executing, EnumSet.of(State.pending, State.close));
        this.allowed.put(State.pending, EnumSet.of(State.executing, State.close));
        this.allowed.put(State.close, EnumSet.of(State.close));
    }

    public boolean canTransit(State from, State to) {
        Set<State> allowedStates = allowed.get(from);
        return allowedStates.contains(to);
    }
}
