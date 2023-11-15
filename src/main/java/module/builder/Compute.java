package module.builder;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @author tangxianrui
 * @version 1.0
 * @date 2023/11/14 15:26
 */
public class Compute {

    private String cpu;

    private String memory;

    private String disk;

    public Compute() {
    }

    @Override
    public String toString() {
        return cpu + "," + memory +","+disk;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getDisk() {
        return disk;
    }
}
