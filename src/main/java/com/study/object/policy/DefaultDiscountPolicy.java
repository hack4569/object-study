package com.study.object.policy;

import com.study.object.Screening;
import com.study.object.condition.DiscountCondition;

public abstract class DefaultDiscountPolicy {
    // 조건 여러개 중에 하나만 해당되어도 할인 적용
    public boolean isPass(Screening screening) {
        if (!screening.getConditionList().isEmpty()) {
            for (DiscountCondition discountCondition : screening.getConditionList()) {
                if (discountCondition.isPass(screening)) {
                    return true;
                }
            }
        }
        return false;
    }
}
