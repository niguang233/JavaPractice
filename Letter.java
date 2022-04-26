package com.wjb2.letter;

class Latter implements Runnable
{

	@Override
	public void run() {
		char[] arr1=new char[26];
		for(int i=0;i<26;i++){
		//System.out.println(Thread.currentThread().getName());
		arr1[i]=(char) ((char)65+i);
		System.out.println(arr1[i]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
public class Letter {

	public static void main(String[] args) {
		Latter l=new Latter();
		Thread mt=new Thread(l);
		mt.start();
		
	}

}       