package com.nufe.create;

public class SaveMoneyTest {

	public static void main(String[] args) {
			Customer c=new Customer();
			Thread t1=new Thread(c);
			Thread t2=new Thread(c);
			t1.start();
			t2.start();
	}

}
