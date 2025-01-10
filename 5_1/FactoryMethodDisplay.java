public class FactoryMethodDisplay {

    public static AutomobileDisplay getAutomobileDisplay(String type) throws ExceptionInInitializerError {
        AutomobileDisplay display = null;
        switch (type) {
            case "Ford":
                display = new FordDisplay();
                break;

            case "Toyota":
                display = new ToyotaDisplay();
                break;
        }

        if (display == null) {
            throw new ExceptionInInitializerError();
        }

        return display;
    }
}