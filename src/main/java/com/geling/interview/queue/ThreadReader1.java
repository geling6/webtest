package com.geling.interview.queue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ThreadReader1 implements Runnable{
	
	private BufferedReaderQueue readerQueue1, readerQueue2;
	private BufferedReader br;
	
	public ThreadReader1(BufferedReaderQueue readerQueue1, BufferedReaderQueue readerQueue2){
		this.readerQueue1 = readerQueue1;
		this.readerQueue2 = readerQueue2;
		BufferedReader br = null;
        try {
            Reader reader =
                    new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
                    		+ File.separator + "geling" + File.separator + "interview" + File.separator
                            + "readFileRobin" + File.separator + "test.txt");
            br = new BufferedReader(reader);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		readerQueue1.add(br);
	}
	
	@Override
	public void run(){
		try{
			while(!Thread.interrupted()){
				BufferedReader reader = readerQueue1.take();
				String oneLine = reader.readLine();
				if(oneLine != null){
					System.out.println("reader1 : " + oneLine);
					readerQueue2.put(reader);					
				}
			}
		}catch(InterruptedException | IOException e){
			e.printStackTrace();
		}
	}
}
