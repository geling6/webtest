/**
 * 
 */
package com.geling.interview.readFileRobin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yangyang
 *
 */
public class ReadFile {
    private static BufferedReader br = null;

    private String line = null;

    private int flag = 1;

    private Lock lock = new ReentrantLock();

    Condition condt1 = lock.newCondition();

    Condition condt2 = lock.newCondition();

    Condition condt3 = lock.newCondition();

    Condition condt4 = lock.newCondition();

    public ReadFile() {
        Reader reader;
        try {
            reader =
                    new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
                    		+ File.separator + "geling" + File.separator + "interview" + File.separator
                            + "readFileRobin" + File.separator + "test.txt");
            br = new BufferedReader(reader);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String thread1Read1Line(String name) {
        lock.lock();
        try {
            while (flag != 1) {
                condt1.await();
            }
            line = br.readLine();
            System.out.println(name + " : " + line);
            flag = 2;
            condt2.signal();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        return line;
    }

    public String thread2Read1Line(String name) {
        lock.lock();
        try {
            while (flag != 2) {
                condt2.await();
            }
            line = br.readLine();
            System.out.println(name + " : " + line);
            flag = 3;
            condt3.signal();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        return line;
    }

    public String thread3Read1Line(String name) {
        lock.lock();
        try {
            while (flag != 3) {
                condt3.await();
            }
            line = br.readLine();
            System.out.println(name + " : " + line);
            flag = 4;
            condt4.signal();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        return line;
    }

    public String thread4Read1Line(String name) {
        lock.lock();
        try {
            while (flag != 4) {
                condt4.await();
            }
            line = br.readLine();
            System.out.println(name + " : " + line);
            flag = 1;
            condt1.signal();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        return line;
    }
}
