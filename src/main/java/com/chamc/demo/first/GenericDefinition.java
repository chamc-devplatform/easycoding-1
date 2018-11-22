package com.chamc.demo.first;

public class GenericDefinition<T> {

	private static <String, T, Child> String get(String str, Child child) {
		return str;
	}

	public static void main(String[] args) {
		Integer first = 222;
		Long second = 333L;
		Integer result = get(first, second);
		System.out.println(result);
	}
}
