package com.hi;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11 {
	
	static class Ele implements Comparable{	//상속
		int val;
		public Ele(int val){
			this.val=val;
		}
		public String toString(){
			return ""+val;
		}
		public int compareTo(Object obj){
//			return  val-((Ele)obj).val;
			return  ((Ele)obj).val-val;		//위에랑 반대로정렬
		}
//		public int compareTo(Object obj){
//			return 0;		// 리턴값이 0이면 중복으로 인식 | -1이면 큰값부터 거꾸로
//		}
	}

	public static void main(String[] args) {
		Ele ele1=new Ele(1111);
		Ele ele2=new Ele(2222);
//		System.out.println(ele1);
		Set set=new TreeSet();
		set.add(ele1);
		set.add(ele2);
		set.add(new Ele(1122));
		
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
