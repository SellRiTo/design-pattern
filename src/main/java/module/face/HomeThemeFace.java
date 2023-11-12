package module.face;

/**
 * @program: design-pattern
 * @description:
 * @author: SellRiTo
 * @create: 2023-11-06 00:00
 **/
public class HomeThemeFace {

    private Projector projector;
    private Audio audio;
    private Light light;

    public HomeThemeFace(Projector projector,Audio audio,Light light) {
        this.projector = projector;
        this.audio = audio;
        this.light = light;
    }

    public void startShow() {
        projector.turnOn();
        audio.turnOn();
        light.turnOn();
    }

    public void closeShow() {
        projector.turnOff();
        audio.turnOff();
        light.turnOff();
    }

}
