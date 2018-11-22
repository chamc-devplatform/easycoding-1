package com.chamc.demo.first;

public class OverloadMethods {

	public static void overloadMethod(int param) {
		System.out.println("参数类型为int的方法");
	}
	
	public static void overloadMethod(long param) {
		System.out.println("参数类型为long的方法");
	}
	
	public static void overloadMethod(Integer param) {
		System.out.println("参数类型为Integer的方法");
	}
	
	public static void overloadMethod(Object param) {
		System.out.println("参数为Object的方法");
	}
	
	public static void overloadMethod(int... params) {
		System.out.println("可变参数方法");
	}
	
	public static void overloadMethod(int param1, Integer param2) {
		System.out.println("参数类型顺序为int,Integer的方法");
	}
	
	public static void overloadMethod(Integer param1, int param2) {
		System.out.println("参数类型顺序为Integer, int的方法");
	}
	
	public static void main(String[] args) {
		overloadMethod(7); // 会调用哪个方法？
	}
}
