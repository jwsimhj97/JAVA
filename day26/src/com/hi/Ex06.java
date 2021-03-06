package com.hi;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) {
		InputStream is=null;
		Reader isr=null;
		BufferedReader br=null;
		
		try {
			is=new FileInputStream("test05.txt");
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
