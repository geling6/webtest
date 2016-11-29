package com.geling.interview.readFileRobin;

/**
 * @author houxs
 * @desc线程读文件，每次读一行
 */
public class Thread3Read1Line implements Runnable {

    private ReadFile rf;

    public Thread3Read1Line(ReadFile rf) {
        this.rf = rf;
    }

    public void run() {
        while (rf.thread3Read1Line(Thread.currentThread().getName()) != null) {
            // System.out.println(Thread.currentThread().getName() + " : " +
            // line);
        }
    }
}
