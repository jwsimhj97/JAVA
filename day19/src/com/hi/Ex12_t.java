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
		// �л������������α׷� (ver 0.7.0)
		// �����ѵ� �Է��� ������ �����ְ�
		Scanner sc=new Scanner(System.in);
		System.out.println("�л������������α׷� (ver 0.7.0");
		String input=null;
		String data="";
		
		File file=new File("data.bin");	// data.bin�̶�� �̸��� file ����
		// �о����
		if(file.exists()){	// file �ִ��� ������ Ȯ��
			try {
				FileInputStream fis=new FileInputStream(file);
//				int fsize=(int) file.length();	// �ѱ۽����� ����x start~
//				byte[] buf=new byte[fsize];
//				fis.read(buf);				
//				data=new String(buf);			// �ѱ۽����� ����x ~end
				
				
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
				
				while(true){			// �ڵ�� ���� ���������� �ѱ��� data�� ���� ������ �����
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
			System.out.print("1.���� 2.�Է� 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-----------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-----------------------------");
				System.out.print(data);
				System.out.println("-----------------------------");
			}else if(input.equals("2")){
				System.out.print("�й�  >");
				input=sc.nextLine()+"\t";
				System.out.print("����  >");
				input+=sc.nextLine()+"\t";
				System.out.print("����  >");
				input+=sc.nextLine()+"\t";
				System.out.print("����  >");
				input+=sc.nextLine()+"\n";
				
				data+=input;
			} 
		}
		// ����
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