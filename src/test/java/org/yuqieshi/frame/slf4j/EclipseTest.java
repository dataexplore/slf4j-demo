package org.yuqieshi.frame.slf4j;

import java.io.File;

public class EclipseTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\taoistwar\\Desktop\\eclipse");
		StringBuffer sb = new StringBuffer();
		for (File file : f.listFiles()) {
			sb.append("lib/").append(file.getName()).append(",");
		}
		System.out.println(sb);
	}
}
