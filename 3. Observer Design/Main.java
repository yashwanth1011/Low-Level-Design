public class Main{
    public static void main(String[] args){
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        ProductObserver User1 = new MobileUser("User 1", iphone);
        ProductObserver User2 = new MobileUser("User 2", samsung);
        ProductObserver User3 = new MobileUser("User 3", iphone);

        iphone.addUser(User1);
        iphone.addUser(User3);
        samsung.addUser(User2);

        System.out.println("Adding New Iphones");
        iphone.setCount(3);

        System.out.println("Adding New Samsung  Mobile");
        samsung.setCount(4);

        System.out.println("Adding New Iphones");
        iphone.setCount(5);

        System.out.println("Adding New Samsung  Mobile");
        samsung.setCount(7);


    }
}