package com.wjb2.string;

public class StringBuildDemo1 {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Hello");
		
		System.out.println("str="+str.append(',').append("wang!"));
		
		
		//System.out.println("tihuanhou:"+str.delete(6,10).insert(6,"WANG"));
		
		System.out.println("tihuanhou:"+str.replace(6,10,"WANG"));
		

		
		
	}
}
