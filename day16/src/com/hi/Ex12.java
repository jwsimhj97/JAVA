package com.hi;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex12 {

	public static void main(String[] args) {
		// �ζǹ�ȣ������ (ver 0.3.0)
		Random ran=new Random();
		Set lotto=new TreeSet();
		while(lotto.size()!=6){
			lotto.add(ran.nextInt(45)+1);
		}
		Iterator num=lotto.iterator();
		while(num.hasNext()){
			System.out.print(num.next()+" ");
		}
	}

}