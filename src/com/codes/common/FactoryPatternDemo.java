package com.codes.common;

public class FactoryPatternDemo {


    public static void main(String args[]) {
        //com.codes.common.Notification n=new com.codes.common.SMSNotification();

        NotificationFactory nf = new NotificationFactory();
        Notification o = nf.getInstance("SMS");
        o.sendMessage();

    }
}
