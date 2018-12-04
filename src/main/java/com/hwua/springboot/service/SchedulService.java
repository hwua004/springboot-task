package com.hwua.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulService {
    @Scheduled(cron = "0/5 * * * * ?")
    public void analysis(){
        //每2s执行一次
        System.out.println("数据分析任务。。。");

    }
    // * * * 5 * ?

}
