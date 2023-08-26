package exam;

import java.util.Arrays;

public class Ex11array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열: 인덱스를 가진 자료 구조
			// 동일한 자료구조를 index 를 통해 관리
			// 자료구조: 대량의 데이터 효율적으로 다루기 위해 사용
			//배열, 리스트 , 큐, 스택, 트리
		
		//변수의 선언
		int num; //변수의 선언
		num=5; //변수의 할당 최초 할당: 초기화
		num =10; //변수의 재랗당
		
		int num2 = 21; // 변수의 선언 및 초기화 
		// 금주 로또 번호 담고 있는 배열 lotto
		
		int[] lotto; // 배열의 선언 
		//레퍼런스 변수는 할당이라는 말 대신에 생성(new)이라는 말을 씀
		lotto = new int[6]; //배열 생성시 반드시 크기 결정
		//배열 index는 0-index 체계
		lotto[0] =2;
		lotto[1] =9;
		lotto[2] =17;
		lotto[3] =31;
		lotto[4] =35;
		lotto[5] =44;
		
		//배열.length  배열의 길이, 크기
		//메모리 적으로는 length 보다는 실제값을 출력하는게 더 메모리를 줄일 수 있음
		
		for (int i=0; i<lotto.length;i++) {
			System.out.println(lotto[i] + "");
	}
		//파이썬처럼 생성과 동시에 초기화
		int[] nums = {1,2,3,4,5};
		//int[] num2 = {5,6,7};
		
		
		

}
}
