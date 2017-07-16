package com.test.test1;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.cassandra.thrift.Cassandra.system_add_column_family_args;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InetAddress[] addresse=null;
		String name="";
		
		try {
			 addresse=InetAddress.getAllByName("www.baidu.com");
			 name=addresse[1].getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(name);
		
	}

}
