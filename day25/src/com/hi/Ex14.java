package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.8.0)
		// data.bin
		// 파일 디비 연동
		// 1.보기 2.입력 3.수정 4.삭제 0.종료 >
		// input -> 학번, 이름, 국어, 영어, 수학
		
		File file=new File("data.bin");
		
		try {
			FileWriter fw=new FileWriter(file);
			PrintWriter pw=new PrintWriter(fw);
			
			pw.println("");
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String[]> list=new ArrayList<>();
		System.out.println("학생성적관리프로그램 (ver 0.8.0)");
		Scanner sc=new Scanner(System.in);
		String data[]={"학번", "이름", "국어", "영어", "수학"};
		String dataInput[]=null;
		String input=null;
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){		
				
			}else if(input.equals("2")){	//입력	
				for(int i=0; i<data.length; i++){
					dataInput=new String[i+1];
					System.out.print(data[i]+":");
					dataInput[i]=sc.nextLine();
					
		            list.add(dataInput);
				}			
				
			}else if(input.equals("3")){
				
			}else if(input.equals("4")){
				
			}
		}
		
	}

}
