/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.kinettik.mx.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kinettik.mx.pojo.Person;

public class UnnecessaryPerformanceImprovement {
    public static Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public void unnecesarySuperPerformingMethod() {
        Person p = new Person("My name");
        if (logger.isInfoEnabled()) {
            logger.info("Person is: " + p.toString());
            logger.info("Person is: ", p.toString());
        }
    }

    public void samePerformingMethod() {
        Person p = new Person("My name");
        logger.info("Person is: " + p);
    }

    public void betterPerformingMethod() {
        Person p = new Person("My name");
        logger.info("Person is: {}", p);
    }

    public static void main(String[] args) {
        UnnecessaryPerformanceImprovement perf = new UnnecessaryPerformanceImprovement();
        perf.unnecesarySuperPerformingMethod();
        perf.samePerformingMethod();
        perf.betterPerformingMethod();
    }
}
