package com.hi;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		// FIFO (first-in-first-out).
		// Queue -> returns spectial value��� -> offer() / poll() / peek()
		// Queue ���� ->  ���Լ�����  (������ �ִ´�) => |4 3 2 1| => (������ ����)
		java.util.Queue que=new LinkedList();
		que.offer("ù��°");
		que.offer("�ι�°");
		que.offer("����°");
		que.offer("�׹�°");
		
		
//		System.out.println(que.peek());		// peek - ���� ������ ù���� 	���: ù��°
//		que.poll();							// poll - ������ ����				  ù��° ����
//		System.out.println(que.peek());		// peek - ���� ������ ù����	���: �ι�°
//		que.poll();							// poll - ������ ����				  �ι�° ����
		
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