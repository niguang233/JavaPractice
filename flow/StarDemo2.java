package com.wjb2.flow;

public class StarDemo2 {


		public static void main(String[] args) {
		
		 System.out.println("输出一个梯形	");
		 for(int a = 1; a <= 5; a++) {  
			for(int b = 4; b >= a; b--) {
				System.out.print(" ");
			}
			for(int c = 1;c <= a*2 + 1;c++) {
				System.out.print("*");
			}System.out.print("\n");
		 }
		
		 }
			
		}

	


