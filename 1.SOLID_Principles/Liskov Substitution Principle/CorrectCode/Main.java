import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<PhoneLSP> phones = new ArrayList<>();
        phones.add(new DialPhone());
        phones.add(new SmartPhone());
        phones.add(new Iphone());
        phones.add(new Samsung());
        for(PhoneLSP phone: phones){
            phone.playGames();
        }
    }
}