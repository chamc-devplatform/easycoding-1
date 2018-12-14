package com.chamc.demo.second.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

	public static void main(String[] args) {
		
		List<Animal> animal = new ArrayList<Animal>(1);
		List<Cat> cat = new ArrayList<Cat>(1);
		List<Gaffey> gaffey = new ArrayList<Gaffey>(1);
		
		animal.add(new Animal());
		cat.add(new Cat());
		gaffey.add(new Gaffey());
		
//		<? extends Cat> 只能初始化为Cat以及Cat的子类
//		<? super Cat> 只能初始化为Cat以及Cat的父类
//		List<? extends Cat> extendsCatFromAnimal = animal;
//		List<? super Cat> superCatFromAnimal = animal;
//		
//		List<? extends Cat> extendsCatFromCat = cat;
//		List<? super Cat> superCatFromCat = cat;
//		
//		List<? extends Cat> extendsCatFromGaffey = gaffey;
//		List<? super Cat> superCatFromGaffey = gaffey;
//		
//		extendsCatFromCat.add(new Animal());
//		extendsCatFromCat.add(new Cat());
//		extendsCatFromCat.add(new Gaffey());
//		
//		superCatFromCat.add(new Animal());
//		superCatFromCat.add(new Cat());
//		superCatFromCat.add(new Gaffey());
//		
//		Animal catExtends1 = extendsCatFromCat.get(0);
//		Cat catExtends2 = extendsCatFromCat.get(0);
//		Gaffey catExtends3 = extendsCatFromCat.get(0);
//		Object catExtends4 = extendsCatFromCat.get(0);
//		
//		Animal catSuper1 = superCatFromCat.get(0);
//		Cat catSuper2 = superCatFromCat.get(0);
//		Gaffey catSuper3 = superCatFromCat.get(0);
//		Object catSuper4 = superCatFromCat.get(0);
		
	}
	
	static class Animal {
		
	}
	
	static class Cat extends Animal {
		
	}
	
	static class Gaffey extends Cat {
		
	}
	
	/**
	 *  老子是生产者，给你啥你就用啥，别想改老子的东西
	 */
	List<? extends Cat> produce() {
		List<? extends Cat> c = new ArrayList<Cat>();
		return c;
	}
	
	/**
	 *  
	 */
	void consume(List<Cat> cat) {
		List<? super Cat> c = cat;
		c.add(new Cat());
	}
	
	void me() {
		List<? extends Cat> c = produce();
		System.out.println("从生成者那拿的集合，改不了啊" + c);
		
		List<Cat> cat = new ArrayList<Cat>();
		consume(cat); // 给消费者那货上贡咯
	}
}
