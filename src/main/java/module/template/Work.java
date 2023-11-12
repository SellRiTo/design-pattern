package module.template;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 21:12
 **/
public abstract class Work {


    private String name;

    public Work(String name) {
        this.name = name;
    }

    public final void workOneDay() {

        enterCompany();
        openComputer();
        work();
        closeComputer();
        leaveCompany();

    }



    private void enterCompany() {
        System.out.println(this.name + "进入了公司");
    }

    private void openComputer() {
        System.out.println(this.name + "打开了电脑");
    }

    protected abstract void work();

    private void closeComputer() {
        System.out.println(this.name + "关闭了电脑");
    }

    private void leaveCompany() {
        System.out.println(this.name +"离开了公司");
    }


}
