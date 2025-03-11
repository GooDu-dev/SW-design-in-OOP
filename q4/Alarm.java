public class Alarm extends HomeDevice {
    public Alarm(HomeMediator mediator) {
        super(mediator, "Alarm");
    }

    public void doAlarm() {
        mediator.notify(this, "start");
    }

    public void receiveEndEvent(String from) {
        System.out.println("Alarm event ended from " + from);
    }
}