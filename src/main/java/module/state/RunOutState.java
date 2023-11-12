package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 22:27
 **/
public class RunOutState implements State{


    public void insertCoins() {
        throw new IllegalStateException("商品已经告罄,请勿投币");
    }

    public void turnCrank() {
        throw new IllegalStateException("商品已经告罄,请勿转动手柄了");
    }

    public void saleProduct() {
        throw new IllegalStateException("商品已经告罄");
    }

    public void backCoins() {
        throw new IllegalStateException("请确认是否已经投币");
    }
}
