package com.youhujia.slf4j;

import org.junit.Test;


/**
 * Created by clove on 2017/1/18.
 */
public class Demo {

//    final Logger logger = LoggerFactory.getLogger(getClass());
    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) {

        oldT = t;
        t = temperature;

//        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

        if (temperature.intValue() > 50) {
//            logger.info("Temperature has risen above 50 degrees.");
        }
    }

    @Test
    public void test1() {

        Demo demo = new Demo();
        demo.setTemperature(51);

    }
}
