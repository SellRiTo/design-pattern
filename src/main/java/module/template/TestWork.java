package module.template;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 21:19
 **/
public class TestWork extends Work {


    public TestWork(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("写测试用例-测试-上线");
    }
}
