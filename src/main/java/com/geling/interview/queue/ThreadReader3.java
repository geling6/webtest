package com.geling.interview.queue;

import java.io.BufferedReader;
import java.io.IOException;

public class ThreadReader3 implements Runnable{
	
	private BufferedReaderQueue readerQueue3, readerQueue1;
	
	public ThreadReader3(BufferedReaderQueue readerQueue3, BufferedReaderQueue readerQueue1){
		this.readerQueue3 = readerQueue3;
		this.readerQueue1 = readerQueue1;
	}
	@Override
	public void run(){
		try{
			while(!Thread.interrupted()){
				BufferedReader reader = readerQueue3.take();
				String oneLine = reader.readLine();
				if(oneLine != null){					
					System.out.println("reader3 : " + oneLine);
					readerQueue1.put(reader);
				}else{
					System.exit(-1);
				}
			}
		}catch(InterruptedException | IOException e){
			e.printStackTrace();
		}
	}
}
