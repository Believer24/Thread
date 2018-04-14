package com.nufe.create;

public class RabbitApp {
		public static void main(String[] args){
			//创建子类对象	  
			Rabbit rab=new Rabbit();
			Tortoise tor=new Tortoise();
			//调用start方法
			rab.start();				//不要调用run方法
			tor.start();
			for(int i=0;i<100;i++){
				System.out.println("Mian主线程"+i+"步");
			}
		}
}
