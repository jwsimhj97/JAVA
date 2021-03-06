package com.hi;

import java.awt.Button;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		File origin=new File("image.png");
		File file=new File("copy1.png");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		byte[] buf=new byte[2];
		try {
			FileInputStream fis=new FileInputStream(origin);
			FileOutputStream fos=new FileOutputStream(file);
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
//			BufferedOutputStream bos=new BufferedOutputStream(fos);
//			bos.write("버퍼를 달아서 작성합니다".getBytes());			
//			bos.close();
			long before=System.currentTimeMillis();
			while(true){
//				int su=fis.read();
				int su=bis.read(buf);
				if(su==-1){break;}
				fos.write(buf,0,su);
			}
			long after=System.currentTimeMillis();
			
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			System.out.println(after-before+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
