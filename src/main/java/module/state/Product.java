package module.state;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-12 23:42
 **/
public class Product {

    private Integer count;

    public Product(Integer count) {
        this.count = count;
    }

    public void reduce()  {
        if (count == 0) {
            System.out.println("商品数量为0");
            return;
        }
        count = count -1;
    }

    public Boolean existStock() {
        return count > 0 ? Boolean.TRUE : Boolean.FALSE;
    }
}
