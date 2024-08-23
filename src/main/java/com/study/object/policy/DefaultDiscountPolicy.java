package com.study.object.policy;

import com.study.object.Screening;
import com.study.object.condition.DiscountCondition;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;


public abstract class DefaultDiscountPolicy {
    List<DiscountCondition> discountConditionList = new ArrayList<>();
    // 조건 여러개 중에 하나만 해당되어도 할인 적용
    public boolean isPass(Screening screening) {
        if (!discountConditionList.isEmpty()) {
            for (DiscountCondition discountCondition : discountConditionList) {
                if (discountCondition.isPass(screening)) {
                    return true;
                }
            }
        }
        return false;
    }
}
