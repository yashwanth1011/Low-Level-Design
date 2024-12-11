public class NotificationFactory {
    NotificationService getNotificationService(String type){
        NotificationType notificationType = NotificationType.valueOf(type);
        switch(notificationType){
            case EMAIL: return new Email();
            case SMS : return new SMS();
            case PUSH : return new Push();
            default : return null;    
        }  
    }
}
