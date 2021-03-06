package com.hi;

public class Ex01 extends Thread{
	

	public static void main(String[] args) {
		Thread thr=Thread.currentThread();	// main thread의 이름 얻기
		String name=thr.getName();			// main thread의 이름은 main이다
		System.out.println(name+"시작");
		
		Ex01 me=new Ex01();
		Ex01 you=new Ex01();
		me.start();
		you.start();
		System.out.println(name+"종료");
	}
	
	@Override
	public void run() {
		Thread thr=Thread.currentThread();
		System.out.println(thr.hashCode()==this.hashCode());
		
		String name=getName();	// thread의 이름을 가져온다
		System.out.println(name+"새로운 쓰레드로 하고자하는 일");
	}

}
