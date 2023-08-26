package exam;

public class Ex25oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//oop (object oriented Programming)
		
		//1. 기본 데이터 타입
		//2. 레퍼런스 데이터 타입
		//-1) 배열에 대한 레퍼런스 
		// -2?클래스에 대한 레퍼런스
		// -3) 인터페이스에 대한 레퍼런스 
		//만든 파일이 데이터 타입이 됨
		House soi_house = new House();
		//이렇게 되어있는데 대문자에 ()클래스로 생각 소문자면 메소드 
		soi_house.price = 200000000;
		soi_house.area = 20;
		soi_house.isApart = true;
		
		System.out.println(soi_house.price);
		
		
		House parent_house = new House();
		parent_house.price = 200000;
		System.out.println(soi_house.price);
		

	}

}
