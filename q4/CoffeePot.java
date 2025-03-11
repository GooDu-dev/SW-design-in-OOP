public class CoffeePot extends HomeDevice {
    public CoffeePot(HomeMediator mediator) {
        super(mediator, "Coffee Pot");
    }

    public void doTask() {
        System.out.println("I am coffe pot,... doing my task");
        mediator.notify(this, "end");
    }
}