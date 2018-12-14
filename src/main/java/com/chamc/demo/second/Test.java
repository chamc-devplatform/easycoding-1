package com.chamc.demo.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<>(3);
		a.add("1");
		a.add("2");
		a.add("3");
		
		Object[] o = a.toArray();
		System.out.println(Arrays.asList(o));
		
		a.add("4");
		
		System.out.println(Arrays.asList(o));
	}
}
