package com.chamc.demo.second.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * 不可变集合
 * @author chenpeng
 *
 */
public class ImmutableCollection {

	public static void main(String[] args) {

		List<String> lists = new ArrayList<String>(3);
		lists.add("1");
		lists.add("2");
		lists.add("3");
		
		List<String> unmodifyList = Collections.unmodifiableList(lists);
		ImmutableList<String> immutableList = ImmutableList.copyOf(lists);
		System.out.println(lists);
		System.out.println(unmodifyList);
		System.out.println(immutableList);
		
		lists.add("4");
		
		System.out.println("------------");
		System.out.println(lists);
		System.out.println(unmodifyList);
		System.out.println(immutableList);
	}
}
