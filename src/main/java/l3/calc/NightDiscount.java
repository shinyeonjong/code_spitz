package l3.calc;

import l3.Calc;
import l3.Call;
import l3.Money;

import java.time.Duration;
import java.util.Set;

public class NightDiscount extends Calc {
    private final Money dayPrice;
    private final Money nightPrice;
    private final Duration second;
    public NightDiscount(Money dayPrice, Money nightPrice, Duration second){
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
        this.second = second;
    }
    @Override
    final protected Money calculate(Set<Call> calls, Money result) {
        for(Call call:calls){
            Money price = call.getFrom().getHour() >= 22 ? nightPrice : dayPrice;
            result = result.plus(price.times((call.getDuration().getSeconds() / second.getSeconds())));
        }
        return result;
    }
}