package com.wjb2.flow;

public class LoopDemo1 {
    public static void main(String[] args) {
		//定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
        int ge, shi, bai;
		//使用for循环
        for(int i = 200; i <=300; i++ ) {
			//取出百位数
        	bai = i / 100;
			//取出十位数
			shi = i % 100 / 10;
			//取出个位数
			ge = i % 10;
			
			//计算三个数字之积
			int ji = ge*shi*bai;
			//计算三个数字之和
			int he = ge+shi+bai;
            //如果积等于42并且和为12，则将满足条件的数输出
			if(ji == 42 && he == 12) {
			System.out.println(i);
        }
	}
  }
 }
