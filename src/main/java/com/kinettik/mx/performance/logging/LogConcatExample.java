
package com.kinettik.mx.performance.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogConcatExample {
    public static Logger log = LoggerFactory.getLogger(LogConcatExample.class);

    public static void main(final String args[]) {
        long i = 0;

        long start = System.currentTimeMillis();
        while (true) {
            i++;
            final NodeNoToString node = new NodeNoToString("Name", "Ip", i);
            log.debug("Object is : {}", node.getIp() + node.getChilds() + node.getName());
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
