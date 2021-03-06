package com.hi;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		// FIFO (first-in-first-out).
		// Queue -> returns spectial value사용 -> offer() / poll() / peek()
		// Queue 구조 ->  선입선출방식  (정보를 넣는다) => |4 3 2 1| => (정보를 뺀다)
		java.util.Queue que=new LinkedList();
		que.offer("첫번째");
		que.offer("두번째");
		que.offer("세번째");
		que.offer("네번째");
		
		
//		System.out.println(que.peek());		// peek - 빼낼 정보의 첫내용 	결과: 첫번째
//		que.poll();							// poll - 정보를 뺀다				  첫번째 빼기
//		System.out.println(que.peek());		// peek - 빼낼 정보의 첫내용	결과: 두번째
//		que.poll();							// poll - 정보를 뺀다				  두번째 빼기
		
//		while(true){
//			if(que.peek()==null){break;}
//			System.out.println(que.peek());
//			que.poll();
//		}
		
		while(que.peek()!=null){
			System.out.println(que.poll());
		}
	}

}
