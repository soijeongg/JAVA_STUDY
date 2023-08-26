package oop;

public class Moviemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//영화 5개를 넣을 수 있는 객체 배열 movies 출력
		//이 안에는 movie 배열이 담기며 데이터 자료형이 movies
		
		Movie [] movies = new Movie[5];
		movies[0] = new Movie ("오펜하이머",180 ,8.5);
		movies[1] = new Movie ("달짝지근해: 7510",119 ,8.0);
		movies[2] = new Movie ("콘크리트 유토피아",130 ,8.2);
		movies[3] = new Movie ("밀수",129 ,8.0);
		movies[4] = new Movie ("엘리멘탈",109 ,8.9);
		
		for (int i=0; i< movies.length;i++) {
			System.out.print(i+ 1+ "위");
			movies[i].showname();
		}
		

	}

}
