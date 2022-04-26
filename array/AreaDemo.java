package com.wjb2.array;
public class AreaDemo {
    //求圆形面积
	public double area(double r) {
		double sum = r*r*Math.PI;
		return sum;
	}
    
	//求长方形面积
	public double area(double length, double width) {
		double sum1 = length * width;
		return sum1;
	}

	public static void main(String[] args) {
		//定义对象
		AreaDemo areaDemo = new AreaDemo();
		//定义一个double类型的变量存放半径，并初始化
		double a = 4.5;
		//定义两个变量存放长和宽，并初始化
		double m = 8,n = 5;
		//调用方法，求圆的面积并打印输出
		System.out.println("圆形的面积为：" + areaDemo.area(a));
		//调用方法，求长方形面积并打印输出
		System.out.println("长方形的面积为：" + areaDemo.area(m,n));
	}
}