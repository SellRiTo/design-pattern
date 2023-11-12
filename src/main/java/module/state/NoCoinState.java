package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 22:27
 **/
public class NoCoinState  implements State{


    public void insertCoins() {
        System.out.println("开始投币");
    }

    public void turnCrank() {
        throw new IllegalStateException("没有投币不能转动游戏机");
    }

    public void saleProduct() {
        throw new IllegalStateException("没有投币不能出商品");
    }

    public void backCoins() {
        throw new IllegalStateException("没有投币不能退币");
    }
}
