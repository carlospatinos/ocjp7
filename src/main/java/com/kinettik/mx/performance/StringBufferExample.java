package com.kinettik.mx.performance;

public class StringBufferExample {
    public static void main(String args[]) {
        long i = 0;

        while (true) {
            i++;
            StringBuffer sBuffer = new StringBuffer(" test");
            sBuffer.append(" String Buffer").append(i);
            sBuffer.append(i).append(" String Buffer");
            sBuffer.append(i).append(" String Buffer").append(i);
            sBuffer.append(" String Buffer").append(i);
            sBuffer.append(i).append(" String Buffer");
            sBuffer.append(i).append(" String Buffer").append(i);
            sBuffer.append(" String Buffer").append(i);
            sBuffer.append(i).append(" String Buffer");
            sBuffer.append(i).append(" String Buffer").append(i);
            
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
