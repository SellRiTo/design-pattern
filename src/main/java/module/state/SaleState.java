package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 22:27
 **/
public class SaleState implements State{

    public static final Integer status = 2;
    private Product product;


    public SaleState(Product product) {
        this.product = product;
    }

    public void insertCoins() {
        throw new IllegalStateException("已经投过币了");
    }

    public void turnCrank() {
        throw new IllegalStateException("正在出商品，请勿重复转动手柄");
    }

    public void saleProduct() {
        System.out.println("开始出商品");
        product.reduce();
    }

    public void backCoins() {
        System.out.println("开始回退金币");
    }
}
