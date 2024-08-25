package com.study.object.dry;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Hong GilDong
 */
public class DryTest {


    @Test
    public void test2() {
        Phone phone = new Phone(new RegularPolicy(Money.wons(5), Duration.ofSeconds(10)));
        phone.call(
                new Call(
                        LocalDateTime.of(2020,1,1,12,10,0),
                        LocalDateTime.of(2020,1,1,12,11,0)
                )
        );
        phone.call(
                new Call(
                        LocalDateTime.of(2020,1,1,12,30,0),
                        LocalDateTime.of(2020,1,1,12,31,0)
                )
        );
        Money money = phone.calculate();
        System.out.println(money);
    }
}
