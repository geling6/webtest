package dynamicproxy;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Fucker{
	
	private int flag = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond1 = lock.newCondition();
	private Condition cond2 = lock.newCondition();
	private Condition cond3 = lock.newCondition();
	
	public void fuckNaWei(){
		lock.lock();
		try{
			while(flag != 0){
				cond1.await();				
			}
			
			System.out.println("fuck chen na wei ...");
			TimeUnit.SECONDS.sleep(1);			
			System.out.println("fuck chen na wei done .");
			TimeUnit.SECONDS.sleep(3);
			flag = 1;
			cond2.signalAll();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void fuckQinqi(){
		lock.lock();
		try{
			while(flag != 1){
				cond2.await();
			}
			System.out.println("fuck qin qi ...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("fuck qin qi done .");
			TimeUnit.SECONDS.sleep(3);
			flag = 2;
			cond3.signalAll();		
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void fuckLiangjing(){
		lock.lock();
		try{
			while(flag != 2){
				cond3.await();
			}
			System.out.println("fuck liang jing ..");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("fuck liang jing done .");
			TimeUnit.SECONDS.sleep(3);
			flag = 0;
			cond1.signalAll();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}


public class CommunicationTest {
	public static void main(String[] args) {
		
		final Fucker fucker = new Fucker();
		
		for(int i=0;i<10;i++){
			new Thread(new Runnable(){
				@Override
				public void run(){
					fucker.fuckNaWei();
				}
			}).start();
			
			
			new Thread(new Runnable(){
				public void run(){
					fucker.fuckQinqi();
				}
			}).start();
			
			new Thread(new Runnable(){
				public void run(){
					fucker.fuckLiangjing();
				}
			}).start();
		}
	}
}
