
package com.kinettik.mx.pojo;

public class Person {
    private final String name;

    public Person(final String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }
}
