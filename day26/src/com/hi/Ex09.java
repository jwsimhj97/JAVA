package com.hi;

import java.io.*;
import java.util.*;

public class Ex09 {

//	public static void main(String[] args) {
////		InputStream inn=System.in;
//		InputStream inn;
//		try {
//			inn = new FileInputStream("test05.txt");
//			Scanner sc=new Scanner(inn);
//			
//			System.out.println(sc.nextInt()+1);
//			System.out.println(sc.nextInt());
////			System.out.println(sc.nextLine());
//			
//			inn.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(new File("test05.txt"));
		System.out.println(sc.nextInt());
			
	}

}
