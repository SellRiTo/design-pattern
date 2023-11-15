package module.clone;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 16:14
 */
public class Cat extends Amimal{

    private String color;

    private String sex;

    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Cat(String color, String sex) {
        this.color = color;
        this.sex = sex;
    }

    public void catchMouse() {
        System.out.println("我是猫,我开始抓老鼠了"
        );
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
