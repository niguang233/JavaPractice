package com.wjb2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {
	public static void main(String[] args) {
		int result=test();
		System.out.println("one和two的商是："+result);
	}

		public static int test() {
			Scanner input=new Scanner(System.in);
			System.out.println("开始");
			try {
			System.out.println("请输入第一个整数");
			int one=input.nextInt();
			System.out.println("请输入第二个整数");
			int two=input.nextInt();
			return one/two;
			}catch(ArithmeticException e) {
				System.out.println("除数不允许为零");
				return 0;
			}finally {
			System.out.println("结束");
			return -99999;
			
		}
		}
}
