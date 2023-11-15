package module.clone;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 16:17
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat whiteCat = new Cat("白色", "母猫");
        Cat blackCat = new Cat("黑色", "公猫");
        System.out.println("whiteCat:"+whiteCat);

        Cat cloneWhite = (Cat) whiteCat.clone();
        cloneWhite.setNum("1");
        System.out.println("cloneWhite:"+cloneWhite);


        Cat clone2White = (Cat) whiteCat.clone();
        System.out.println("clone2White:"+clone2White);

        clone2White.setNum("2");
        System.out.println("clone2White:"+clone2White);


        Cat blackClone = (Cat) blackCat.clone();
        System.out.println("blackClone:"+blackClone);
    }
}
