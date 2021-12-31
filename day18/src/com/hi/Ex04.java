package com.hi;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int num;
	int kor, eng, math;
	String name;
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver0.5.0)");
		Scanner sc=new Scanner(System.in);
		String input=null;
		ArrayList<Student> list=new ArrayList<Student>();
		int su=0;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			try{
				su=Integer.parseInt(input);
			}catch(NumberFormatException e){
				System.out.println("메뉴 선택은 숫자를 이용바랍니다");
				continue;
			}
			if(su==0){break;}
			if(su==1){
				System.out.println("-----------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-----------------------------------");
				for(int i=0; i<list.size(); i++){
					Student stu=list.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
				}
				System.out.println("-----------------------------------");
			}else if(su==2){
				Student stu=new Student();
				System.out.print("학번 >");
				input=sc.nextLine();
				stu.num=Integer.parseInt(input);
				System.out.print("이름 >");
				input=sc.nextLine();
				stu.name=input;
				System.out.print("국어 >");
				input=sc.nextLine();
				stu.kor=Integer.parseInt(input);
				System.out.print("영어 >");
				input=sc.nextLine();
				stu.eng=Integer.parseInt(input);
				System.out.print("수학 >");
				input=sc.nextLine();
				stu.math=Integer.parseInt(input);
				list.add(stu);
			}else if(su==3){
				
			}else if(su==4){
				System.out.print("삭제할 학번 >");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				for(int i=0; i<list.size(); i++){
					Student stu=list.get(i);
					if(stu.num==num){
						list.remove(i);
					}
				}
			}else{
				System.out.println("메뉴를 다시 확인하시고 입력바랍니다");
			}
		}
	}

}
