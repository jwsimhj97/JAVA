package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		// 문자열 스트림
		File file=new File("test01.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw=new FileWriter(file);
			char ch='A';
			fw.write(ch);
			fw.write('B');
			fw.write('C');
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
