package com.youhujia.slf4j;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * Created by clove on 2017/1/18.
 */
public class Log4jDemo {

    private static Logger logger = Logger.getLogger(Log4jDemo.class);

    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) throws Exception {

        oldT = t;
        t = temperature;

        if (logger.isInfoEnabled()) {
            logger.debug("ddd");

            if (temperature.intValue() > 50) {
                logger.info("Temperature has risen above 50 degrees.");
            }
            throw new Exception("throw exception by myself");
        }
    }

    @Test
    public void Log4j() {

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");


        Log4jDemo demo = new Log4jDemo();
        try {
            if (logger.isDebugEnabled()) {
                demo.setTemperature(51);
            }
        } catch (Exception e) {
            logger.debug(e.getMessage(), e);
        }
    }


}
