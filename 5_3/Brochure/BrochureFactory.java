package Brochure;

import Customer.Customer;
import Customer.DelinquentCustomer;
import Customer.MountainCustomer;
import Customer.RegularCustomer;

public class BrochureFactory {
    public static String GetBrochure(Customer customer) {
        String content = null;
        if (customer instanceof DelinquentCustomer) {
            content = "Delinquent Customer Brochure";
        } else if (customer instanceof RegularCustomer) {
            content = "Regular Customer Brochure";
        } else if (customer instanceof MountainCustomer) {
            content = "Mountain Customer Brochure";
        }

        return content;
    }
}