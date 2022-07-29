package com.example.overloading;

public class OverloadingExample {
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	
 }

class OverloadingExample1 extends OverloadingExample{
	public void sum(int a, int b,int c,int d) {
		int sum=a+b+c+d;
		System.out.println("float: "+sum);
	}
	
	public static void main(String[] args) {
		OverloadingExample1 example = new OverloadingExample1();
		example.sum(10,20);
		example.sum(10,20,30,40);
	}
}
