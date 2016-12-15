package com.geling.selfthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String>{

	private int id  = 0;
	public TaskWithResult(int id){
		this.id = id;
	}
	@Override
	public String call() throws Exception {
		return "taskwithresult + " + id;
	}
	
}
public class CallableDemo {

	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<String>> futures = new ArrayList<>();
		for(int i=0;i<10;i++){
			futures.add(exec.submit(new TaskWithResult(i)));
		}
		for(Future<String> future : futures){
			if(future.isDone())
			System.out.println(future.get());
		}
	}

}
