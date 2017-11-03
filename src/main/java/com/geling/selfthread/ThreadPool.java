package com.geling.selfthread;

public interface ThreadPool<Job extends Runnable> {
	void execute(Job job);
	
	void shutdown();
	
	void addWorkers(int num);
	
	void removeWorkder(int num);
	
	int getJobSize();
}
