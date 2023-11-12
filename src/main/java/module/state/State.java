package module.state;

public interface State {


    /***
    * @Description:
    * @Param: 投币
    * @return:
    */
    void insertCoins();


    /***
    * @Description:
    * @Param: 转动手柄
    * @return:
    */
    void turnCrank();


    /***
    * @Description:
    * @Param: 出售商品
    * @return:
    */
    void saleProduct();


    /***
    * @Description: 
    * @Param: 回退币
    * @return: 
    */
    void backCoins();

}
