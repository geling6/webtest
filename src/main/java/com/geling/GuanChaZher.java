package com.geling;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;



class BeiGuanCha extends Observable{
	
	private int count = 10;
	
	public void change(){
		for(int i=0;i<count;i++){
			try{
				TimeUnit.SECONDS.sleep(5);				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(i/3==0){
				System.out.println("fuck i = " + i);
				setChanged();
				notifyObservers(i);
			}
		}
	}
	
}

class GuanCha implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		Integer i = (Integer)arg;
		System.out.println(Thread.currentThread().getName() + " fuck off i = " + i);
		
	}
	
}


public class GuanChaZher {

	public static void main(String[] args) {
		BeiGuanCha bei = new BeiGuanCha();
		GuanCha guancha1 = new GuanCha();
		GuanCha guancha2 = new GuanCha();
		
		bei.addObserver(guancha1);
		bei.addObserver(guancha2);
		
		bei.change();
	}

}
