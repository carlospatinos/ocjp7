package com.kinettik.mx.performance;

public class StringExample {
    public static void main(String args[]) {
        long i = 0;

        while (true) {
            i++;
            String str = " test";
            str += " String Buffer" + i;
            str += i + " String Buffer";
            str += i + " String Buffer" + i;
            str += " String Buffer" + i;
            str += i + " String Buffer";
            str += i + " String Buffer" + i;
            str += " String Buffer" + i;
            str += i + " String Buffer";
            str += i + " String Buffer" + i;

            if (i == 1000000000) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i = 0;
            }
        }
    }
}
