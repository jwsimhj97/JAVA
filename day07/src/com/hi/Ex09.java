package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.2.0)
		// 1.�Է�(3ȸ) 2.��� 0.���� >
		// �Է��� �� 3��
		// 3���� �Է��� ������ "�Է��� �������ϴ�" ���� ����
		// ����: ����, ����, ����
		// ����� ǥ�� ���
		// �����ϰ� ���� �� ����
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="�л������������α׷�(ver 0.2.0)";
		String bar="---------------------------------";
		System.out.println(title);
		String [] cls={"����", "����", "����"};
		String [] suInput={"0","0","0"};

		String input;
		int msg;
		
		boolean boo=true;
		while(boo){
			System.out.print("1.�Է� 2.��� 0.���� >");
			input=sc.nextLine();
			msg=Integer.parseInt(input);

			if(msg==0){
				boo=false;
			}else if(msg==1){
				for(int i=0; i<3; i++){
					System.out.print("����:"+cls[i]+">");
					suInput[i]=sc.nextLine();
				}
				System.out.println("�Է��� �������ϴ�");
			}else if(msg==2){
				System.out.println(bar);
				System.out.println("����:  ����   | ����  | ����");
				System.out.println(bar);
				System.out.println("\t"+suInput[0]+"\t"+suInput[1]+"\t"+suInput[2]);
			}else if(msg<3){
				System.out.println("�޴��� �ٽ��Է��ϼ���");
			}
		}
		System.out.println("����Ǿ����ϴ�");		
		
	}

}