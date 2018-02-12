package dynamicproxy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Queue{
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		lock.readLock().lock();
		try{
			System.out.println("fuck chen na wei .");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("fuck chen na wei dong .");
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.readLock().unlock();
		}
	}
	
	public void write(){
		lock.writeLock().lock();
		try{
			System.out.println("fuck qin qi .");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("fuck qin qi done .");
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.writeLock().unlock();
		}
	}
}

public class ReadWriterLockTest {

	public static void main(String[] args) {
		final CountDownLatch countDown = new CountDownLatch(2);
		final Queue queue = new Queue();
		new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i = 0;i<10;i++){
					queue.read();
				}
				countDown.countDown();
			}
		}).start();
		
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<5;i++){
					queue.write();
				}
				countDown.countDown();
			}
		}).start();
		
		try {
			countDown.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
