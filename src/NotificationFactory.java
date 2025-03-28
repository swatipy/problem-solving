public class NotificationFactory {

    public Notification getInstance(String str){
        if(str.equals("SMS"))
            return new SMSNotification();
        else if(str.equals("Push"))
            return new PushNotification();
       else
            return new EmailNotification();


    }
}
