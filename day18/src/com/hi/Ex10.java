package com.hi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// IO
		// 경로
		// 절대경로 상대경로
		String path="D:\\javaWork\\day18";
		java.io.File file=new File(path);		
		System.out.println(file.exists());		// 파일이 존재하는지
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		try{
			System.out.println(file.getCanonicalPath());
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("파일:"+file.isFile());
		System.out.println("디렉토리:"+file.isDirectory());
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println("읽기권한(r):"+file.canRead());
		System.out.println("쓰기권한(r):"+file.canWrite());
		System.out.println("실행권한(x):"+file.canExecute());
		System.out.println(file.length()+"byte");
		System.out.println(new java.util.Date(file.lastModified()));
		String[] list=file.list();
		System.out.println(Arrays.toString(list));
	}

}
