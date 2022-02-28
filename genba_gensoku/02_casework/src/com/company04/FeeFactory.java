package com.company04;

import java.util.HashMap;
import java.util.Map;

public class FeeFactory {
    Map<String, Fee> types;

    public FeeFactory() {
        types = new HashMap<>();
        types.put("adult", new AdultFee());
        types.put("senior", new SeniorFee());
        types.put("child", new ChildFee());
        types.put("baby", new ChildFee());
    }

    public Fee feeByNames(String name) {
        return types.get(name);
    }
}
