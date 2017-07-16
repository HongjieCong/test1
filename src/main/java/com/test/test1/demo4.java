package com.test.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import org.apache.avro.tool.Main;




public class demo4 {
	public static void main(String[] args) {
//		String str = "abcde";
//		System.out.println(str.length());
//		System.out.println(str.charAt(1));
//		System.out.println(str.indexOf("c"));
//		System.out.println(str.lastIndexOf("d"));
//		StringBuffer sb = new StringBuffer();
//		sb.append("abc");
//		sb.append(true);
//		sb.append(123);
//		sb.insert(0, "xiaoming");
//		StringBuilder sb1=new StringBuilder();
//		sb1.append(123);
//		System.out.println(sb1);
//		Properties propertie=System.getProperties();
//		propertie.list(System.out);
		Collection c1= new ArrayList();
		c1.add(123);
		c1.add("中国");
	
		Collection c2=new ArrayList();
		c2.add(321);
		c2.add("山东");
		c2.add(123);
//		c1.addAll(c2);
//		c1.clear();
		c1.removeAll(c2);
		System.out.println(c1);
	}
	


	
}
