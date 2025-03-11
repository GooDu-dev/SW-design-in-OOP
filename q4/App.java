public class App {
    public static void main(String[] args) {
        // Create the mediator
        HomeAutomationMediator mediator = new HomeAutomationMediator();

        // Create the devices with mediator
        Sprinkler sprinkler = new Sprinkler(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);
        Alarm alarm = new Alarm(mediator);

        // Register devices with mediator
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);
        mediator.setAlarm(alarm);

        // Start the alarm
        alarm.doAlarm();
    }
}