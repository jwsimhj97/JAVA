package com.hi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Score {

	public static void main(String[] args) {
		
		System.out.println("학생 성적 관리 프로그램 (ver0.9.0)");
		
		// 1. 보기 2. 입력 // 3. 수정 4. 삭제 0. 종료
		String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		String sql="";
		Scanner sc=new Scanner(System.in);
		OracleDriver driver=new OracleDriver();
		Connection conn=null;
		ResultSet rs=null;
		Statement st=null;
		
		try {
			DriverManager.deregisterDriver(driver);
			conn=DriverManager.getConnection(url);
			st=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		String input="";
		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")) {break;}
			if(input.equals("1")) {
				sql="select * from student";
				
				System.out.println("--------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학");
				System.out.println("--------------------------------------------");
				try {
					rs=st.executeQuery(sql);
					while(rs.next()) {
						System.out.print(rs.getObject(1)+"\t");
						System.out.print(rs.getObject(2)+"\t");
						System.out.print(rs.getObject(3)+"\t");
						System.out.print(rs.getObject(4)+"\t");
						System.out.print(rs.getObject(5)+"\t");
						System.out.println();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				System.out.println("--------------------------------------------");
				
				
			} else if(input.equals("2")) {
				sql="insert into student (num,name,subKor,subEng,subMath) values (";
				System.out.println("학번 >");
				sql+=sc.nextLine()+", '";
				System.out.println("이름 >");
				sql+=sc.nextLine()+"',";
				System.out.println("국어 >");
				sql+=sc.nextLine()+",";
				System.out.println("영어 >");
				sql+=sc.nextLine()+",";
				System.out.println("수학 >");
				sql+=sc.nextLine()+")";
				
				try {
					st.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if(input.equals("3")) {
				System.out.print("수정할 학번 >");
				String num=sc.nextLine();
				System.out.print("수정할 국어 >");
				String subKor=sc.nextLine();
				System.out.print("수정할 영어 >");
				String subEng=sc.nextLine();
				System.out.print("수정할 수학 >");
				String subMath=sc.nextLine();
				sql="update student set "+"subKor="+subKor+","+"subEng="+subEng+","+"subMath="+subMath+" where "+"num="+num;
				try {
					st.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if(input.equals("4")) {
				System.out.println("삭제할 학번 >");
				String num=sc.nextLine();
				sql="delete from student where num="+num;
				try {
					st.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("입력이 잘못되었습니다");
			}
		}
		
		if(st!=null)
			try {
				if(st!=null) st.close();
				if(conn!=null) conn.close();
				if(sc!=null) sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

}