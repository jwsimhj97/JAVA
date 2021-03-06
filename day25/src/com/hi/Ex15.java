package com.hi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File file=new File("test02.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("학생성적관리프로그램 (ver 0.8.0)");
		int su=-1;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료");
			su=Integer.parseInt(sc.nextLine());
			if(su==0){break;}
			if(su==1){
				System.out.println("----------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("----------------------------------------------");
				try {
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					while(true){
						String msg=br.readLine();
						if(msg==null){break;}
						System.out.println(msg);
					}
					br.close();
					fr.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("----------------------------------------------");
			}else if(su==2){
				String msg="";
				System.out.print("학번 >");
				msg+=sc.nextLine()+"\t";
				System.out.print("이름 >");
				msg+=sc.nextLine()+"\t";
				System.out.print("국어 >");
				msg+=sc.nextLine()+"\t";
				System.out.print("영어 >");
				msg+=sc.nextLine()+"\t";
				System.out.print("수학 >");
				msg+=sc.nextLine();
				
				try {
					FileWriter fw=new FileWriter(file,true);	// true = 누적역할
					BufferedWriter bw=new BufferedWriter(fw);
					
					bw.write(msg);
					bw.newLine();					
					bw.close();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else if(su==3){
				String msg="";
				System.out.print("학번 >");
				String input=sc.nextLine();
				try {
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					String temp=null;
					while((temp=br.readLine())!=null){
						msg+=temp+'\n';
					}
					br.close();
					fr.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				int startIdx=0;
				int endIdx=0;
				
				startIdx=msg.indexOf('\n'+input+'\t')+1;
				endIdx=msg.indexOf("\r\n", startIdx);
				
				if(startIdx==-1){
					startIdx=msg.indexOf(input+'\t');
					if(startIdx!=0){
						continue;
					}
				}else{
					startIdx+=1;					
				}
				
				input+="\t";
				System.out.print("이름 >");
				input+=sc.nextLine()+"\t";
				System.out.print("국어 >");
				input+=sc.nextLine()+"\t";
				System.out.print("영어 >");
				input+=sc.nextLine()+"\t";
				System.out.print("수학 >");
				input+=sc.nextLine();
				
				String old=msg.substring(startIdx,endIdx);
				msg=msg.replace(old, input);
				try {
					FileWriter fw=new FileWriter(file);
					fw.write(msg);
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
