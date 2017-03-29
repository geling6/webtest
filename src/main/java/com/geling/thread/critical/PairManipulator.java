package com.geling.thread.critical;

class PairManipulator implements Runnable {

	private PairManager pm = null;
	public PairManipulator(PairManager pm){
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true){
			pm.increment();
		}
	}
	@Override
	public String toString(){
		return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
	}

}
