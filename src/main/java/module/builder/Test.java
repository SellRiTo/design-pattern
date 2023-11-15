package module.builder;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 15:41
 */
public class Test {

    public static void main(String[] args) {

        HighComputeBuilder highComputeBuilder = new HighComputeBuilder();
        Compute highCompute = Director.build(highComputeBuilder);
        System.out.println("highComputeBuilder:"+highCompute.toString());


        SimpleComputeBuilder simpleComputeBuilder = new SimpleComputeBuilder();
        Compute simpleCompute = Director.build(simpleComputeBuilder);
        System.out.println("simpleCompute:"+simpleCompute.toString());

    }
}
