package com.hi;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver 0.3.6)");
		StringBuffer data=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print("1.보기 2.입력 3.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------");
				System.out.print(data);
				System.out.println("-------------------------------");
			}else if(input.equals("2")){
				System.out.print("학번 >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.print("국어 >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.print("영어 >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.print("수학 >");
				data.append(sc.nextLine());
				data.append("\n");				
			}else if(input.equals("3")){
				System.out.print("삭제할 학번 >");
				input=sc.nextLine();
				int start=data.indexOf("\n"+input+"\t")+1;
				int end=data.indexOf("\n",start)+1;
				
				data.delete(start, end);
			}else{
				System.out.println("메뉴를 확인하시고 다시 입려 바랍니다");
			}
			
			
		}
	}

}
