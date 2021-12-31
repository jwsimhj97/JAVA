package com.hi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// IO
		// ���
		// ������ �����
		String path="D:\\javaWork\\day18";
		java.io.File file=new File(path);		
		System.out.println(file.exists());		// ������ �����ϴ���
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		try{
			System.out.println(file.getCanonicalPath());
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("����:"+file.isFile());
		System.out.println("���丮:"+file.isDirectory());
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println("�б����(r):"+file.canRead());
		System.out.println("�������(r):"+file.canWrite());
		System.out.println("�������(x):"+file.canExecute());
		System.out.println(file.length()+"byte");
		System.out.println(new java.util.Date(file.lastModified()));
		String[] list=file.list();
		System.out.println(Arrays.toString(list));
	}

}