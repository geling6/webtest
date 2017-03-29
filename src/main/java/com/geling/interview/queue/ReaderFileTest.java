package com.geling.interview.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReaderFileTest {
	public static void main(String[] args) throws Exception{
		
        BufferedReaderQueue queue1 = new BufferedReaderQueue();
        BufferedReaderQueue queue2 = new BufferedReaderQueue();
        BufferedReaderQueue queue3 = new BufferedReaderQueue();
        
        ThreadReader1 thread1 = new ThreadReader1(queue1,queue2);
        ThreadReader1 thread2 = new ThreadReader1(queue2,queue3);
        ThreadReader1 thread3 = new ThreadReader1(queue3,queue1);
        
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(thread1);
        exec.execute(thread2);
        exec.execute(thread3);
        
        TimeUnit.MILLISECONDS.sleep(5000);
        exec.shutdownNow();
	}
}
