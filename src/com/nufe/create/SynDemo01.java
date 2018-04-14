package com.nufe.create;
/**
 * 单例设计模式：确保一个类只有一个对象
 * @author Administrator
 *
 */
public class SynDemo01 {

	public static void main(String[] args) {
			JVMThread thread01=new JVMThread(100);
			JVMThread thread02=new JVMThread(500);
			thread01.start();
			thread02.start();
	}	

}
class JVMThread extends Thread{
	 	private long time;
	 	
		public JVMThread() {
		}
		public JVMThread(long time) {
				this.time=time;
		}

		@Override
		public void run() {
			 System.out.println(Thread.currentThread().getName()+"---》创建:"+JVM.getInstance03(time));
		}
	 	
}
/**
 * 设计模式单例
 * 确保一个类只有一个对象
 * 懒汉式
 *
 */
class JVM{
		/**
		 * 1.构造器私有化,避免外部直接创造对象
		 * 2.声明一个私有的静态变量
		 * 3.创建一个对外的公共的静态方法访问该变量，如果没有对象，创建该对象
		 */
		//2.声明一个私有的静态变量
		private static JVM instance=null;
		 //1.构造器私有化,避免外部直接创造对象
		private JVM(){
					
		}
		//3.创建一个对外的公共的静态方法访问该变量，如果没有对象，创建该对象
		
		public static JVM getInstance01(long time){
			
				if(null==instance){
						try {
							Thread.sleep(time);		//延时		放大错误
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						instance=new JVM(); 
				}
				return instance;
		}
		
		public static synchronized JVM getInstance02(long time){
				if(null==instance){
						try {
							Thread.sleep(time);		//延时		放大错误
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						instance=new JVM(); 
				}
				return instance;
		}
		public static JVM getInstance03(long time){
			//提高已经存在对象的访问效率
			if(null==instance){
			synchronized(JVM.class){			//锁 字节码信息
			if(null==instance){
					try {
						Thread.sleep(time);		//延时		放大错误
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					instance=new JVM(); 
			}
					return instance;
			}
		}
			return instance;
	}
}
