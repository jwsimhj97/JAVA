package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		// ��� - �ݺ��� - 2.while��
		// ������ �����ؾ߸� �ݺ�
		// while(����-boolean){
		// 		���๮;
		// }
		int su=1;
		while(su<5){
			System.out.println("�ݺ�"+su);
			su++;
		}
		
		// ��� - �ݺ��� - 3.do~while��
		// �ϴ� �ѹ� �����ϰ� ������ �����ϸ� �ݺ� - �ѹ��� ������ ����
		// do{
		// 		���๮;
		// }while(����-boolean);
		int su2=115;
		do{
			System.out.println("�ݺ�"+su2);
			su2++;
		}while(su2<5);
	}

}