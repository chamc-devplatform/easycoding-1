package com.chamc.demo.second.jvm;

public class ClassAndObject {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class c = Object.class;
		System.out.println(c);
		System.out.println(c.getName());
	}
}
