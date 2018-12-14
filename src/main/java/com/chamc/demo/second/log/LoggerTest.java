package com.chamc.demo.second.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {

	private final static Logger logger = LoggerFactory.getLogger(LoggerTest.class);
	
	public static void main(String[] args) {
		int id = 1;
		
		logger.debug("lalalal with id：" + id);
		
		logger.debug("lalalal with id : {}" , id);
		
		// 推荐用这种方式写日志
		if (logger.isDebugEnabled()) {
			logger.debug("lalalal with id : {}" , id);
		}
	}
}
