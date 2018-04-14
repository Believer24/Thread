package com.nufe.create;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example01 {

	public static void main(String[] args) throws Exception {
		//InetAddress
		InetAddress localAddress=InetAddress.getLocalHost();			//创建表示本地主机的InetAddress对象
		InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");		//在给定主机名的情况下确定主机的IP地址
		System.out.println("本机的IP地址："+localAddress.getHostAddress());
		System.out.println("itcast的IP地址"+remoteAddress.getHostAddress());
		System.out.println("3秒是否可达："+remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名为："+remoteAddress.getHostName());
	}
}
