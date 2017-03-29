package com.geling.thread.critical;

class PairManager2 extends PairManager {

	@Override
	public void increment() {
		Pair temp = null;
		synchronized(this){
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}
		store(temp);
	}

}
