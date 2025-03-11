public abstract class HomeDevice {
    protected HomeMediator mediator;
    protected String name;

    public HomeDevice(HomeMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}