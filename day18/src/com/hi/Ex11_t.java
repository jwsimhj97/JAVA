package com.hi;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex11_t {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("path >");
		String input=sc.nextLine();
		File file=new File(input);
		if(file.exists()){
			if(file.isDirectory()){
				String[] list=file.list();
				for(int i=0; i<list.length; i++){
					File temp=new File(file.getAbsoluteFile()+"\\"+list[i]);
					long time=temp.lastModified();
					Date dt=new Date(time);
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
					String msg=sdf.format(dt);
					System.out.print(msg+"\t");
					if(temp.isDirectory()){
						System.out.print("<DIR>"+"\t"+"\t");					
					}
					if(temp.isFile()){
						System.out.print("\t"+temp.length()+"\t");					
					}
					System.out.println(temp.getName());
				}
			}else{
				System.out.println("입력을 다시 확인하세요");
			}
		}else{
			System.out.println("입력을 다시 확인하세요");
		}
	}

}
