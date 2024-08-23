package com.study.object.dry;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Hong GilDong
 */
public abstract class AbstractPhone {
    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    public AbstractPhone(double taxRate) { this.taxRate = taxRate; }

    public void call(Call call) {
        calls.add(call);
    }

    public Money calculate() {
        Money result = Money.ZERO;

        for(Call call : calls) {
            result = result.plus(this.caluateFree(call));
        }

        return result.plus(result.times(taxRate));
    }

    protected abstract Money caluateFree(Call call);
}
