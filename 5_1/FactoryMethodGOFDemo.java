public class FactoryMethodGOFDemo {
    public static void main(String[] args) {
        // AutomobileDisplay myDisplay = new FordDisplay();
        // myDisplay.displayAutomobile();

        String target = "Ford";

        AutomobileDisplay display = FactoryMethodDisplay.getAutomobileDisplay(target);
        display.displayAutomobile();
    }
}
