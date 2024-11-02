import java.util.*;
public class Samsung implements Product{
    Set<ProductObserver> userList;
    String productName;
    int count = 0;

    public Samsung(){
        userList = new HashSet<>();
        productName = "Samsung";
    }

    @Override
    public void addUser(ProductObserver user) {
        userList.add(user);
    }

    @Override
    public void removeUser(ProductObserver user) {
        if(userList.contains(user)){
            userList.remove(user);
            user.update(productName, "was removed from your waiting list");
        }

            
    }

    @Override
    public void notifyUser() {
        if(this.count != 0)
            for(ProductObserver po: userList)
                po.update(productName, " is avaible");

        
    }

    public void setCount(int value){
        if(this.count == 0 && value != 0){
            this.count = value;
            notifyUser();
        }

        this.count += value;

    }
    
    
}
