package com.hi;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷� (ver 0.3.6)");
		StringBuffer data=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-------------------------------");
				System.out.print(data);
				System.out.println("-------------------------------");
			}else if(input.equals("2")){
				System.out.print("�й� >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.print("���� >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.print("���� >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.print("���� >");
				data.append(sc.nextLine());
				data.append("\n");				
			}else if(input.equals("3")){
				System.out.print("������ �й� >");
				input=sc.nextLine();
				int start=data.indexOf("\n"+input+"\t")+1;
				int end=data.indexOf("\n",start)+1;
				
				data.delete(start, end);
			}else{
				System.out.println("�޴��� Ȯ���Ͻð� �ٽ� �Է� �ٶ��ϴ�");
			}
			
			
		}
	}

}