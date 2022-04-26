package com.wjb2.flow;

public class IfElseDemo {
	public static void main(String[] args) {
		//定义整型变量x并初始化为-5
		int x = -5;
        //定义整型变量y并初始化0
		int y = 0;
        //根据所给条件，使用多重if-else结构求y的值
        if(x > 0)
        	y = 1;
        else if(x == 0)
        	y = 0;
        else 
        	y = -1;
        //输出x和y的值
        System.out.println("x=" + x);
        System.out.println("y=" + y);
	}
}
