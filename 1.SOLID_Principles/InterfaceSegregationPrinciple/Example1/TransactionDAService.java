package Example1;

import java.util.List;


public interface TransactionDAService { 
    void AddCustomer(Customer customer);
    List<Customer> getCustomerList();
}