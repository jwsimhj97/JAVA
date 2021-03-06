package com.hi;

import java.util.Scanner;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Ex03 {

	public static void main(String[] args) {
		String sql="insert into dept(deptno,dname,loc) values (";
		Scanner sc=new Scanner(System.in);
		String input=null;
		
		System.out.print("deptno >");
		input=sc.nextLine();
		sql=sql+input+",'";
		System.out.print("dname >");
		input=sc.nextLine();
		sql=sql+input+"','";
		System.out.print("loc >");
		input=sc.nextLine();
		sql=sql+input+"')";
//		System.out.println(sql);
		
		String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		OracleDriver driver=new OracleDriver();
		Connection conn=null;
		Statement stmt=null;
		
		try {
			DriverManager.registerDriver(driver);
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
