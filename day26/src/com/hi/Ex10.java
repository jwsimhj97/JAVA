package com.hi;

public class Ex10 implements Runnable {
	static int tot;
	int startnum;
	int endnum;
	public Ex10(int a, int b){
		startnum=a;
		endnum=b;
	}
	
//	public static synchronized void work(int i){	// synchronized - 메서드 동기화 : 하나의 스레드가 점유하는 동안은 다른 스레드에서는 진입못함
//		int sum=tot+=i;
//		tot=sum;		
//	}
//	
//	public void hap(){
//		for(int i=startnum; i<=endnum; i++){
//			work(i);
//		}
//	}
	
	
	// 동기화 블록
	static Object obj=new Object();
	
	public void hap(){
		for(int i=startnum; i<=endnum; i++){
			synchronized (obj){
				int sum=tot+=i;
				tot=sum;
			}
		}
	}
	
	@Override
	public void run() {
		hap();
	}
	
	public static void main(String[] args) {
		Ex10 me=new Ex10(1,50);
//		me.hap(1, 100);
//		System.out.println(me.tot);
		Thread thr1=new Thread(me);
		Thread thr2=new Thread(me);
		
		thr1.start();
		thr2.start();
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(tot);
	}

}
