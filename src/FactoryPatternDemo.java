public class FactoryPatternDemo {


    public static void main(String args[])
    {
        //Notification n=new SMSNotification();

        NotificationFactory nf=new NotificationFactory();
        Notification o=nf.getInstance("SMS");
        o.sendMessage();

    }}
