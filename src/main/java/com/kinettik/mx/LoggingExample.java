package com.kinettik.mx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Person {
    private final String name;

    public Person(String n) {
        name = n;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name;
    }
}

public class LoggingExample {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(LoggingExample.class);
        log.error("Hola");
        Person p = new Person("Luis");
        log.info("Hi, {}", p);
    }
}
