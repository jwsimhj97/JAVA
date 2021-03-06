package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_t {
	public static void main(String[] args){
		// 학생성적관리프로그램 (ver 0.7.0)
		// 껏다켜도 입력한 데이터 남아있게
		Scanner sc=new Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.7.0");
		String input=null;
		String data="";
		
		File file=new File("data.bin");	// data.bin이라는 이름의 file 생성
		// 읽어오기
		if(file.exists()){	// file 있는지 없는지 확인
			try {
				FileInputStream fis=new FileInputStream(file);
//				int fsize=(int) file.length();	// 한글썼을때 문제x start~
//				byte[] buf=new byte[fsize];
//				fis.read(buf);				
//				data=new String(buf);			// 한글썼을때 문제x ~end
				
				
//				ArrayList<Integer> list=new ArrayList<>();
//				while(true){
//					int su=fis.read();
//					if(su==-1){break;}
//					list.add(su);
//				}
//				Object[] arr2=list.toArray();
//				byte[] arr3=new byte[arr2.length];
//				for(int i=0; i<arr3.length; i++){
//					arr3[i]=(byte)arr2[i];
//				}
//				data=new String(arr3);
				
				while(true){			// 코드상 가장 심플하지만 한글이 data에 들어가면 오류가 생긴다
					int su=fis.read();
					if(su==-1){break;}
					data+=(char)su;
				}
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		///// 
		while(true){
			System.out.print("1.보기 2.입력 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-----------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-----------------------------");
				System.out.print(data);
				System.out.println("-----------------------------");
			}else if(input.equals("2")){
				System.out.print("학번  >");
				input=sc.nextLine()+"\t";
				System.out.print("국어  >");
				input+=sc.nextLine()+"\t";
				System.out.print("영어  >");
				input+=sc.nextLine()+"\t";
				System.out.print("수학  >");
				input+=sc.nextLine()+"\n";
				
				data+=input;
			} 
		}
		// 저장
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		try{
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(data.getBytes());
			fos.flush();
			fos.close();
//			fos.write();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
