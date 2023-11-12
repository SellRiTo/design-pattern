package module.decorator;

import java.math.BigDecimal;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-05 21:18
 **/
public class SimpleCoffer implements Coffer{


    @Override
    public BigDecimal cost() {
        return new BigDecimal("2.00");
    }

    @Override
    public String getDesc() {
        return "咖啡";
    }
}
