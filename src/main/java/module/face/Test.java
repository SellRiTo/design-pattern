package module.face;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-06 00:04
 **/
public class Test {

    public static void main(String[] args) {

        HomeThemeFace homeThemeFace = new HomeThemeFace(new Projector(), new Audio(), new Light());
        homeThemeFace.startShow();
        homeThemeFace.closeShow();

    }
}
