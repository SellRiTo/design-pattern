package module.builder;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 15:33
 */
public class HighComputeBuilder implements ComputeBuilder{

    private Compute compute;

    public HighComputeBuilder() {
        this.compute = new Compute();
    }

    public ComputeBuilder buildCpu() {
         compute.setCpu("高配置CPU");
         return this;
    }

    public ComputeBuilder buildMemory() {
        compute.setMemory("高配置运行内存");
        return this;
    }

    public ComputeBuilder buildDisk() {
        compute.setDisk("高配置磁盘空间");
        return this;
    }

    public Compute build() {
        return compute;
    }
}
