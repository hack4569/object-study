package com.study.object.condition;

import com.study.object.Screening;

public interface DiscountCondition {
    boolean isPass(Screening screening);
}
