package com.nufe.create;

public class YieldDemo01 extends Thread {

		public static void main(String[] args) {
			YieldDemo01 demo=new YieldDemo01();
			Thread t=new Thread(demo);				//新生
			t.start();		//就绪
			//cpu 调度运行
			
			for(int i=0;i<100;i++){
				if(i%20==0){
									//暂停本线程main
					Thread.yield();
				}
				System.out.println("main......"+i);
			}
			
	
		}
		public void run(){
			for(int i=0;i<100;i++){
				System.out.println("Yeild......"+i);
			}
		}
		
	
}

