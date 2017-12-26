package com.pack1;

public class ThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		t1.setName("rama");
		MyThread t2 = new MyThread();
		t2.setName("amar");
		t1.start();
		t2.start();
		for(int i=0;i<=1000;++i){
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
		}
	}

}
