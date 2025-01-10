package Customer;
//make this class a subclass of customer

public class RegularCustomer extends Customer {
    @Override
    public String createMail() {
        return "Regular Customer";
    }

    @Override
    public void receiveBrochure(String content) {
        System.out.println(content);
        return;
    }
}
