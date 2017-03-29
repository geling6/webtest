package com.geling.thread.critical;

class PairChecker implements Runnable {

	private PairManager pm = null;
	public PairChecker(PairManager pm){
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true){
			pm.checkCounter.incrementAndGet();
			pm.getPair().checkState();
		}
	}

}
