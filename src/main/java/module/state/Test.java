package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-13 00:09
 **/
public class Test {

    public static void main(String[] args) {

        System.out.println("开始第一轮出游戏");
        Product product = new Product(3);
        VendingMachine vendingMachine = new VendingMachine(product);
        vendingMachine.insertCoins();
        vendingMachine.turnCrank();
        vendingMachine.saleProduct();
        System.out.println("结束第一轮出游戏");


        System.out.println("开始第二轮出游戏");
        vendingMachine.insertCoins();
        vendingMachine.turnCrank();
        vendingMachine.saleProduct();
        System.out.println("结束第二轮出游戏");


        System.out.println("开始第三轮出游戏");
        vendingMachine.insertCoins();
        vendingMachine.turnCrank();
        vendingMachine.backCoins();
        System.out.println("结束第三轮出游戏");


        System.out.println("开始第四轮出游戏");
        vendingMachine.insertCoins();
        vendingMachine.turnCrank();
        vendingMachine.saleProduct();
        System.out.println("结束第四轮出游戏");



        System.out.println("开始第五轮出游戏");
        vendingMachine.insertCoins();
        vendingMachine.turnCrank();
        vendingMachine.saleProduct();
        System.out.println("结束第五轮出游戏");

    }
}
