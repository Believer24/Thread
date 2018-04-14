package com.nufe.create;

public class DeadLockThread {
		//定义Object类型的chopsticks锁对象
		static Object chopsticks=new Object();
		//定义Object类型的KnifeAndFork锁对象
		static Object knifeAndFork=new Object();
		private boolean flag;
		public DeadLockThread(boolean flag) {		//定义有参的构造方法
			this.flag=flag;
		}
		public void run(){
			if(flag){
				while (true){
					//chopsticks锁对象上的同步代码块
					System.out.println(Thread.currentThread().getName()
												+"---if---chopsticks");
					//knifeAndFork锁对象上的同步代码块
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()
												+"---if---knifeAndFork");
						
					}
				}
			}else{
			while(true){
				//knifeAndFork锁对象上的同步代码块
				synchronized (knifeAndFork) {
							System.out.println(Thread.currentThread().getName()
														+"---else---knifeAndFork");
							//chopstics锁对象上的同步代码块
							synchronized (chopsticks) {
								System.out.println(Thread.currentThread().getName()
														+"---else---chopsticks");
					}
				}
			}
		}
	}
		
}
