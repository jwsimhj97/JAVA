package com.hi;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver0.3.5)");
		String data="";
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print("1.보기 2.입력 3.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("---------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------");
				if(data.indexOf("@")==1){continue;}
				String[] students=data.split("@");
				for(int i=0; i<students.length; i++){
					String stu=students[i];
					String[] msg=stu.split(",");
					System.out.println(msg[0]+"\t"+msg[1]+"\t"+msg[2]+"\t"+msg[3]);
				}
				System.out.println("---------------------------------");
			}else if(input.equals("2")){
				System.out.print("학번 >");
				input=sc.nextLine()+",";
				System.out.print("국어 >");
				input+=sc.nextLine()+",";
				System.out.print("영어 >");
				input+=sc.nextLine()+",";
				System.out.print("수학 >");
				input+=sc.nextLine()+"@";
				data+=input;
//				System.out.println(data);
			}else if(input.equals("3")){
				System.out.print("삭제할 학번 >");
				input=sc.nextLine();
				String[] students=data.split("@");
				data="";
				for(int i=0; i<students.length; i++){
					if(students[i].startsWith(input+",")){continue;}
					data+=students[i]+"@";
				}
			}else{
				System.out.println("메뉴를 다시 확인하시고 입력바랍니다");
			}
		}
		
	}

}
