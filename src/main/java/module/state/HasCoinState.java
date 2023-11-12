package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 22:27
 **/
public class HasCoinState implements State{


    public void insertCoins() {
        throw new IllegalStateException("已经投过币了");
    }

    public void turnCrank() {
        System.out.println("转动手柄,开始出商品");
    }

    public void saleProduct() {
        throw new IllegalStateException("请先转动手柄");
    }

    public void backCoins() {
        System.out.println("开始回退硬币");
    }
}
