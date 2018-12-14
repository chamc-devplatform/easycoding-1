package com.chamc.demo.second.debug;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConditionDebug {

	public static void main(String[] args) {
		
		for(int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		
		Map<String, String> maps = new HashMap<>(100);
		maps.put("hello1", "world1");
		maps.put("hello2", "world2");
		maps.put("hello3", null);
		maps.put("hello4", "world4");
		maps.put("hello5", "world5");
		maps.put("hello6", "world6");
		maps.put("hello7", "world7");
		maps.put("hello8", "wrold8");
		maps.put("hello9", "world9");
		maps.put("hello10", "world10");
		
		for(Entry<String, String> entry : maps.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + " --- " + "value=" + value);
		}
	}
}
