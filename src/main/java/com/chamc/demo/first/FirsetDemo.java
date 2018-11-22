package com.chamc.demo.first;

public class FirsetDemo {
	
	private static void badCycle() {
		float a = 1.0f;
		for(int i = 0; i < 100; i++) {
			if (a == 0.1f) {
				break;
			}
			a -= 0.1f;
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		badCycle();
	}
}
