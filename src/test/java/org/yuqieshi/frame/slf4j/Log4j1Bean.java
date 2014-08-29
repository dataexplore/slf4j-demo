package org.yuqieshi.frame.slf4j;

import org.apache.log4j.Logger;

public class Log4j1Bean {
	private static final Logger LOG = Logger.getLogger(Log4j1Bean.class);

	public void test() {
		LOG.debug("Log4j 1");
	}
}
