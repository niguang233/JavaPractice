package com.wjb2.string;

public class StringBuildDemo3 {
	public static void main(String[] args) {
		Integer x = 400;
		Integer y = x;
		x++;
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1.append("5");
		System.out.println(x);
		System.out.println(y);
		System.out.println(sb1);
		System.out.println(sb2);
	}

}
