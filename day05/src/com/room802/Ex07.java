package com.room802;

public class Ex07 {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(23);
//		System.out.println(456);
		int su=1;
		for(int i=1; i<=3; i++){
			for(int j=0; j<i; j++){
				System.out.print(su++);
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		int temp=1;
		for(int y=0; y<3; y++){
			temp=temp+y;
			for(int x=temp; x<=temp+y; x++){
				System.out.print(x);
			}
			System.out.println();
		}
			
		System.out.println("-------------");

//		for(int i=1; i<=1; i++){
		for(int i=1; i<=1; i++){
			System.out.print(i);
		}
		System.out.println();
//		for(int i=1+1; i<=1+1+1; i++){
		for(int i=2; i<=3; i++){
			System.out.print(i);
		}
		System.out.println();
//		for(int i=1+1+2; i<=1+1+2+2; i++){
		for(int i=4; i<=6; i++){
			System.out.print(i);
		}
		System.out.println();
//		for(int i=1+1+2+3; i<=1+1+2+2+3+3; i++){
		for(int i=7; i<=10; i++){
			System.out.print(i);
		}
		System.out.println();
		
	}

}
