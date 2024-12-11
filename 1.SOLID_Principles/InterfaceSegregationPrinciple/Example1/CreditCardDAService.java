package Example1;
import java.util.List;
import java.util.ArrayList;
public class CreditCardDAService  implements TransactionDAService{
    List<Customer> customers;
    CreditCardDAService(){
       this.customers = new ArrayList<>();
    }
    @Override
    public void AddCustomer(Customer customer){
        customers.add(customer);

    }

    @Override
    public List<Customer> getCustomerList() {
        return customers;
    }
    
}
