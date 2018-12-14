package com.chamc.demo.second.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		
		String[] stringArray = new String[3];
		stringArray[0] = "one";
		stringArray[1] = "two";
		stringArray[2] = "three";
		
		List<String> stringList = Arrays.asList(stringArray);
		
		stringList.set(0, "oneList");
		System.out.println(stringList);
		
//		stringList.add("four");
//		System.out.println(stringList);
//		
//		stringList.remove(2);
//		System.out.println(stringList);
		
		System.out.println(Arrays.toString(stringArray));
		
		stringList.clear();
		System.out.println(stringList);
	}
}
