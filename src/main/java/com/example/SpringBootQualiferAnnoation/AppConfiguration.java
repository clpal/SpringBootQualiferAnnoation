package com.example.SpringBootQualiferAnnoation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.SpringBootQualiferAnnoation")
public class AppConfiguration {
    @Bean(name ="emailService" )
    public MessageService emailService(){
        return  new EmailService();
    }
    @Bean(name = "twitterService")
    public MessageService twitterService(){
        return  new TwitterService();
    }
    @Bean(name = "sMSService")
    public MessageService sMSService(){
        return  new SMSService();
    }
@Bean
    MessageProcessor messageProcessor(){
        return new MessageProcessorImpl(twitterService());

}
}
