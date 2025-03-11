public class HomeAutomationMediator implements HomeMediator {
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;
    private Alarm alarm;

    @Override
    public void notify(HomeDevice device, String event) {
        if (device instanceof Alarm && event.equals("start")) {
            System.out.println("Alarm is sending event to all...");
            sprinkler.doTask();
            coffeePot.doTask();
        } else if (event.equals("end")) {
            alarm.receiveEndEvent(device.getName());
        }
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }
}