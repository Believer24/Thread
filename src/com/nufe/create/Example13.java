package com.nufe.create;

public class Example13 {

	public static void main(String[] args) {
		//创建两个DeadLockThread对象
		DeadLockThread d1=new DeadLockThread(true);
		DeadLockThread   d2=new DeadLockThread(false);
		//创建并开启两个线程
	/*	new Thread(d1, "Chinese").start();         		//创建开启线程Chinese
		new Thread(d2,"American").start();             //创建开启线程American
*/
	}

}
