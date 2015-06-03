
package com.kinettik.mx.memoryleak;

public class WrongRecursivityForever {
    private static long depth = 0L;

    public static void main(final String[] args) {
        foo();
    }

    private static void foo() {
        System.err.println(++depth);
        try {
            foo();
        } finally {
            foo();
        }
    }
}
