package dynamicproxy;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("fuck qinqi. xiang gan si ta .");
	}
	
	public static void main(String[] args){
		TTask tTask = new TTask();
		
		Thread1 tt1 = new Thread1(tTask);
		Thread2 tt2 = new Thread2(tTask);
		Thread3 tt3 = new Thread3(tTask);
		
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		Thread t3 = new Thread(tt3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}


class TTask{
	private Lock lock = new ReentrantLock();
	private int flag = 0;
	private Condition cond1 = lock.newCondition();
	private Condition cond2 = lock.newCondition();
	private Condition cond3 = lock.newCondition();
	
	public void task1(){
		lock.lock();
		try{
			while(flag != 0){
				cond1.await();
			}
			System.out.println("fuck tong lei yan !");
			flag = 1;
			cond2.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void task2(){
		lock.lock();
		try{
			while(flag != 1){
				cond2.await();
			}
			System.out.println("fuck qin qi ! ");
			flag = 2;
			cond3.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void task3(){
		lock.lock();
		try{
			while(flag != 2){
				cond3.await();
			}
			System.out.println("fuck chen na wei !");
			flag = 0;
			cond1.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}

class Thread1 implements Runnable{
	
	private TTask tTask;
	public Thread1(TTask tTask){
		this.tTask = tTask;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			tTask.task1();
		}
		
	}
	
}
class Thread2 implements Runnable{
	
	private TTask tTask;
	public Thread2(TTask tTask){
		this.tTask = tTask;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			tTask.task2();
		}
		
	}
	
}
class Thread3 implements Runnable{
	
	private TTask tTask;
	public Thread3(TTask tTask){
		this.tTask = tTask;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			tTask.task3();
		}
		
	}
	
}