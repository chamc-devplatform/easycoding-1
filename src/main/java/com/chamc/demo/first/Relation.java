package com.chamc.demo.first;

import java.util.List;

import com.chamc.demo.first.model.Association;
import com.chamc.demo.first.model.Child;
import com.chamc.demo.first.model.Dependency;
import com.chamc.demo.first.model.Eye;
import com.chamc.demo.first.model.Inheritance;
import com.chamc.demo.first.model.Nose;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 继承了Inheritance类
 * @author chenpengcp
 *
 */
@EqualsAndHashCode(callSuper=false)
@SuppressWarnings("unused")
public @Data class Relation extends Inheritance {

	private Association association; // 关联关系，使一个类知道另一个类的属性和方法
	
	public void relate(Dependency dependency) {
		System.out.println("形参体现了依赖关系");
	}
	
	class Family {
		private List<Child> childs; // 聚合关系，体现的是整体与部分、拥有的关系，即has-a的关系
	}
	
	class Person {
		private Eye eye = new Eye(); // 组合关系，体现的是一种contains-a的关系
		private Nose nose = new Nose();
	}
}
