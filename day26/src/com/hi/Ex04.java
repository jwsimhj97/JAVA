package com.hi;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) {
		InputStream is=null;
		ObjectInputStream ois=null;
		
		try {
			is=new FileInputStream("test02.bin");
			ois=new ObjectInputStream(is);
			String msg=(String)ois.readObject();
			System.out.println(msg);
			
			Ex03 me=(Ex03)ois.readObject();			
			System.out.println(me.su1);
			System.out.println(me.su2);
			System.out.println(me.su3);
			me.func();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				ois.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
