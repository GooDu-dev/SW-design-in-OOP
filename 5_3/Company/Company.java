package Company;

import java.io.NotActiveException;

import Brochure.BrochureFactory;
import Customer.Customer;

public class Company implements ICompany {
    @Override
    public String sendBrochure(Customer customer) throws NotActiveException {
        // TODO Auto-generated method stub
        String content = BrochureFactory.GetBrochure(customer);

        if (content.isEmpty()) {
            throw new NotActiveException();
        }

        customer.receiveBrochure(content);

        return content;
    }
}
