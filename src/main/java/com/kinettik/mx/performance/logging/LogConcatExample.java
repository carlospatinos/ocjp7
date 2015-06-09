package com.kinettik.mx.performance.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogConcatExample {
	public static Logger log = LoggerFactory.getLogger(LogConcatExample.class);

	public static void main(final String args[]) {
		long i = 0;
		while (true) {
			i++;
			final NodeWithoutToString node = new NodeWithoutToString("Name",
					"Ip", i);
			log.info("Object is : {}",
					node.getIp() + node.getChilds() + node.getName());
			if (i == 1000000000) {
				try {
					Thread.sleep(1000);
				} catch (final InterruptedException e) {
					e.printStackTrace();
				}
				i = 0;
			}
		}
	}
}
