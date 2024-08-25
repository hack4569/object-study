package com.study.object.dry.step02;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class Phone extends AbstractPhone {
    private Money amount;
    private Duration seconds;

    public Phone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money caluateFree(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
