package com.wjb2.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
		//定义一个字符数组ch并初始化
		int sum = 0;
		//循环遍历数组，统计字符’a’或’A’出现的次数
		 char[] ch = {'a','a','A','a'};
		 for(char n:ch)
		    if(n =='a'| n == 'A')
		        sum ++;
		        
		  System.out.println("字符数组中字符‘a’或‘A’的个数为：" + sum);

		//打印输出统计数据
		
	}
}       

