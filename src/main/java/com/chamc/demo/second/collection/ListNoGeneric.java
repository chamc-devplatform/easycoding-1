package com.chamc.demo.second.collection;

import java.util.ArrayList;
import java.util.List;

public class ListNoGeneric {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// 泛型出现前的集合定义方式
		List a1 = new ArrayList();
		a1.add(new Object());
		a1.add(new Integer(111));
		a1.add(new String("hello1"));
		
		List<Object> a2 = a1;
		a2.add(new Object());
		a2.add(new Integer(222));
		a2.add(new String("hello2"));
		
		List<Integer> a3 = a1;
		a3.add(new Integer(333));
//		a3.add(new Object());
//		a3.add(new String("hello3"));
		
		List<?> a4 = a1;
//		a4.add(new Object());
//		a4.add(new Integer(222));
//		a4.add(new String("hello2"));
		a4.remove(0);
		a4.clear();
	}
}
