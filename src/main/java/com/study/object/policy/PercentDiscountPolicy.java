package com.study.object.policy;

import com.study.object.Screening;
import org.springframework.util.ObjectUtils;

public class PercentDiscountPolicy extends DefaultDiscountPolicy implements DiscountPolicy {
    private int discountAmount;
    @Override
    public int calcPrice(Screening screening) {
        if (isPass(screening)) {
            if (!ObjectUtils.isEmpty(screening.getMovie())) {
                return screening.getMovie().getFee() * discountAmount;
            }
        }
        return this.discountAmount;
    }
}
