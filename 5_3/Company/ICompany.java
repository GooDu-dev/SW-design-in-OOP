package Company;

import java.io.NotActiveException;

import Customer.Customer;

public interface ICompany {
    public abstract String sendBrochure(Customer customer) throws NotActiveException;
}
