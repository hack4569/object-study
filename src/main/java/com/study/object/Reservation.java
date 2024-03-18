package com.study.object;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Reservation {
    private Movie movie;
    private TimeTable timeTable;
    private int count;
    private int totalPrice;
    private int sequence;

    public Reservation reserve() {
        Screening screening = Screening.builder().timeTable(timeTable)
                .movie(movie)
                .count(count)
                .sequence(sequence)
                .build();
        return screening.getReserve();
    }

}
