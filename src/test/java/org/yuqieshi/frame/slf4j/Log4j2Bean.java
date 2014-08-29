package org.yuqieshi.frame.slf4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Bean {
	private static Logger LOG = LogManager.getLogger();

	public void test() {
		LOG.debug("Log4j 2");
	}
}
