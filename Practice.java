package com.wjb.runnablepr;


class Cat implements Runnable {
	
	@Override
	public void run() {
		
		for (int i=1;i<4;i++) 
			System.out.println(Thread.currentThread().getName()+"A Cat");
		
	}
}

class Dog implements Runnable {
	
	@Override
	public void run() {
		
		for (int i=1;i<4;i++) 
			System.out.println(Thread.currentThread().getName()+"A Dog");
		
	}
}




public class Practice {
	public static void main(String[] args) {
		for(int i=1;i<4;i++) {
			System.out.println("main thread");
		}
		Cat c = new Cat();
		Thread e = new Thread(c);
		e.start();
		Dog d = new Dog();
		Thread f = new Thread(d);
		f.start();
		
	}

}
