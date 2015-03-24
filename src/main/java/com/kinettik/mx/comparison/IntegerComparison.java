package com.kinettik.mx.comparison;

import java.io.Serializable;

public abstract class IntegerComparison implements Serializable {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println(a == b);

    }
}
