package com.wjb2.flow;

public class SwitchDemo {

	public static void main(String[] args) {
		int x = 3, y = 4, z = 0;
		switch(x % y + 2) {
		case 
		0 : z = x*y;
		break;
		case 
		6 : z = x/y;
		break;
		case 
		12 : z = x - y;
		break;
		default : z = x*y - x;
		}
		System.out.println(z);

	}

}
