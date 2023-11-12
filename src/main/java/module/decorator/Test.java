package module.decorator;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-05 21:37
 **/
public class Test {

    public static void main(String[] args) {

        Coffer coffer = new SugarDecorator(new MilkDecorator(new SimpleCoffer()));
        System.out.println(coffer.cost());
        System.out.println(coffer.getDesc());
    }
}
