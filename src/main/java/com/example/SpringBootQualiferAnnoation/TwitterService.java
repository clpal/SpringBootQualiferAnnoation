package com.example.SpringBootQualiferAnnoation;

public class TwitterService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
