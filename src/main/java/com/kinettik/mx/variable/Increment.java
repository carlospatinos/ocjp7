package com.kinettik.mx.variable;

/**
k == j is true
k.equals(j) is true
i is 11

 */
class Increment {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 11;
        Integer k = ++i; // INCR
        System.out.println("k == j is " + (k == j));
        System.out.println("k.equals(j) is " + k.equals(j));
        System.out.println("i is " + i);
    }
}
