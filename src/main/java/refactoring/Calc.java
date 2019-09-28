package refactoring;

import l3.Call;
import l3.Money;

import java.util.Set;

public class Calc {
    private Calculate calculate;

    public Calc(Calculate calculate) {
        this.calculate = calculate;
    }

    public Money calculate(Set<Call> calls, Money result) {
        Money sum = Money.ZERO;
        for (Call call : calls) {
            sum = this.calculate.calculate(call, result);
        }
        return result.plus(sum);
    }
}
