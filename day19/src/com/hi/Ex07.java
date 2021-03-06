package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File origin=new File("coin.jpg");
		File copy=new File("copy.jpg");
		byte[] buf=new byte[1024];	// 2,8,16,32,64,....
		
		try {
			FileInputStream fis=new FileInputStream(origin);
			FileOutputStream fos=new FileOutputStream(copy);
			while(true){
				int cnt=fis.read(buf);
				if(cnt==-1){break;}
				fos.write(buf,0,cnt);	// buf의 0부터 cnt까지
			}			
			fis.close();
			fos.close();
			System.out.println("복사 끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
