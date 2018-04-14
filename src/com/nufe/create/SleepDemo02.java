package com.nufe.create;
/**
 * Sleep模拟网络延时
 * @author Administrator
 *
 */
public class SleepDemo02 {
			public static void main(String[] args){
				//真实角色
				Web12306 web=new Web12306();
				//代理
				Thread t1=new Thread(web,"路人甲");
				Thread t2=new Thread(web,"黄牛乙");
				Thread t3=new Thread(web,"攻城狮 ");
				//启动线程
				t1.start();
				t2.start();
				t3.start();
			}
		
}
