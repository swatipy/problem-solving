package com.codes.common;

public class PushNotification implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("Push");
    }
}
