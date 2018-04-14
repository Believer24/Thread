package com.nufe.create;
/**
 * 使用Runnable创建线程
 * 1.实现Runnable 
 * @author Administrator接口+重写run()   --->真实角色类
 *启动多线程,使用静态代理
 *1）创建真实角色
 *2)创建代理角色+真实角色的引用
 *3)调用.start方法  ，启动线程
 */
public class Programer implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("一边敲代码，一边Hello world");
		}
	}

}
