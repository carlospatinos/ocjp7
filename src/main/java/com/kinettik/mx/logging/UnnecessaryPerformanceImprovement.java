
package com.kinettik.mx.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kinettik.mx.pojo.Person;

public class UnnecessaryPerformanceImprovement {
    public static Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public void avoidThisLogging() {
        final Person p = new Person("My name");
        logger.info("Person is: " + p.toString());
        logger.info("Person is: {}", p.toString());
    }

    public void avoidThisLoggingToo() {
        final Person p = new Person("My name");
        if (logger.isInfoEnabled()) { // At least we are doing this
            logger.info("Person is: " + p.toString());
            logger.info("Person is: {}", p.toString());
        }
    }

    public void doItLikeThis() {
        final Person p = new Person("My name");
        logger.info("Person is: {}", p);
    }

    public static void main(final String[] args) {
        final UnnecessaryPerformanceImprovement perf = new UnnecessaryPerformanceImprovement();
        perf.avoidThisLogging();
        perf.doItLikeThis();
    }
}
