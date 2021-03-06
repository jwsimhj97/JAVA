package com.hi;

import java.sql.*;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Stu01 {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		String sql=null;
		oracle.jdbc.driver.OracleDriver driver;
		
		Connection conn=null;
		java.sql.Statement stmt=null;
		java.sql.ResultSet rs=null;
		
		// 학생성적관리프로그램(ver 0.9.0)
		// 1.보기 2.입력 3.수정 4.삭제 0.종료 >
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.9.0)";
		String input=null;
		
		System.out.println(title);
		while(true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("종료됩니다.");
				break;
			}else if(input.equals("1")){	// 보기
				sql="select * from stu01 order by num asc";	// asc:오름차순 desc:내림차순
				driver=new oracle.jdbc.driver.OracleDriver();
				
				try {
					java.sql.DriverManager.registerDriver(driver);
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					System.out.println("학번\t이름\t국어\t영어\t수학");
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
				
			}else if(input.equals("2")){	// 입력
				sql="insert into stu01(num,name,kor,eng,math) values(";
				
				System.out.print("num >");
				input=sc.nextLine();
				sql=sql+input+",'";
				System.out.print("name >");
				input=sc.nextLine();
				sql=sql+input+"','";
				System.out.print("kor >");
				input=sc.nextLine();
				sql=sql+input+"','";
				System.out.print("eng >");
				input=sc.nextLine();
				sql=sql+input+"','";
				System.out.print("math >");
				input=sc.nextLine();
				sql=sql+input+"')";
				
				driver=new OracleDriver();
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
				
				
			}else if(input.equals("3")){	// 수정
				
			}else if(input.equals("4")){	// 삭제
				
			}
		}
		
		
		
	}

}
