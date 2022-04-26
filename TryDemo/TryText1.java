package com.wjb2;

public class TryText1 {
	public static int text(int b) {
		try {
			b+=10;
			return b;
		}catch(Exception e) {
			return 1;
		}finally {
			b+=10;
			return b;
				
		}
	}
	public static void main(String[] args) {
		int num=10;
		System.out.println(text(num));
	}
}
