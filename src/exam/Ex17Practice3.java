package exam;

public class Ex17Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5X5의 정방형 int타입 Matrix
		int[][] array = new int[5][5];
		
		int cnt= 1;
	   //안은 int타입
		
	  //입력부
		for (int i=0;i<5;i++) {
			for (int j=0 ;j<5;j++) {
				array[i][j]=cnt++;
			}
			
		}
		
		//출력부
		for (int i=0;i<5;i++) {
			for (int j=4 ;j>-1 ;j--) {
				System.out.printf("%2d " ,array[i][j]);
			
			
		 				}
			System.out.println();
		}
			
				
				
		
		
		

	}
	}
