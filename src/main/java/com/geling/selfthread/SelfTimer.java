package com.geling.selfthread;

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask{
	@Override
	public void run(){
		System.out.println("fuck you !");
	}
}

public class SelfTimer {

	public static void main(String[] args) {
		TimerTask timerTask = new MyTimerTask();
		Timer time = new Timer();
		time.schedule(timerTask, 2000);

	}

}
