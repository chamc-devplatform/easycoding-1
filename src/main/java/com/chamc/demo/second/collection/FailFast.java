package com.chamc.demo.second.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Objects;

public class FailFast {

	public static void main(String[] args) {
		
//		failFast();
		failFastFailure();
//		failSafe();
	}
	
	public static void failFast() {
		List<String> masterList = new ArrayList<>(7);
		masterList.add("one");
		masterList.add("two");
		masterList.add("three");
		masterList.add("four");
		masterList.add("five");
		
		List<String> subList = masterList.subList(0, 3);

       // 触发fail-fast机制
//		masterList.remove(0);
//		masterList.add("ten");
//		masterList.clear();

		subList.clear();
		subList.add("six");
		subList.add("seven");
		subList.remove(0);
		
		for(String t : subList) {
			System.out.println(t);
		}
		
		System.out.println(masterList);
	}
	
	public static void failFastFailure() {
		
		List<String> list = new ArrayList<>(4);
		list.add("one");
		list.add("two");
		list.add("three");
//		list.add("four");
		
//		for (String s : list) {
//			if (Objects.equal(s, "two")) {
//				list.remove(s);
//			}
//		}
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (Objects.equal(s, "one")) {
				list.remove(s);
			}
		}
		
		System.out.println(list);
	}
	
	public static void failSafe() {
		List<String> list = new ArrayList<>(3);
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (Objects.equal(s, "two")) {
				iterator.remove();
			}
		}
		
		System.out.println(list);
	}
}
