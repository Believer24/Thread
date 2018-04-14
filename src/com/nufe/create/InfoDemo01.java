package com.nufe.create;
/**
 * Thread.currentThread()			//当前线程
 * @author Administrator
 * setName();			设置名称
 * getName();			获取名称
 * isAlive()；		判断状态
 *
 */
public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		 MyThread it=new  MyThread();
		 Thread proxy=new Thread(it);
		 //proxy.setName("test");
		 System.out.println(proxy.getName());
		 System.out.println(Thread.currentThread().getName());					//main线程
		 proxy.start();
		 System.out.println("启动的后的状态："+proxy.isAlive());
		 Thread.sleep(200);
		 it.stop();
		 Thread.sleep(100);
		 System.out.println("停止后的的状态："+proxy.isAlive());
	}

}
