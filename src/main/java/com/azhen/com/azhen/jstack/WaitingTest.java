package com.azhen.com.azhen.jstack;

public class WaitingTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 *60 * 60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("finish");
            }
        }).start();

    }
}
