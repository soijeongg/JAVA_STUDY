package exam;

import java.util.Scanner;

public class Ex05con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나이를 입력받아서 20살 이상이면 성인 아니면 미성년자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age =sc. nextInt();
		if(age>=20) {
			System.out.println("성인입니다");
			
		}else {
			System.out.println("미성년자 입니다");
		}

		//한줄 옴기는 단축기 알트 + 위/아래 화살표
		//한줄을 복사하는 단축키: 알트 +컨트롤+ 위/아래 화살표
		
		if (age>=40) {
			System.out.println("아저씨 혹은 아줌마 입니다");
			
		}else if (age>=20) {
			System.out.println("성인입니다");
		
		}else {
				
			System.out.println("미성년자 입니다");
	}

}
}
