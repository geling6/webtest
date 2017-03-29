package com.geling.thread.critical;

class PairManager1 extends PairManager {

	@Override
	public synchronized void increment() {
		p.incrementX();
		p.incrementY();
		store(getPair());
	}

}
