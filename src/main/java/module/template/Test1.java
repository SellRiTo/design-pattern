package module.template;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 21:22
 **/
public class Test1 {

    public static void main(String[] args) {

        Work itWork= new ItWork("研发小唐");
        Work testWork= new TestWork("测试小诚");
        Work productWork= new ProductWork("产品小罗");
        itWork.workOneDay();
        testWork.workOneDay();
        productWork.workOneDay();
    }

}
