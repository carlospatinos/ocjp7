package com.kinettik.mx.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kinettik.mx.pojo.Person;

public class LoggingExample {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(LoggingExample.class);
        log.error("Hola");
        Person p = new Person("Luis");
        log.info("Hi, {}", p);
    }
}
