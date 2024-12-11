
public class Email implements NotificationService {
    String type = "EMAIL";

    @Override
    public void sendMessage(String message){
        System.out.println(this.type + " has been sent.");
        System.out.println(message);
    }
}
