package exam;

public class Ex01Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		System.out.println(num);
		
		//자료형 Data type
		//1. 논리형 boolean : 1byte
		boolean isRight = true;
		boolean isRain = false;
		
		//2. 문자형 (char) : 2byte
		char ch = 'A'; // 문자열은 홑따움표씀
		char ch2 ='a';
		char ch3 ='1'; // 정수형으로 변환하면 순서대로 65,97,49 나옴
		// 메모리에는 정수형으로 저장됨 저장되는게 아스키 코드로 저장
		
		//3. 정수형 (byte, short, int, long)
		//byte: 1byte (8bit) 2^8 ==256
		// -128 부터 127까지
		byte age =127;
		age+=1;
		System.out.println(age);
		//short: 2byte(16bit) 2^16 =65536
		short lunch = 10000;
		//int 4byte(32bit) 2^32 = 42억~ 
		int salary = 150000000;
		//long:: 8byte(64bit) 2^64 = 1800경
		long popular = 7000000000L;
		
		//4.실수형
		//float: 4byte
		float weight = 55f;
		//double: 8byte
		double PI = 3.1415926535;
		
		// Type Casting: 형변환
		//byte num2  = 128;
		//원래  int여서 4byte인데 1바이트에 꾸겨넣으면 넣을 수 있지만
		//손실이 일어날 수 있음 
		//할꺼면 너가 직접 명시해서 형 변환해
		byte num2  =(byte) 128;
		//명시적 형번환(Explicit Type Casting)
		System.out.print("num2: ");
		System.out.println(num2);
		// -128인 이유 오버플로
		
		short money = 30000;
		int num3 = money; //묵시적 형변환(Implicit Type Casting)
		//4비트의 공간에 2비트가 들어가기 때문에 형을 안 지정해줘도 됨
		
		//반드시 long넣을때는 뒤에 L넣기
		float height = 163.3f;
		long pop  = 7000000000L;
		
		//그 외 데이터 타입
		//String
		String name = "정소이";
		//차이점: 기본 데이터타입은 8가지
		//이외를 전부 묶어서 reference type
		
		
	
	}

}
