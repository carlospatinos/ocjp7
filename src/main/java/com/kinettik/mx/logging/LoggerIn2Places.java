
package com.kinettik.mx.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerIn2Places {
    final Logger log = LoggerFactory.getLogger(LoggingExample.class);

    public void test() {
        final Logger log = LoggerFactory.getLogger(LoggingExample.class);
        log.error("Test");
        // log2.error("Second test");
    }

    public static void main(final String[] args) {
        final LoggerIn2Places l = new LoggerIn2Places();
        l.test();
    }
}
