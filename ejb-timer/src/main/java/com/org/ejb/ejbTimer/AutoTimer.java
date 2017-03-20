package com.org.ejb.ejbTimer;

import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.*;

/**
 * Created by ehimnay on 23/10/2015.
 */
@Singleton
@LocalBean
@Startup
public class AutoTimer {

    final Logger logger = Logger.getLogger(AutoTimer.class.getCanonicalName());

    @Schedule(second = "13,34,57", minute = "*", hour = "*")
    public void execute(Timer timer) {
        logger.info("Timer Service : " + timer.getInfo());
        logger.info("Current Time : " + new Date());
        logger.info("Next Timeout : " + timer.getNextTimeout());
        logger.info("Time Remaining : " + timer.getTimeRemaining());

        /*
         * System.out.println("Timer Service : " + timer.getInfo()); System.out.println("Current Time : " + new Date());
         * System.out.println("Next Timeout : " + timer.getNextTimeout()); System.out.println("Time Remaining : " +
         * timer.getTimeRemaining());
         */
    }

}