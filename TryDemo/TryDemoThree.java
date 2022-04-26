package com.wjb2;

import java.util.Scanner;

public class TryDemoThree {
		public static void main(String[] args) {
			try {
			int result=test();
			System.out.println("one和two的商是："+result);
		} catch(ArithmeticException e) {
			System.out.println("除数不允许为零");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

			public static int test() throws Exception{
				Scanner input=new Scanner(System.in);
				System.out.println("开始");
				System.out.println("请输入第一个整数");
				int one=input.nextInt();
				System.out.println("请输入第二个整数");
				int two=input.nextInt();
				System.out.println("结束");
				return one/two;
				//return -99999;
				
				
			}
}

