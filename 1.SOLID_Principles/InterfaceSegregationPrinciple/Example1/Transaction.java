package Example1;
public class Transaction {
    private int amount;
    private String name;

    Transaction(int amount, String name){
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }
    
    public String getName() {
        return name;
    }
}
