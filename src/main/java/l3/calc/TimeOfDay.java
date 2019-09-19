package l3.calc;

import l3.Calc;
import l3.Call;
import l3.Money;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TimeOfDay extends Calc {
    private final Money basePrice;
    private final Duration duration;
    private final List<LocalTime> starts = new ArrayList<>();
    private final List<LocalTime> ends = new ArrayList<>();
    private final List<Duration> durations = new ArrayList<>();
    private final List<Money> prices = new ArrayList<>();

    public TimeOfDay(Money basePrice, Duration duration) {
        this.basePrice = basePrice;
        this.duration = duration;
    }

    @Override
    protected Money calculate(Set<Call> calls, Money result) {
        Money sum = Money.ZERO;
        for(Call call: calls) {
            for (DateTimeInterval interval: call.splitByDay()) {

            }
        }
        return result.plus(sum);
    }
}
