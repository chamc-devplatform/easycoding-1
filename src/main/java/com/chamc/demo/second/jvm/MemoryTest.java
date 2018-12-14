package com.chamc.demo.second.jvm;

public class MemoryTest {
	
	private static final int COUNT = 10;

	static {
		System.out.println("");
	}
	
	public Integer[] test(String arg) {
		Integer[] temp = new Integer[COUNT];
		return temp;
	}
}

