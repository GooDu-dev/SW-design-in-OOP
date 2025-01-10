package Customer;

public class CustomerMailFactory {
    public static Customer createCustomer(String type) throws ExceptionInInitializerError {
        Customer output = null;
        switch (type) {
            case "Regular":
                output = new RegularCustomer();
                break;
            case "Mountain":
                output = new MountainCustomer();
                break;
            case "Delinquent":
                output = new DelinquentCustomer();
                break;
        }

        if (output == null) {
            throw new ExceptionInInitializerError();
        }

        return output;
    }
}