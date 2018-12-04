package com.hwua.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSenderImpl mailSender;

    @Async
    public void sendMail(String content){
        SimpleMailMessage message=
                new SimpleMailMessage();
        message.setTo("1025986877@qq.com");
        message.setSubject("求职简历");
        message.setFrom("hwua2018@126.com");
        message.setText(content);
        mailSender.send(message);
    }
}
