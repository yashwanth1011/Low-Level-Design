public class SMS implements NotificationService {
    String type = "SMS";
    @Override
    public void sendMessage(String message){
        System.out.println(this.type + " has been sent.");
        System.out.println(message);
    }
}
