package exam;

public class Ex24MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5, 10); 
		sum(5, 10, 15); 
		//메소드 중복정의 : 메소드 오버로딩
		

	}
	private static void sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+ j+k);
		
	}
	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}

}
