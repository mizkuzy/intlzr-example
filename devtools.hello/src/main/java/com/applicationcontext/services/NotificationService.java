package com.applicationcontext.services;

import org.springframework.stereotype.Service;

@Service("userNotificationService")
public class NotificationService {

    public NotificationService() {
    }

    public void send(){
        //nothing to do here
    }

    public void sendAsync(){
        //nothing to do here
    }

    @Override
    public String toString() {
        return "NotificationService{}";
    }
}
