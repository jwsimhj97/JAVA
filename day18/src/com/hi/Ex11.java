package com.hi;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String path="D:\\javaWork\\day18\\src\\com\\hi";
		java.io.File file=new File(path);
		java.util.Date date=new Date(file.lastModified());
//		System.out.println(date);
		String[] list=file.list();
		
//		System.out.println(Arrays.toString(list));
		for(int i=0; i<list.length; i++){
			System.out.println(date+"\t"+file.length()+" "+list[i]);
		}
		System.out.println("파일:"+file.isFile());
		System.out.println("디렉토리:"+file.isDirectory());
		System.out.println(file.length()+"byte");

//		System.out.println(date+list[1]);
//		System.out.println(date+list[2]);
//		System.out.println(date+list[3]);

//		System.out.println(file.length()+"byte");
	}

}
