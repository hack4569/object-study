package com.study.object.condition;

import com.study.object.Screening;
import com.study.object.TimeTable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;
@Getter
@Setter
public class TimeTableCondition implements DiscountCondition{
    private TimeTable eventTime;

    @Override
    public boolean isPass(Screening screening) {
        if (ObjectUtils.isEmpty(screening.getTimeTable())) {
            return screening.getTimeTable().getDay() == eventTime.getDay();
        }
        return false;
    }
}
