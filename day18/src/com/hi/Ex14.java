package com.hi;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		File file=new File("dist");
		if(file.exists()){
			System.out.println("���������� �����մϴ�");
		}else{
			boolean boo=file.mkdir();
			System.out.println(boo);
		}
	}

}