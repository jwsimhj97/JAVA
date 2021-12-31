package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.2.0)
		// 1.입력(3회) 2.출력 0.종료 >
		// 입력은 총 3번
		// 3번의 입력이 끝나면 "입력이 끝났습니다" 문장 전달
		// 과목: 국어, 영어, 수학
		// 출력은 표로 출력
		// 종료하고 싶을 때 종료
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="학생성적관리프로그램(ver 0.2.0)";
		String bar="---------------------------------";
		System.out.println(title);
		String [] cls={"국어", "영어", "수학"};
		String [] suInput={"0","0","0"};

		String input;
		int msg;
		
		boolean boo=true;
		while(boo){
			System.out.print("1.입력 2.출력 0.종료 >");
			input=sc.nextLine();
			msg=Integer.parseInt(input);

			if(msg==0){
				boo=false;
			}else if(msg==1){
				for(int i=0; i<3; i++){
					System.out.print("과목:"+cls[i]+">");
					suInput[i]=sc.nextLine();
				}
				System.out.println("입력이 끝났습니다");
			}else if(msg==2){
				System.out.println(bar);
				System.out.println("과목:  국어   | 영어  | 수학");
				System.out.println(bar);
				System.out.println("\t"+suInput[0]+"\t"+suInput[1]+"\t"+suInput[2]);
			}else if(msg<3){
				System.out.println("메뉴를 다시입력하세요");
			}
		}
		System.out.println("종료되었습니다");		
		
	}

}
