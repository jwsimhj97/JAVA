package com.hi;

import java.util.ArrayList;
import java.util.Arrays;
// Class ArrayList
public class Ex05 {

	public static void main(String[] args) {
		java.util.ArrayList list=new ArrayList();	// ArrayList 기본 10 / 변경 -> ArrayList(int initialCapacity) - 값을 변형하여 테스트하여 출력
		list.add("첫번째");
		list.add("두번째");
		list.add(0,"세번째");	// add(index순서, 내용)
		list.add("네번째");
//		list.clear();			// clear() - 값을 비운다
//		list.remove(1);			// remove() - 인덱스()의 값을 지운다 [() - index번호, "내용" 상관없음]
		list.set(0, "3번째");	// set() - (인텍스번호, "변경할내용")
		
//		System.out.println(list.size());	// size() - list갯수가 몇개인지
		
//		System.out.println(list.get(0));	// get() - list의 ()째에 무슨내용이 있는지
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		for(int i=0; i<list.size(); i++){
			Object msg=list.get(i);		// String msg=(String)list.get(i);
			System.out.println(msg);
		}
//		System.out.println(list.contains("두번째"));	// contains() - ()값이 list에 있는지 없는지 true, false
//		System.out.println(list.indexOf("여덟번째"));	// indexOf() - ()값이 list에서 몇번째 index인지 + ()값이 있는지 없는지도 확인가능(없으면 -1)
//		System.out.println(list.isEmpty());				// isEmpty() - 값이 비어있는지 없는지 true, false
//		System.out.println(list.size()==4);				// size()==? - list의 length값이 ?만큼인지 아닌지 true, false
		
		Object[] objs=list.toArray();					// list.toArray() -> Object 사용[String[] -> X]
		System.out.println(Arrays.toString(objs));		// Arrays.toString() - ()의 값들을 배열로 바꿔준다
	}

}
