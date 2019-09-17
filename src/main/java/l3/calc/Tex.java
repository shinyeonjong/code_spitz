package l3.calc;

import l3.Calc;
import l3.Call;
import l3.Money;

import java.util.Set;

public class Tex extends Calc {
    private final double ratio;
    public Tex(double ratio){
        this.ratio = ratio;
    }
    @Override
    final protected Money calculate(Set<Call> calls, Money result) {
        return result.plus(result.times(ratio));
    }
}
