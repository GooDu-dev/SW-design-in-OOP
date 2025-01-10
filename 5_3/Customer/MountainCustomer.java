package Customer;
//make this class a subclass of customer

public class MountainCustomer extends Customer {
    @Override
    public String createMail() {
        return "Mountain Customer";
    }

    @Override
    public void receiveBrochure(String content) {
        System.out.println(content);
        return;
    }
}
