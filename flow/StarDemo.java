package com.wjb2.flow;

public class StarDemo {

	public static void main(String[] args) {
	 int m = 1;
	 int n = 1;
	 System.out.println("输出10行10列的星号");
	 while(m <= 10) {
		 n = 1;
		 while( n <= 10) {
		   System.out.print(" * ");
		   n++;
		 }
		 System.out.println();
		 m++;
	 }
		
	}

}
