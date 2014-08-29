package org.yuqieshi.frame.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBean {
	private static final Logger log = LoggerFactory.getLogger(Slf4jBean.class);

	public void slf4j() {
		log.debug("slf4j");
	}
}
