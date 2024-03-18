package com.study.object.policy;

import com.study.object.Screening;
import com.study.object.policy.DefaultDiscountPolicy;
import com.study.object.policy.DiscountPolicy;

public class WonDiscountPolicy extends DefaultDiscountPolicy implements DiscountPolicy {
    private int discountAmount;
    @Override
    public int calcPrice(Screening screening) {
        if (isPass(screening)) {
            return this.discountAmount;
        }
        return this.discountAmount;
    }
}
