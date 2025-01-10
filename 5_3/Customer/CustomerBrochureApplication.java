package Customer;

import java.io.NotActiveException;
import java.util.Scanner;

import Company.Company;

public class CustomerBrochureApplication {

    private Customer customer;
    private static Company company = null;

    public CustomerBrochureApplication(Customer customer) {
        this.customer = customer;
        if (company == null) {
            CustomerBrochureApplication.company = new Company();
        }
    }

    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }

    public String generateBrochure() {
        try {
            return CustomerBrochureApplication.company.sendBrochure(this.customer);
        } catch (NotActiveException e) {
            return String.format("%s: %s", e.getClass(), e.getMessage());
        }
    }

    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        Customer customer = CustomerMailFactory.createCustomer(customerType);
        CustomerBrochureApplication app = new CustomerBrochureApplication(customer);
        System.out.println(app.generateBrochure());
    }
}
