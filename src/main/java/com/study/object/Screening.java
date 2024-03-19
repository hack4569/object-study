package com.study.object;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Screening {
    private Movie movie;
    private TimeTable timeTable;
    private int sequence;

    @Builder
    public Screening(Movie movie, TimeTable timeTable, int sequence) {
        this.movie = movie;
        this.timeTable = timeTable;
        this.sequence = sequence;
    }

    public int calcPrice(int count) {
        return movie.calcFee(this) * count;
    }

    public Reservation reserve(int count) {
        return Reservation.builder()
                .totalPrice(this.calcPrice(count))
                .timeTable(this.timeTable)
                .movie(this.movie)
                .count(count)
                .sequence(this.sequence)
                .build();
    }
}
