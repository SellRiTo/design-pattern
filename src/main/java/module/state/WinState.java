package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 22:56
 **/
public class WinState implements State{

    public static final Integer status = 3;
    private Product product;

    public WinState(Product product) {
        this.product = product;
    }

    public void insertCoins() {
        throw new IllegalStateException("已经投过币了");
    }

    public void turnCrank() {
        throw new IllegalStateException("请勿重复转动手柄");
    }

    public void saleProduct() {
        System.out.println("恭喜你,中奖了,奖品是发2件商品");
        product.reduce();
        if (!product.existStock()) {
            System.out.println("奖品已经告罄，请联系工作人员补发奖品");
            return;
        }
        product.reduce();
    }

    public void backCoins() {
        System.out.println("开始回退硬币");
    }
}
