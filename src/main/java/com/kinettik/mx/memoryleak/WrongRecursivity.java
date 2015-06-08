
package com.kinettik.mx.memoryleak;

public class WrongRecursivity {
    private static long depth = 0L;

    public static void main(final String[] args) {
        deep();
    }

    private static void deep() {
        try {
            Thread.sleep(100);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println(++depth);
        deep();
    }
}
