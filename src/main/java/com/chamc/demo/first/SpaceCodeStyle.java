package com.chamc.demo.first;

public class SpaceCodeStyle {

	// 没有必要增加若干空格使变量的赋值等号与上一行对应位置的等号对齐
	private static Integer one = 1;
	private static Long two = 2L;
	private static Float three = 3F;
	private static StringBuilder sb = new StringBuilder("code style: ");
	
	// 缩进4个空格（本代码中任何注释在双斜线与注释内容之间有且仅有一个空格）
	public static void main(String[] args) {
		try {
			// 任何二目运算符的左右必须有一个空格
			int count = 0;
			// 三目运算符的左右两边都必须有一个空格
			boolean condition = (count == 0) ? true : false;
			
			// 关键词if与左侧小括号之间必须有一个空格
			// 左括号的字母c与左括号、字母n与右括号都不需要空格
			// 右括号与左大括号前加空格且不换行，左大括号后必须换行
			if (condition) {
				System.out.println("world");
			} else { // else前后必须加空格，左大括号后换行
				System.out.println("ok");
			}
		} catch (Exception e) {} // 如大括号内为空，则可写成左侧样子，中间无需空格和换行
		
		// 在每个实参逗号之后必须有一个空格
		String result = getString(one, two, three, sb);
		System.out.println(result);
	}
	
	/**
	 * 方法上的注释写法
	 * @param one
	 * @param two
	 * @param three
	 * @param sb
	 * @return
	 */
	private static String getString(Integer one, Long two, Float three, StringBuilder sb) {
		sb.append(one)
			.append(two)
			.append(three);
		return sb.toString();
	}
}
