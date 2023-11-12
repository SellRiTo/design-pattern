package module.decorator;

import java.math.BigDecimal;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-05 21:27
 **/
public class SugarDecorator implements Coffer {

    private Coffer coffer;

    public SugarDecorator(Coffer coffer) {
        this.coffer = coffer;
    }

    @Override
    public BigDecimal cost() {
        return coffer.cost().add(new BigDecimal("2.00"));
    }

    @Override
    public String getDesc() {
        return coffer.getDesc()+",焦糖";
    }
}
