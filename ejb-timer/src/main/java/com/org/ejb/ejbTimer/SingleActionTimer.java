package com.org.ejb.ejbTimer;

import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.*;

/**
 * Created by ehimnay on 23/10/2015.
 */
@Singleton
@LocalBean
@Startup
public class SingleActionTimer {

    final Logger logger = Logger.getLogger(SingleActionTimer.class.getCanonicalName());
    @Resource
    TimerService timerService;

    @PostConstruct
    private void init() {
        TimerConfig timerConfig = new TimerConfig();
        System.out.println("Creation Time : " + System.currentTimeMillis());
        timerService.createSingleActionTimer(5000, timerConfig);
    }

    @Timeout
    public void execute(Timer timer) {
        System.out.println("Timer Service : " + timer.getInfo());
        System.out.println("Execution Time : " + new Date());
    }

}