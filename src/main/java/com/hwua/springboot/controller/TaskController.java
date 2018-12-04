package com.hwua.springboot.controller;

import com.hwua.springboot.service.AsyncService;
import com.hwua.springboot.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskController {
    @Autowired
    private AsyncService asyncService;
    @Autowired
    private MailService mailService;

    @RequestMapping("/demo1")
    @ResponseBody
    public String msgSend(){
        asyncService.msgSend("注册成功！");
        return "success";
    }


    @RequestMapping("/sendMail")
    @ResponseBody
    public String sendMail(){
        mailService.sendMail("这是我的求职简历，请您查收");
        return "mail send success";
    }


}
