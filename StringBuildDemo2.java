package com.wjb2.string;

public class StringBuildDemo2 {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("123456");
		a.delete(2,4).insert(3,"AB");
		System.out.println(a.toString());
}
}
