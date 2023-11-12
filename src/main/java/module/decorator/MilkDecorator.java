package module.decorator;

import java.math.BigDecimal;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-05 21:25
 **/
public class MilkDecorator implements Coffer{


    private Coffer coffer;

    public MilkDecorator(Coffer coffer) {
        this.coffer = coffer;
    }

    @Override
    public BigDecimal cost() {
        return coffer.cost().add(new BigDecimal("3.00"));
    }

    @Override
    public String getDesc() {
        return coffer.getDesc()+",牛奶";
    }
}
