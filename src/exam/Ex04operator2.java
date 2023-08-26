package exam;

public class Ex04operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자
		int num =5;
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		//2.대입연산자
		// =, +=, -=, *=, /=
		//대입연산자느 ㄴ오른쪽이 먼저 실행되서 오른쪽의 값을 왼쪽어 담는디
		
		//3. 산술연산자
		//+,-,*,/,,%
		System.out.println(7/3); //2
		//자바에서 정수 연산 정수는 정수 결과가 나온다 
		//2.33333 -> 실수 타입 double 인데 이게 int로 casting이 된다
		System.out.println(7*1.0/3);
		
		double num1 = 1.1;
		double num2 = 2.2;
		System.out.println(num1+num2);
		//부동소수점 실수부가 2의 -1부터 들어가기 떄문에 계산이 안되는 부분은 그냥 근사치 떄림
		
		//4.비교연산자
		
	//>,>=,<.<=,==,!=
	//연산의 결과는 : boolean의 데이터 타입(true, false)
		
	//5. 논리 연산자 
	// &&( and, 논리곱), ||(or, 논리합)
		
	//5. 삼항연산자
	// 메모리가 한정적일떄 if 대신에
	//(조건식) ?(실행문1):(실행문2)
	int num3 =22;
	System.out.println(num3%2 ==0? "돈까스":"제육볶음");
	}

}
