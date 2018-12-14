package com.chamc.demo.second.collection;

import java.util.ArrayList;
import java.util.List;

public class ToArraySpeedTest {

	private static final int COUNT = 100 * 100 * 100;
	
	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<>(COUNT);
		
		for (int i = 0; i < COUNT; i++) {
			list.add(i * 1.0);
		}
		
		long start = System.nanoTime();
		
		// 为啥这个会花费那么多时间？
		Double[] notEnoughArray = new Double[COUNT - 1];
		list.toArray(notEnoughArray);
		
		long middle1 = System.nanoTime();
		
		Double[] equalArray = new Double[COUNT];
		list.toArray(equalArray);
		
		long middle2 = System.nanoTime();
		
		Double[] doubleArray = new Double[COUNT * 2];
		list.toArray(doubleArray);
		
		long end = System.nanoTime();
		
		long notEnoughArrayTime = middle1 - start;
		long equalArrayTime = middle2 - middle1;
		long doubleArrayTime = end - middle2;
		
		System.out.println("数组容量小于集合大小花费的时间：" + notEnoughArrayTime / (1000.0 * 1000.0) + " ms");
		System.out.println("数组容量等于集合大小花费的时间：" + equalArrayTime / (1000.0 * 1000.0) + " ms");
		System.out.println("数组容量是集合2倍大小花费的时间：" + doubleArrayTime / (1000.0 * 1000.0) + " ms");
	}
}
