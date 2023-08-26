package exam;

import java.util.ArrayList;

public class Ex26Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList: 가변배열
		//1. 크기 or 길이 : 변할 수 있음
		// Array list ; 레펀런스 타입 
		
		ArrayList<String> movies = new ArrayList<>();
		//이 <>안에 자료형
		//생성 파트의 DataType.은 생략가능 (JAVA 1.8이상시)
		movies.add("오팬하이머");
		movies.add("엘리멘탈");
		movies.add("세븐틴 더 뮤비 :POWER OR LOVE");
		movies.add("12명의 성난 사람들");
		movies.add("굿바이 레닌");
		//값 추가
		movies.add(1, "킹스 스피치");
		//값 삭제 
		movies.remove(2);
		//값을 전부 삭제하는 메소드 : clear()
		movies.clear();
		movies.remove("엘리멘탈");
		for (int i=0; i<movies.size();i++) {
			System.out.println(movies.get(i));
		}
		
		
		
		
		
		
		

	}

}
