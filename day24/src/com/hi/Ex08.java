package com.hi;

public class Ex08 extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 시작");
		Ex08 thr1=new Ex08();
		Ex08 thr2=new Ex08();
		thr1.start();
		thr2.start();		
		try {
			thr1.join(5000);
//			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 종료");
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(getName()+" 수행 :"+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
