package com.hi;

import java.util.ArrayList;
import java.util.Arrays;
// Class ArrayList
public class Ex05 {

	public static void main(String[] args) {
		java.util.ArrayList list=new ArrayList();	// ArrayList �⺻ 10 / ���� -> ArrayList(int initialCapacity) - ���� �����Ͽ� �׽�Ʈ�Ͽ� ���
		list.add("ù��°");
		list.add("�ι�°");
		list.add(0,"����°");	// add(index����, ����)
		list.add("�׹�°");
//		list.clear();			// clear() - ���� ����
//		list.remove(1);			// remove() - �ε���()�� ���� ����� [() - index��ȣ, "����" �������]
		list.set(0, "3��°");	// set() - (���ؽ���ȣ, "�����ҳ���")
		
//		System.out.println(list.size());	// size() - list������ �����
		
//		System.out.println(list.get(0));	// get() - list�� ()°�� ���������� �ִ���
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		for(int i=0; i<list.size(); i++){
			Object msg=list.get(i);		// String msg=(String)list.get(i);
			System.out.println(msg);
		}
//		System.out.println(list.contains("�ι�°"));	// contains() - ()���� list�� �ִ��� ������ true, false
//		System.out.println(list.indexOf("������°"));	// indexOf() - ()���� list���� ���° index���� + ()���� �ִ��� �������� Ȯ�ΰ���(������ -1)
//		System.out.println(list.isEmpty());				// isEmpty() - ���� ����ִ��� ������ true, false
//		System.out.println(list.size()==4);				// size()==? - list�� length���� ?��ŭ���� �ƴ��� true, false
		
		Object[] objs=list.toArray();					// list.toArray() -> Object ���[String[] -> X]
		System.out.println(Arrays.toString(objs));		// Arrays.toString() - ()�� ������ �迭�� �ٲ��ش�
	}

}