package module.clone;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 16:13
 */
public class Amimal implements Cloneable{

    public void makeSound() {
        System.out.println("Amimal sound  sound");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
