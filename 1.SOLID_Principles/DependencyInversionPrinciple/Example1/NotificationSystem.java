import java.util.Scanner;

public class NotificationSystem{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String Message = in.nextLine();
        String type = in.nextLine().toUpperCase();
        NotificationFactory notificationFactory = new NotificationFactory();
        NotificationService ns = notificationFactory.getNotificationService(type);
        ns.sendMessage(Message);
        in.close();
      

       
        
    }

}