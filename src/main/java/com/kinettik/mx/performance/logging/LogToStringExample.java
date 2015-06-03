
package com.kinettik.mx.performance.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogToStringExample {
    public static Logger log = LoggerFactory.getLogger(LogToStringExample.class);

    public static void main(final String args[]) {
        long i = 0;

        long start = System.currentTimeMillis();
        while (true) {
            i++;
            final NodeWithToString node = new NodeWithToString("Name", "Ip", i);
            log.debug("Object is : {}", node);
            if (i == 1000000000) {
                try {
                    final long end = System.currentTimeMillis();
                    System.out.println("Difference in mili seconds: " + (end - start));
                    Thread.sleep(1000);
                    start = System.currentTimeMillis();
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
                i = 0;
            }
        }
    }
}
