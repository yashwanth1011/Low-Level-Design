/* Exercise: Notification System
Scenario:
You are tasked with designing a notification system for a mobile app. Initially, the app only supports sending Email Notifications.

Requirements:
Define a system that sends notifications.
Currently, the only notification type is Email.
In the future, new types of notifications, such as SMS and Push Notifications, will need to be added.
Ensure that the system adheres to the Open-Closed Principle so that you can add support for new notification types without modifying existing code. 
*/

import java.util.Scanner;
interface Notifications{
    void sendMessage( String message); 
    String getType();
}

class Email implements Notifications{
    private String type;
    Email(){
        this.type = "Email ";
    }

    @Override
    public void sendMessage( String message) {
        System.out.println(message + "\n\n");
        
    }

    @Override
    public String getType(){
        return this.type;
    }
    
}

class SMS implements Notifications{
    private String type;
    SMS(){
        this.type = "SMS ";
    }

    @Override
    public void sendMessage( String message) {
        System.out.println(message  + "\n");
        
    }

    @Override
    public String getType(){
        return this.type;
    }
    
}

class Push implements Notifications{
    private String type;
    Push(){
        this.type = "Push Notifications ";
    }

    @Override
    public void sendMessage( String message) {
        System.out.println(message + "\n\n");
        
    }

    @Override
    public String getType(){
        return this.type;
    }
    
}

enum NotificationType{
    EMAIL, SMS, PUSH;   
}

class NotificationFactory{
    public Notifications getNotificationType(NotificationType type){
        switch(type){
            case EMAIL : return new Email();
            case SMS: return new SMS();
            case PUSH : return new Push();
            default : return null;
        }

    }
}

public class SimpleNotificationSender{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String type = in.next().toUpperCase();

        NotificationFactory notificationFactory = new NotificationFactory();
        Notifications notificationType = notificationFactory.getNotificationType(NotificationType.valueOf(type));
        if(notificationType != null ){
            String message = notificationType.getType() + "has been sent.\nMessage Body: You have 20% off next time you shop."; 
            notificationType.sendMessage(message);
        }
        else{
            System.out.println("Enter correct notification type.");
        }
        in.close();
    }
}
