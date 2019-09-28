package refactoring;

import l3.Call;
import l3.Money;

public interface Calculate {
    Money calculate(Call call, Money result);
}
