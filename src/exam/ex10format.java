package exam;

public class ex10format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "정소이";
		int age = 23;
		String mbti = "INFJ";
		
		//1. string.format()
		//2. System. out.println()
		
		System.out.printf("이름 : %s, 나이: %d(세),MBTI : %s", name, age, mbti);
		String info = String.format("이름 : %s, 나이: %d(세),MBTI : %s", name, age, mbti);
		System.out.println(info);
		//%숫자s : 숫자 자릿수 만큼 표헌(오른쪽 정렬)
		//왼쪽정렬: 숫자 앞에 - 붙여서 
		System.out.printf("%10s", "*");
	}
	
	
	//%s: String
	//%d: decimal 정수 
	//%f : float 실수
	//%n : new(새로운 라인) 계행

}
