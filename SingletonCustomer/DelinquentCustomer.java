//make this class a subclass of customer
public class DelinquentCustomer extends Customer {

    // Complete this class
    @Override
    public String createMail() {
        // TODO Auto-generated method stub
        return this.getClass().getName();
    }

}
