public class Sprinkler extends HomeDevice {
    public Sprinkler(HomeMediator mediator) {
        super(mediator, "Sprinkler");
    }

    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.notify(this, "end");
    }
}
