package exam;

public class Ex14TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] snacks = {"초코송이", "빼뺴로", "포카칩"};
		String[] drinks = {"아침햇살", "포카리스웨트", "봉봉"};
		String[] coffee = {"아아", "디카페인커피", "라떼"};
		
		String [] [] store = new String [3][];
		//배열 만들때 반드시 정의 되어야 하는것 ==길이 or 크기 정의
		store[0] = snacks;
		store[1] = drinks;
		store[2] = coffee;
		System.out.println(store[1][1]); //포카리스웨트 젒근
		System.out.println(drinks[1]);
		
		//다차원 배열 선언시 안쪽의 데이터 타입은 하위차원의 자료형을 따른다
		//아 string을 묶을 2차원 배열들은 다 같이 string이여야 한다
		
		//생성과 동시에 초기화
		
		String [] [] store2 = {snacks, drinks, coffee};
		
	}

}
