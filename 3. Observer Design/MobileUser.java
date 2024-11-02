public class MobileUser implements ProductObserver{
    String userName;
    Product product;
    
    public MobileUser(String userName, Product product){
        this.userName = userName;
        this.product = product;
    }


    @Override
    public void update(String productName, String message) {
        System.out.println( "Hello " + userName + ",your " +productName + message);
    }
    
}
