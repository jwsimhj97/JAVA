package com.hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷� (ver 0.5.1)");
		ArrayList<HashMap<String,String>> data=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String input=null;
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("--------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("--------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					System.out.println(stu.get("num")+"\t"+stu.get("kor")+"\t"+stu.get("eng")+"\t"+stu.get("math"));
				}
				System.out.println("--------------------------------------");
			}else if(input.equals("2")){
				HashMap<String, String> stu=new HashMap<>();
				System.out.print("�й� >");
				stu.put("num", sc.nextLine());
				System.out.print("���� >");
				stu.put("kor", sc.nextLine());
				System.out.print("���� >");
				stu.put("eng", sc.nextLine());
				System.out.print("���� >");
				stu.put("math", sc.nextLine());
				
				data.add(stu);
			}else if(input.equals("3")){
				
			}else if(input.equals("4")){
				
			}else{
				
			}
		}
	}

}