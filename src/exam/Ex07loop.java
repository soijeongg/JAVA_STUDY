package exam;

import java.util.Scanner;

public class Ex07loop {
	public static void main(String[] args) {
		
		// 1. for 
		// 대개 반복횟수가 정해져 있을때
		//가로로 1~10까지 출력 문법은 아두이노와 동일
		for (int i=1; i<=10; i++){
			System.out.print(i +"");
			System.out.println();
		}
		
		//2. while 
		// 대개 반복횟수가 정해져 있지 않을때 
		// 사용자로부터 정수를 입력받아 누적 합을 출력
		//3 ->3
		//5->8
		//만약 -1을 입력하면 종료되었습니다 라는 문구와 함께 반복문 종료
		int sum =0;
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			Scanner num = new Scanner(System.in);
			int nn = num.nextInt();
			if (nn==-1) {
				System.out.println("종료되었습니다");
				break;
			}
			sum +=nn;
			System.out.println("누적합 : "+ sum);
			
			
		}
	
		for (;;) {
			System.out.print("정수를 입력하세요 : ");
			Scanner num = new Scanner(System.in);
			int nn = num.nextInt();
			if (nn==-1) {
				System.out.println("종료되었습니다");
				break;
			}
			sum +=nn;
			System.out.println("누적합 : "+ sum);
			
		}
	
		
	}

}
