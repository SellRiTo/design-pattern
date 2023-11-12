package module.state;

import java.util.Random;

/**
 * @program: design-pattern
 * @description: 游戏机
 * @author: SellRiTo
 * @create: 2023-11-12 22:28
 **/
public class VendingMachine {

    /***
    * @Description:
    * @Param: 当前状态
    * @return:
    */
    private State state;


    private Product product;


    public VendingMachine(Product product) {
        this.product = product;
        this.state = new NoCoinState();
    }


    /***
     * @Description:
     * @Param: 投币
     * @return:
     */
    public void insertCoins() {
        checkState();
        this.state.insertCoins();
        setState(new HasCoinState());
    }


    /***
     * @Description:
     * @Param: 转动手柄
     * @return:
     */
    public void turnCrank(){
        checkState();
        state.turnCrank();
        Random random = new Random(10);
        int num = random.nextInt();
        if (num == 0) {
            state = new WinState(product);
        } else {
            state = new SaleState(product);
        }
    }


    /***
     * @Description:
     * @Param: 出售商品
     * @return:
     */
    public void saleProduct(){
        checkState();
        state.saleProduct();
        if (!product.existStock()) {
            state = new RunOutState();
        } else {
            state = new NoCoinState();
        }
    }

    /***
     * @Description:
     * @Param: 回退币
     * @return:
     */
    public void backCoins(){
        checkState();
        state.backCoins();
        state = new NoCoinState();
    }



    public void setState(State state) {
        this.state = state;
    }

    public void checkState() {
        if ( !product.existStock()) {
            this.state = new RunOutState();
        }
    }
}
