package com.study.object.dry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Hong GilDong
 */
public class Phone {
    private double taxRate;
    private List<Call> calls = new ArrayList<>();
    private RatePolicy policy;

    public Phone(RatePolicy policy) { this.policy = policy; }

    public void call(Call call) {
        calls.add(call);
    }

    public Money calculate() {
        return policy.calculate(this);
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }
}
