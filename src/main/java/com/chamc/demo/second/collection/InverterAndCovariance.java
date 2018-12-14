package com.chamc.demo.second.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 逆变与协变与不变
 * @author chenpengcp
 *
 */
public class InverterAndCovariance {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Coffee coffee = new MochaCoffee(); // 可以将子类的引用赋值给父类
		Coffee[] coffees = new MochaCoffee[10]; // 数组体现的是协变模式，即 B继承A，则B[]的引用可以赋值给A[]
		coffees[0] = new Coffee();	// 数组coffees[]的实际类型为MochaCoffee类型，会对每一个要添加的元素做类型检查
		
//		List<Coffee> coffeeT1 = new ArrayList<MochaCoffee>(); // 泛型模式<T>是不变模式
//		List<MochaCoffee> coffeeT2 = new ArrayList<Coffee>(); // 泛型模式<T>是不变模式
		
		List<? extends Coffee> coffeeExtendsList = new ArrayList<MochaCoffee>(); // <? extends T>也是协变模式
		
		List<? super MochaCoffee> coffeeSuperList = new ArrayList<Coffee>(); // <? super T>是逆变模式
		
	}
	
	static class Coffee {
		
	}
	
	static class MochaCoffee extends Coffee {
		
	}
}
