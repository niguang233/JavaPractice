package com.wjb2.join;
class MyThread extends Thread{
	public void run() {
		for(int i=1;i<10;i++)
	System.out.println(getName()+"正在执行第"+i+"次");
	}
}	
public class JoinDemo{
	
	public static void main(String[] args) {
		MyThread mt= new MyThread();
		mt.start();
		try {
			mt.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}		for(int i=1;i<10;i++) {
			System.out.println("主线程运行第"+i+"次");
		}
			System.out.println("主线程运行结束!");
		}
	} 
