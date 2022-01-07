package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("test02.bin");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fos=new FileOutputStream(file);
			PrintStream ps=new PrintStream(fos);
			ps.print(1);
			ps.print(3.14);
			ps.print(true);
			ps.println("문자열1");
			ps.println("문자열2");
			
			ps.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
