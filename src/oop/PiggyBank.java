package oop;

public class PiggyBank {
	   private int money = 5000; //돈
	
	//클래스 내 필드와 메서드 가 있음  합쳐서 member라고 부름
	//field(멤버 변수 , 속성, 특성, 변수)
	//method (멤버 기능,행동, 행위, 동작)
	
	//이 아래있는 money는 클래스에서 메소드에서 쓰이는 지역변수이고 위에 
	//있는 변수는 전역변수 
	//똑같은 이름이 있을떄는 가장 가까이에 있는 변수를 가르킴
	   
	public PiggyBank() { 
		money = 5000;
	}
	public PiggyBank(int money) {
		this.money = money;
	}
	public void deposit(int money) {
		
	//외부에서 접근할 수 있는 범위를 멤버에 설정
	//접근제한자
	//1) public : 모든 범위에서 접근 가능
	//2) protected: 같은 패킺디 + 상속관계 에서 접근 가능
	//3) default : 같은 패기지 내에서만 접근 가능
	//4) private: 해당 클래스 내에서만 접근 가능(캡슐화)
	
	
		this.money  += money;
		
		
	}
	public void withdraw(int money) {
		this.money  -= money;
		
		
	}
	public void showMoney() {
		System.out.println("현재 잔액 :" + money );
		
		
	}
	

}
