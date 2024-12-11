package Example1;

import java.util.List;
import java.util.ArrayList;
public class Customer {
    String name;
    List<Transaction> transactions;

    Customer(String name){
        this.name = name;
        transactions = new ArrayList<>();
    }

    String getName(){
        return this.name;
    }

    List<Transaction> getTransactionsList(){
        return this.transactions;
    }


    void addTransaction(String name, int amount){
        transactions.add(new Transaction(amount, name));
    }

    
}
