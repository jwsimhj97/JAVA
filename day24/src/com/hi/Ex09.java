package com.hi;

public class Ex09 extends Thread{

	public static void main(String[] args) {
		Ex09 me=new Ex09();
		me.start();		// 시작
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.suspend(); 	// 일시정지
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.resume(); 	// 재시작
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.stop();		// 종료 (종료되면 재시작 불가)
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println(getName()+" run...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
