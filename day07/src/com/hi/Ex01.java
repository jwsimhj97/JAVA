package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int me,com,win,draw,lose;
		me=1;
		com=1;
		win=0;
		draw=0;
		lose=0;
		String input;		
		System.out.println("���� ���� �� ���� (ver 0.1.0)");
		System.out.println("������ �����ϰڽ��ϴ�");
		String[] arr={"����","����","��"};
		boolean boo=true;
		while(boo){
			System.out.print("1.���� 2.���� 3.�� 0.���� >");
			input=sc.nextLine();
			me=Integer.parseInt(input);
			if(me==0){
				boo=false;
			}else if(me<1||me>3){
				System.out.println("�޴��� �ٽ� Ȯ���ϼ���");
			}else{
				com=(int)(Math.random()*3)+1;
				System.out.println("me:"+arr[me-1]+",com:"+arr[com-1]);
				if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)){
					System.out.println("�̰���");
					win++;
				}else if(me==com){
					System.out.println("�����");
					draw++;
				}else if((me==1&com==2)||(me==2&&com==3)||(me==3&&com==1)){
					System.out.println("����");
					lose++;
				}
			}
		}
		
		System.out.println(win+"��"+draw+"��"+lose+"��");
		System.out.println("�̿����ּż� �����մϴ�");
	}

}