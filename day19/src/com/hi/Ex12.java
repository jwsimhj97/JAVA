package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.7.0)
		// 껏다켜도 입력한 데이터 남아있게		
		System.out.println("학생성적관리프로그램 (ver 0.7.0)");
		ArrayList<HashMap<String,String>> data=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String input=null;

		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("--------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("--------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					System.out.println(stu.get("num")+"\t"+stu.get("kor")+"\t"+stu.get("eng")+"\t"+stu.get("math"));
				}
				System.out.println("--------------------------------------");
			}else if(input.equals("2")){
				HashMap<String, String> stu=new HashMap<>();
				System.out.print("학번 >");
				stu.put("num", sc.nextLine());
				System.out.print("국어 >");
				stu.put("kor", sc.nextLine());
				System.out.print("영어 >");
				stu.put("eng", sc.nextLine());
				System.out.print("수학 >");
				stu.put("math", sc.nextLine());
				
				data.add(stu);
			}else if(input.equals("3")){
				
			}else if(input.equals("4")){
				
			}
		}
		
		File file=new File("test12.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

		try{
			FileOutputStream out=new java.io.FileOutputStream(file);
			char[] arr=input.toCharArray();
			for(int i=0; i<arr.length; i++){
				out.write(arr[i]);
			}
			out.close();
			System.out.println("작성완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
