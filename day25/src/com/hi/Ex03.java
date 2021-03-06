package com.hi;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fos=new FileOutputStream(file);
			BufferedOutputStream bos=new BufferedOutputStream(fos);	// 성능up
			PrintStream ps=new PrintStream(bos);					// 문자열을 쉽게
			
			ps.println("문자열");
			ps.print("문자열");
			
//			bos.write("문자열".getBytes());
//			bos.write("\r\n".getBytes());
//			bos.write("문자열".getBytes());
			
			ps.close();
			bos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
