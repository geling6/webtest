package com.geling.interview.readFileRobin;

/**
 * @author Administrator
 * @desc 四个线程读一个文件，每个顺次读一行
 */
public class TestThread {
    private static int count = 1;

    public static void main(String[] args) throws Exception {

        ReadFile rf = new ReadFile();

        Thread1Read1Line thread1 = new Thread1Read1Line(rf);
        Thread2Read1Line thread2 = new Thread2Read1Line(rf);
        Thread3Read1Line thread3 = new Thread3Read1Line(rf);
        Thread4Read1Line thread4 = new Thread4Read1Line(rf);

        Thread t1 = new Thread(thread1, "线程" + count++);
        Thread t2 = new Thread(thread2, "线程" + count++);
        Thread t3 = new Thread(thread3, "线程" + count++);
        Thread t4 = new Thread(thread4, "线程" + count++);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
