public class Push implements NotificationService {
    String type = "PUSH";

    @Override
    public void sendMessage(String message){
        System.out.println(this.type + " has been sent.");
        System.out.println(message);
    }
}
