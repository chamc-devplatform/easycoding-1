package com.chamc.demo.second.jvm;

import java.net.URL;

public class ClassLoaderTest {

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		
		ClassLoader c = ClassLoaderTest.class.getClassLoader();
		
		ClassLoader c1 = c.getParent();
		
		ClassLoader c2 = c1.getParent();
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for(URL url : urls) {
			System.out.println(url.toExternalForm());
		}
	}
}
