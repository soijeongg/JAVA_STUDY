package oop;

public class Contact {
	
	//우리반 이름 저장할 수 있는 자료구조
	//이름, 나이, MBTI
	
	private String name;
	private int age;
	private String mbti;

	public Contact(String name, int age, String mbti) {
		
		this.name = name;
		this.age = age;
		this.mbti = mbti;
	}
	public void showinfo() {
	System.out.printf("이름: %s, 나이 : %d, MBTI: %s\n",
			name, age, mbti);	
	}
	//이름: 정소이 나이: 23세 MBTI: INFJ

}
