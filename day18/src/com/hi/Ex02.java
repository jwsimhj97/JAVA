package com.hi;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷� (ver0.3.5)");
		String data="";
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("---------------------------------");
				System.out.println("�й�\t����\t����\t����");
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
				System.out.print("�й� >");
				input=sc.nextLine()+",";
				System.out.print("���� >");
				input+=sc.nextLine()+",";
				System.out.print("���� >");
				input+=sc.nextLine()+",";
				System.out.print("���� >");
				input+=sc.nextLine()+"@";
				data+=input;
//				System.out.println(data);
			}else if(input.equals("3")){
				System.out.print("������ �й� >");
				input=sc.nextLine();
				String[] students=data.split("@");
				data="";
				for(int i=0; i<students.length; i++){
					if(students[i].startsWith(input+",")){continue;}
					data+=students[i]+"@";
				}
			}else{
				System.out.println("�޴��� �ٽ� Ȯ���Ͻð� �Է¹ٶ��ϴ�");
			}
		}
		
	}

}