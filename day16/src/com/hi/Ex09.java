package com.hi;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		// LILO (last-in-first-out).
		// Stack ���� -> ���Լ����� => �� : �ǹ��� ����Ⱑ �� �������� ��������, ������ ����Ⱑ �� ���� ��������
		java.util.Stack stack=new Stack();
		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		
		while(!stack.empty()){		//isEmpty = x
			System.out.println(stack.pop());	// peek - ���� ������ ù����
		}
		
	}

}