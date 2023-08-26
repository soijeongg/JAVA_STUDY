package oop;

public class Contactmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//핵심역량프로젝트 팀원들 정보 저장
		
		//vo(value Object): 사용자 정의 객체 
		Contact team1 = new Contact("정소이", 23, "INFJ");
		//team1.showinfo();
		Contact team2 = new Contact("김슬기", 25, "ESTJ");
		//team2.showinfo();
		Contact team3 = new Contact("이재준", 32, "ISTP");
		//team3.showinfo();
		Contact team4 = new Contact("최강인", 32, "ENFP");
		//team4.showinfo();
		Contact team5 = new Contact("박성현", 27, "ISTJ");
		//team5.showinfo();
				
		Contact[] teams = {team1, team2, team3, team4, team4

		};
		for (int i =0;i<5;i++) {
			teams[i].showinfo();
		}
		//1차원 배열이고 안쪽에 있는 자료형은 우리가 만든것
		//

	}

}
