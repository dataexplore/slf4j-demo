package org.yuqieshi.frame.slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JCLBean {
	private static final Log log = LogFactory.getLog(JCLBean.class);

	public void jcl() {
		log.debug("jcl");
	}
}
