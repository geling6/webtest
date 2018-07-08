package dynamicproxy;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class ArrayOp{
	
	private Integer[] array;
	private Random random = new Random();
	
	public ArrayOp(Integer[] array){
		this.array = array;
	}
	
	public synchronized void produce(){
		if(array == null){
			array = new Integer[10];
		}
		for(int i=0;i<array.length;i++){
			if(array[i] != null){
				try{
					this.wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		
		for(int i=0;i<array.length;i++){
			array[i] = random.nextInt(100);
			System.out.println("Thread:" + Thread.currentThread().getName());
		}
		
		this.notifyAll();
		
	}
	
	public synchronized void consume(){
		if(array == null || empty()){
			try{
				this.wait();				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		for(int i=0;i<array.length;i++){
			if(array[i] != null){
				System.out.println(array[i]);
			}
		}
		this.notifyAll();
	}
	
	private boolean empty(){
		for(int i=0;i<array.length;i++){
			if(array[i] != null){
				return false;
			}
		}
		return true;
	}
}

public class Test {

	public static void main(String[] args) {
		Integer[] array = null;
		final ArrayOp op = new ArrayOp(array);
		Runnable p1 = new Thread(){
			@Override
			public void run(){
				op.produce();
			}
		};
		
		Runnable p2 = new Thread(){
			@Override
			public void run(){
				op.produce();
			}
		};
		
		Runnable c1 = new Thread(){
			@Override
			public void run(){
				op.consume();
			}
		};
		Runnable c2 = new Thread(){
			@Override
			public void run(){
				op.consume();
			}
		};
		
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.submit(p1);
		exec.submit(p2);
		exec.submit(c1);
		exec.submit(c2);
	}

}
