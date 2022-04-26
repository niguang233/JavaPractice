package com.wjb2;

import java.util.Scanner;

public class TryDemoFour {
	public static void main(String[] args) {
		testAge();
	}
	
	public static void testAge() {
		
		try {
			System.out.println("请输入年龄");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
			}else {
				System.out.println("欢迎入住本酒店");
			}
			} catch (Exception e) {
					e.printStackTrace();
			 }
		
	}

	}		
