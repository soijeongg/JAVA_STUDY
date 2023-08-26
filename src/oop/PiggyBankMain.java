package oop;

public class PiggyBankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스  == 레퍼런스 데이터 타입
		PiggyBank bank1 = new PiggyBank();
		//bank1.money = 1000000000;
		//500원
		bank1.deposit(500);
		
		bank1.showMoney();
		//100원 출금 후  잔액
		bank1.withdraw(100);
		bank1.showMoney();
		
		//2번쨰 저금통
		PiggyBank bank2 = new PiggyBank(7000);
		//bank2.money =0;
		bank2.deposit(10000);
		bank1.showMoney();
		bank2.showMoney();
		

	}

}
