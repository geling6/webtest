package com.geling.thread;

public class TraditionalThread {
	/**
	 * һ���߳̾���һ��ִ��·����
	 * ����������¿�һ���̣߳��Ǿ�����·����һ����main������·����һ������new���̵߳�·��
	 */
	public static void main(String[] args) {
		
		/**
		 * 1. ʵ��һ���̣߳�������newһ��Thread�ִ࣬������start()����,Ӧ���������ü�������ط�����ִ��run��Ķ���
		 * ���ԣ�ʵ��һ���̣߳�ֱ����һ��Thread������࣬��д�����run()����������start()���������ˡ�
		 */
		Thread thread = new Thread("���߳�1"){
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
		 * 2.��Thread���run()�����������һ���ж�if(target != null) target.run();target�Ǹ�Runnable���͵�
		 * Ҳ����˵������Thread��һ��Runnable���󣬾���ִ��Runnable��run()����
		 * Thread���˽��init()������target��ֵ�����췽��"Thread(Runnable target)","Thread(Runnable target, String name)"�ȵ�����init()����
		 * ���ԣ�ʵ����һ��Runnableʵ���࣬����Thread��ʱ������������Thread���start()�����Ϳ�����һ���߳�.
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
		},"���߳�2");
		thread2.start();
		
		//ע:ʹ��Runnable�ӿڱȼ̳�Thread��ô���1) ���̳�����;
		//2) Runnable���������:Runnable��Ҫִ�еĶ���,Thread�����̶߳���.�̶߳���ִ�к�ִ�еĶ���(�е��Timer��TimerTask�Ĺ�ϵ���)
		
		/**
		 * ���̵߳�·��
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
