package com.study.object;

import com.study.object.condition.DiscountCondition;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screening {
    private Movie movie;
    private TimeTable timeTable;
    private int count;
    private int sequence;
    private List<DiscountCondition> conditionList;

    @Builder
    public Screening(Movie movie, TimeTable timeTable, int count, int sequence) {
        this.movie = movie;
        this.timeTable = timeTable;
        this.count = count;
        this.sequence = sequence;
    }

    public int calcPrice() {
        return movie.calcFee(this);
    }

    public Reservation getReserve() {
        return Reservation.builder()
                .totalPrice(this.calcPrice())
                .timeTable(this.timeTable)
                .movie(this.movie)
                .count(this.count)
                .sequence(this.sequence)
                .build();
    }
}
