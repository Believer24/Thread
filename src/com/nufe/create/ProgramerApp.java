package com.nufe.create;

public class ProgramerApp {

	public static void main(String[] args) {
		//1）创建真实角色
			Programer pro=new Programer();
		//2)创建代理角色+真实角色的引用
			Thread proxy=new Thread(pro);
		// 3)调用.start方法  ，启动线程
			proxy.start();
			for(int i=0;i<1000;i++){
				System.out.println("一边敲代码，一边聊QQ");
			}
	}

}
