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
    /**
     * 10초당 5원씩 부과되는 요금제에 가입한 사용자가 각각 1분 동안 두 번 통화를 한 경우의 통화 요금을 계산하는 방법
     */
    @Test
    public void test1() {
        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10), 0.5);
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
        Money result = phone.calculate();
        System.out.println(result);
    }
}
