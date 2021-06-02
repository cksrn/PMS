package com.widetns.pms;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
public class MySQLConnectionTest {

		private static final String DRIVER = "com.mysql.jdbc.Driver";
		private static final String URL = "jdbc:mysql://192.168.0.51:3306/test?useSSL=false";
		private static final String USER = "widetns2";
		private static final String PW = "widetns2";
		
		@Test
		public void testConnection() throws Exception{
			
			Class.forName(DRIVER);
			
			try(Connection con = DriverManager.getConnection(URL, USER, PW)){
				System.out.println(con);
			}catch(Exception e) {
				e.printStackTrace();
			}//try_
		}//testConnection_
	}//MySQLConnectionTest_
