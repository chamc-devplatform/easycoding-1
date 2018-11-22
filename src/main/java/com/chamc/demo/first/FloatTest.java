package com.chamc.demo.first;

public class FloatTest {
	
	

	public static void main(String[] args) {
		
		float f1 = 1.0f;
		float f2 = 0.9f;
		float f = f1 - f2; // 值是多少?

		double d1 = 1.0d;
		double d2 = 0.9d;
		double d = d1 - d2; // 值是多少?
		
		System.out.println(f); // 0.100000024
		System.out.println(d); // 0.09999999999999998
		
		float ff = 0.9f;
		double dd = 0.9d;
		System.out.println(ff / 1.0); // 0.8999999761581421
		System.out.println(dd / 1.0); // 0.9
	}
}
