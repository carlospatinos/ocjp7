
package com.kinettik.mx.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kinettik.mx.pojo.Person;

public class LoggingExample {
    public static void main(final String[] args) {
        final Logger log = LoggerFactory.getLogger(LoggingExample.class);
        log.error("Hola");
        final Person p = new Person("Luis");
        log.info("Hi, {}", p);

        try {
            Integer.parseInt("s");
        } catch (final Exception e) {
            log.error("Error", e);
            // log.error("Error is {} and class {} ", e, "MyClass");
            log.error("Message {} ", "MyClass", e);
        }
    }
}
