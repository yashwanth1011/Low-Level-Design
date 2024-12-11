package Example1;

public class PaymentSystem {
    public static void main(String[] args) {

        CreditCardDAService creditCardDA = new CreditCardDAService();
        Customer c1 = new Customer("yashwanth");
        c1.addTransaction("book", 100);
        c1.addTransaction("wallet", 100);


        creditCardDA.AddCustomer(c1);
        
    }
    
}
