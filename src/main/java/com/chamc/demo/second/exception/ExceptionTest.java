package com.chamc.demo.second.exception;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest {

	/**
	 * 这种try catch是没有灵魂的
	 * @param str
	 */
	public void test(String str) {
		
		InputStream in = new ByteArrayInputStream(str.getBytes());
		try {
			in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
