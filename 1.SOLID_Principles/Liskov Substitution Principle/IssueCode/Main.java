public class Main {
    public static void main(String[] args){
        Phone phone = new DialPhone();
        phone.playGames();
        System.out.println(phone.displayTouchFeatures());
        phone = new SmartPhone();
        phone.playGames();

        System.out.println(phone.displayTouchFeatures());

    }
}