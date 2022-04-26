package com.wjb2.array;

public class ArrayDemo {

	public static void main(String[] args) {
		//定义一个整型数组，并初始化
		int[] a = {4,5,6,12,15};
		//循环遍历数组，找出能被3整除的元素并打印输出
		System.out.println("能被3整除的数组元素为：" );
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 3 == 0) {
			 System.out.println(a[i])
;			}
		}

	}

}
