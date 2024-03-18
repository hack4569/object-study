package com.study.object.policy;

import com.study.object.Screening;

public interface DiscountPolicy {
    public int calcPrice(Screening screening);
}
