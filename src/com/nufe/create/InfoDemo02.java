package com.nufe.create;
/**
 * 优先级：概率，不是绝对的优先级
 * @author Administrator
 *
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		 MyThread it=new  MyThread();
		 Thread p1=new Thread(it,"挨踢");
		 MyThread it2=new MyThread();
		 Thread p2=new Thread(it2,"挨踢");
		 p1.setPriority(Thread.MIN_PRIORITY);		//设置优先级
		 p2.setPriority(Thread.MAX_PRIORITY);		//设置优先级
		 p1.start();
		 p2.start();
		 
	
		 Thread.sleep(100);
		 it.stop();
		 it2.stop(); 

	}

}
