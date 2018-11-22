package com.chamc.demo.first;

public class ChangeableParameter {

	public static void printLength(Object... args) {
		System.out.println(args.length);
	}

	public static void main(String[] args) {
		printLength(1, 2, 3);
		
		printLength(new int[] {1, 2, 3});
		
		printLength(1, new String[] {"2", "3"});
		
		printLength(new Integer[] {1, 2, 3});
		
		printLength(1, new Integer[] {1, 2, 3});
	}
}
