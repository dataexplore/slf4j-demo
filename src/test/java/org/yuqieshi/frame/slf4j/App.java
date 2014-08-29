package org.yuqieshi.frame.slf4j;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		JCLBean jcl = new JCLBean();
		jcl.jcl();
		Log4j1Bean log1 = new Log4j1Bean();
		log1.test();
		Log4j2Bean log4j = new Log4j2Bean();
		log4j.test();
		Slf4jBean slf4j = new Slf4jBean();
		slf4j.slf4j();
	}
}
