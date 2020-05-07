package com.tcz.test;

import java.sql.Connection;

import org.junit.Test;

import com.tcz.utils.JDBCUtils;

public class DBUtilsTest {

	@Test
	public void test01() {
		Connection connection = JDBCUtils.getConnection();
		System.out.println(connection);
	}
}
