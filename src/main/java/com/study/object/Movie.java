package com.study.object;

import com.study.object.policy.DiscountPolicy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private int fee;
    private DiscountPolicy discountPolicy;
    public int calcFee(Screening screening) {
        return fee - discountPolicy.calcPrice(screening);
    }
}
