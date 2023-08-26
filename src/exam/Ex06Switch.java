package exam;

public class Ex06Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int led =1; //1 or 2 or 3
		//led가 1이면 "led 1 on"
		//led가 2이면  "led 2 on"
		//led가 3이면 " led 3 on"
		
		// if문 쓰면 길어지고 메모리도 많이 차지 
		//이걸 막기 위해 나온게 switch - case 문
		// switch(값) case 값: 
		
		switch (led) {
		case 1 : System.out.println("led 1 on");
		case 2 : System.out.println("led 2 on");
		case 3 : System.out.println("led 3 on");
		default : System.out.println(" 잘못들어왔습니다");
		}

	}

}
