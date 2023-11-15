package module.builder;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 15:25
 */
public interface ComputeBuilder {

    /**
     * 构建cpu
     */
    ComputeBuilder buildCpu();

    /**
     * 构建内存
     */
    ComputeBuilder buildMemory();

    /**
     * 构建磁盘
     */
    ComputeBuilder buildDisk();

    /**
     * 构建对象
     * @return
     */
    Compute build();
}
