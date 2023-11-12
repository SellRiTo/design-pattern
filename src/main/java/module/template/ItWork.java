package module.template;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 21:19
 **/
public class ItWork extends Work {


    public ItWork(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("开始技术设计-编码-提测");
    }
}
