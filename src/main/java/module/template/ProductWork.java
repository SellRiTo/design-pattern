package module.template;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 21:19
 **/
public class ProductWork extends Work {


    public ProductWork(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("需求调研-设计原型-需求评审");
    }
}
