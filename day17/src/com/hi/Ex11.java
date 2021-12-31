package com.hi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램 (ver 0.5.0)
		// 학생수, 총원 받지x
		// 1.보기 2.입력 3.수정 4.삭제 0.종료 >
		// 국어 영어 수학
		
		System.out.println("학생성적관리 프로그램 (ver 0.5.0)");
		ArrayList<String> list=new ArrayList<String>();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		String[] data=new String[0];
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){			// 종료
				break;
			}else if(input.equals("1")){	// 보기
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------");
				for(int i=0; i<list.size(); i++){
					String msg=list.get(i);
					System.out.print(msg+"\t");
					if(i%4==3){		//j가 3,7,11일때
						System.out.print("\n");
					}
				}

				System.out.println();
			}else if(input.equals("2")){	// 입력		
//				String[] temp=new String[];
				
				System.out.print("학번 >");
				list.add(sc.nextLine());
				System.out.print("국어 >");
				list.add(sc.nextLine());
				System.out.print("영어 >");
				list.add(sc.nextLine());
				System.out.print("수학 >");
				list.add(sc.nextLine());
				
				
			}else if(input.equals("3")){	// 수정
				System.out.print("몇번째 학번을 수정하시겠습니까?");
				input=sc.nextLine();

				if(input==list.get(0)){
					list.remove(Integer.parseInt(input));
				}
			}else if(input.equals("4")){	// 삭제
				
			}
		}
		
		
		
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i));
//		}
	}

}
