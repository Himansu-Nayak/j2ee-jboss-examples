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
public class DelayTimer {

    final Logger logger = Logger.getLogger(DelayTimer.class.getCanonicalName());
    @Resource
    TimerService timerService;

    @PostConstruct
    private void init() {
        // delay 1 sec. subsequent execution 2 sec
        timerService.createTimer(1000, 2000, "Delay Timer");
    }

    @Timeout
    public void execute(Timer timer) {
        System.out.println("Timer Service : " + timer.getInfo());
        System.out.println("Current Time : " + new Date());
        System.out.println("Next Timeout : " + timer.getNextTimeout());
        System.out.println("Time Remaining : " + timer.getTimeRemaining());
    }

}