package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// while������ �����ܸ����
//		int su=1;
//		while(su<5){
//			System.out.println("�ݺ�"+su);
//			su++;
//		}
		
//		2��
//		for(int i=1; i<10; i++){
//			System.out.println("2x"+i+"="+(i*2));
//		}		
//		int su=1;
//		while(su<10){
//			System.out.println("2x"+su+"="+(su*2));
//			su++;
//		}
		
//		2~9��
//		for(int i=1; i<10; i++){
//			for(int j=2; j<=9; j++){
//				System.out.print(j+"x"+i+"="+j*i+"\t");
//			}
//			System.out.println();
//		}
		int su=1;
		while(su<10){
			int dan=2;
			while(dan<10){
				System.out.print(dan+"x"+su+"="+(su*dan)+"\t");
				dan++;
			}
			su++;
			System.out.println();
		}
		
		
		
		
	}

}