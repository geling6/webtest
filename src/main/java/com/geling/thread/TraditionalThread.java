package com.geling.thread;

public class TraditionalThread {
	/**
	 * 一个线程就是一条执行路径。
	 * 如果在这里新开一个线程，那就有俩路径，一个是main方法的路径，一个是新new的线程的路径
	 */
	public static void main(String[] args) {
		
		/**
		 * 1. 实现一个线程，就是新new一个Thread类，执行它的start()方法,应该是它调用计算机本地方法，执行run里的东西
		 * 所以，实现一个线程，直接做一个Thread类的子类，覆写父类的run()方法，调用start()方法就行了。
		 */
		Thread thread = new Thread("子线程1"){
			@Override
			public void run() {
				while(true){
					try{
						Thread.sleep(3000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		};
		thread.start();
		
		/**
		 * 2.看Thread类的run()方法，里面就一个判断if(target != null) target.run();target是个Runnable类型的
		 * 也就是说，传给Thread类一个Runnable对象，就能执行Runnable的run()方法
		 * Thread类的私有init()方法给target赋值。构造方法"Thread(Runnable target)","Thread(Runnable target, String name)"等调用了init()方法
		 * 所以，实例化一个Runnable实现类，构造Thread类时传给它，调用Thread类的start()方法就开启了一个线程.
		 */
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try{
						Thread.sleep(7000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		},"子线程2");
		thread2.start();
		
		//注:使用Runnable接口比继承Thread类好处，1) 单继承问题;
				//2) Runnable更面向对象:Runnable是要执行的对象,Thread类是线程对象.线程对象执行好执行的对象(有点跟Timer和TimerTask的关系差不多)
				
		/**
		 * 主线程的路径
		 */
		while(true){
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
