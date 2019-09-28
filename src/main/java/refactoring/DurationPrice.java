package refactoring;

import l3.Call;
import l3.Money;


public class DurationPrice implements Calculate {
    private DurationPriceRule durationPriceRule;

    public DurationPrice(DurationPriceRule durationPriceRule) {
        this.durationPriceRule = durationPriceRule;

    }

    @Override
    public Money calculate(Call call, Money result) {
        DurationPriceRule target = this.durationPriceRule;
        do {
            result = result.plus(target.calculate(call.getDuration()));
            target = target.getPrev();
        } while (target != null);
        return result;
    }
}
