package com.study.object.dry;

public abstract class BasicRatePolicy implements RatePolicy{
    @Override
    public Money calculate(Phone phone) {
        Money result = Money.ZERO;

        for(Call call : phone.getCalls()) {
            result = result.plus(this.caluateFree(call));
        }

        return result;
    }
    protected abstract Money caluateFree(Call call);
}
