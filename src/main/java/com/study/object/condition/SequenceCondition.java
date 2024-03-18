package com.study.object.condition;

import com.study.object.Screening;
import com.study.object.condition.DiscountCondition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SequenceCondition implements DiscountCondition {
    private int sequence;
    @Override
    public boolean isPass(Screening screening) {
        return screening.getSequence() == getSequence();
    }
}
