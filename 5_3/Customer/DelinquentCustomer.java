package Customer;
//make this class a subclass of customer

public class DelinquentCustomer extends Customer {
    @Override
    public String createMail() {
        return "Delinquent Customer";
    }

    @Override
    public void receiveBrochure(String content) {
        System.out.println(content);
        return;
    }
}
