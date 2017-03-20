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
public class ScheduleExpressionTimer {

    final Logger logger = Logger.getLogger(ScheduleExpressionTimer.class.getCanonicalName());
    @Resource
    TimerService timerService;

    @PostConstruct
    private void init() {
        ScheduleExpression schedule = new ScheduleExpression();
        schedule.hour("*").minute("*").second("13,34,57");
        TimerConfig timerConfig = new TimerConfig();
        timerConfig.setInfo("Cron Job Timer");
        timerService.createCalendarTimer(schedule, timerConfig);
    }

    @Timeout
    public void execute(Timer timer) {
        System.out.println("Timer Service : " + timer.getInfo());
        System.out.println("Current Time : " + new Date());
        System.out.println("Next Timeout : " + timer.getNextTimeout());
        System.out.println("Time Remaining : " + timer.getTimeRemaining());
    }

}