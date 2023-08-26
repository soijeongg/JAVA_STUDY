package exam;

public class Ex23athcrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10; 
		int num2 = 2;
		boolean divisor = isDivisor(num1,num2);
		System.out.println(divisor);
		//getDivisor(10);
		int num = 1000;
		int result = getSumOfDivisors(num);
		System.out.println(num + "의 약수의 합 :" + result);
		

	}

	public static int getSumOfDivisors(int num) {
		// TODO Auto-generated method stub
		int results = 0;
		for (int i=1; i<=num;i++) {
			if (num%i==0) {
				results+=i;
			}
		}
		return results;
		
		
	}

	public static boolean isDivisor(int num1, int num2) {
		// TODO Auto-generated method stub
		
		return num1 % num2 ==0;
		
		}
	//public static void getDivisor (int num) {
		//String result = "";
		
		//System.out.print(num+"의 약수 ");
		//for (int i=1; i<=num;i++) {
			
			
				
			
			
		//}
		
		
	}
		
	
	


