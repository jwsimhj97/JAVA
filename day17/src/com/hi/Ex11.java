package com.hi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		// �л��������� ���α׷� (ver 0.5.0)
		// �л���, �ѿ� ����x
		// 1.���� 2.�Է� 3.���� 4.���� 0.���� >
		// ���� ���� ����
		
		System.out.println("�л��������� ���α׷� (ver 0.5.0)");
		ArrayList<String> list=new ArrayList<String>();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		String[] data=new String[0];
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){			// ����
				break;
			}else if(input.equals("1")){	// ����
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-------------------------------");
				for(int i=0; i<list.size(); i++){
					String msg=list.get(i);
					System.out.print(msg+"\t");
					if(i%4==3){		//j�� 3,7,11�϶�
						System.out.print("\n");
					}
				}

				System.out.println();
			}else if(input.equals("2")){	// �Է�		
//				String[] temp=new String[];
				
				System.out.print("�й� >");
				list.add(sc.nextLine());
				System.out.print("���� >");
				list.add(sc.nextLine());
				System.out.print("���� >");
				list.add(sc.nextLine());
				System.out.print("���� >");
				list.add(sc.nextLine());
				
				
			}else if(input.equals("3")){	// ����
				System.out.print("���° �й��� �����Ͻðڽ��ϱ�?");
				input=sc.nextLine();

				if(input==list.get(0)){
					list.remove(Integer.parseInt(input));
				}
			}else if(input.equals("4")){	// ����
				
			}
		}
		
		
		
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i));
//		}
	}

}