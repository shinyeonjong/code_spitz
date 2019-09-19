package l3.calc;

import l3.Money;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class DayPrice {
    private final Money price;
    private final Duration duration;
    private final Set<DayOfWeek> dayOfWeeks = new HashSet<>();

    public DayPrice(Money price, Duration duration) {
        this.price = price;
        this.duration = duration;
    }

    public Money calculate(DateTimeInterval[] intervals) {
        Money sum = Money.ZERO;
        return sum;
    }
}
