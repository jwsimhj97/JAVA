package com.hi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class Ex14_t {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.8.0)
		// data.bin 
		// 파일 디비 연동
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>
		// input -> 학번 ,이름, 국어, 영어, 수학
		File file=new File("data.bin");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// if end
		Scanner sc=new Scanner(System.in);
		
		String input=null;
		int su=-1;
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			su=Integer.parseInt(sc.nextLine());
			if(su==0){break;}
			if(su==1){
				System.out.println("------------------------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("------------------------------------------------------------------");
				try {
					FileInputStream fis=new FileInputStream(file);
					DataInputStream dis=new DataInputStream(fis);
					int num,kor,eng,math;
					String name=null;
					while(true){
						int su2=dis.read();
						if(su2==-1){break;}
						num=dis.readInt();
						name=dis.readUTF();
						kor=dis.readInt();
						eng=dis.readInt();
						math=dis.readInt();
						if(su2!=0){
						System.out.println(num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math);
						}
					}
					dis.close();
					fis.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("------------------------------------------------------------------");
				
			}else if(su==2){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				String name=sc.nextLine();
				System.out.print("국어>");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				int math=Integer.parseInt(sc.nextLine());
				try {
					FileInputStream fis=new FileInputStream(file);
					ByteArrayOutputStream baos=new ByteArrayOutputStream();
					while(true){
						int su2=fis.read();
						if(su2==-1){break;}
						baos.write(su2);
					}
					byte[] buf=baos.toByteArray();
					baos.close();
					fis.close();
					FileOutputStream fos=new FileOutputStream(file);
					DataOutputStream dos=new DataOutputStream(fos);
					dos.write(buf);
					dos.write(1);
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
					dos.close();
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else if(su==3){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				ByteArrayOutputStream baos=null;
				try{
				FileInputStream fis=new FileInputStream(file);
				DataInputStream dis=new DataInputStream(fis);
				baos=new ByteArrayOutputStream();
				DataOutputStream dos=new DataOutputStream(baos);
				int num2,kor,eng,math;
				String name=null;
				while(true){
					int su2=dis.read();
					if(su2==-1){break;}
					num2=dis.readInt();
					name=dis.readUTF();
					kor=dis.readInt();
					eng=dis.readInt();
					math=dis.readInt();
					if(num==num2){su2=0;}
					dos.write(su2);
					dos.writeInt(num2);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
				}
				dos.flush();
				dos.close();
				dis.close();
				fis.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.print("이름>");
				String name=sc.nextLine();
				System.out.print("국어>");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				int math=Integer.parseInt(sc.nextLine());
				try {
					byte[] buf=baos.toByteArray();
					baos.close();
					FileOutputStream fos=new FileOutputStream(file);
					DataOutputStream dos=new DataOutputStream(fos);
					dos.write(buf);
					dos.write(1);
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
					dos.close();
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
		}//while end
	}// main end

}// class end
