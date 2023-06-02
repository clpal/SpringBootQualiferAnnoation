package com.example.SpringBootQualiferAnnoation;

public class SMSService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
