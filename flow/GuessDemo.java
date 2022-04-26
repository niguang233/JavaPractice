package com.wjb2.flow;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
	  int number = 5;
	  int guess;
	  System.out.println("请猜一个1到10之间的数字");

	  do {
		System.out.println("请输入一个1到10之间的数字：");
		Scanner sc = new Scanner(System.in);
		guess = sc.nextInt();
		if(guess > number) {
		  System.out.println("太大了！");
		}else if(guess < number) {
		  System.out.println("太小了！");
		}
	  }while(number != guess);
	  System.out.println("您猜中了！答案为：" + number);
	}

}
