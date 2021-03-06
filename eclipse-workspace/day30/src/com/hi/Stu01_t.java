package com.hi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Stu01_t {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.9.0)
		// 1.보기 2.입력 3.수정 4.삭제 0.종료 >
		OracleDriver driver=new OracleDriver();
		String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.9.0)");
		String input=null;
		while(true) {
			System.out.print("1.보기 2.입력 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")) {break;}
			if(input.equals("1")) {				
				System.out.println("------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("------------------------------------");
				String sql="select * from stu01_t order by num asc";
				
				try {
					DriverManager.registerDriver(driver);
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						System.out.print(rs.getObject(1)+"\t");
						System.out.print(rs.getObject(2)+"\t");
						System.out.print(rs.getObject(3)+"\t");
						System.out.print(rs.getObject(4)+"\t");
						System.out.println(rs.getObject(5));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}else if(input.equals("2")) {
				System.out.print("학번 >");
				String num=sc.nextLine();
				System.out.print("이름 >");
				String name=sc.nextLine();
				System.out.print("국어 >");
				String kor=sc.nextLine();
				System.out.print("영어 >");
				String eng=sc.nextLine();
				System.out.print("수학 >");
				String math=sc.nextLine();
				String sql="insert into stu01 values("+num+", '"+name+"', "+kor+", "+eng+", "+math+")";
								
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
	}

}
