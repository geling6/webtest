package com.geling.interview.queue;

import java.io.BufferedReader;
import java.io.IOException;

public class ThreadReader2 implements Runnable{
	
	private BufferedReaderQueue readerQueue2, readerQueue3;
	
	public ThreadReader2(BufferedReaderQueue readerQueue2, BufferedReaderQueue readerQueue3){
		this.readerQueue2 = readerQueue2;
		this.readerQueue3 = readerQueue3;
	}
	@Override
	public void run(){
		try{
			while(!Thread.interrupted()){
				BufferedReader reader = readerQueue2.take();
				String oneLine = reader.readLine();
				if(oneLine != null){
					System.out.println("reader2 : " + oneLine);
					readerQueue3.put(reader);					
				}
			}
		}catch(InterruptedException | IOException e){
			e.printStackTrace();
		}
	}
}
