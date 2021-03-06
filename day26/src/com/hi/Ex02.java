package com.hi;

import java.io.*;
import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
//		oos.write(65);
//		oos.writeInt(65);
//		oos.writeDouble(3.14);
//		oos.writeObject(vec);
//		oos.writeObject(arr1);
//		oos.writeObject(list);
//		oos.writeObject(set);
//		oos.writeObject(map);
		FileInputStream fis=null;
		ObjectInputStream oos=null;
		
		try {
			fis=new FileInputStream("test01.bin");
			oos=new ObjectInputStream(fis);
			int su1=oos.read();
			int su2=oos.readInt();
			double su3=oos.readDouble();
			System.out.println("su1="+su1);
			System.out.println("su2="+su2);
			System.out.println("su3="+su3);
			Vector vec=(Vector) oos.readObject();
			char[] arr1=(char[]) oos.readObject();
			System.out.println(Arrays.toString(arr1));
//			Object[] arr2=vec.toArray();
//			System.out.println(Arrays.toString(arr2));
			System.out.println(vec);
			
			ArrayList list=(ArrayList)oos.readObject();
			HashSet set=(HashSet) oos.readObject();
			HashMap map=(HashMap) oos.readObject();
			System.out.println(list);
			System.out.println(set);
			System.out.println(map);
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
