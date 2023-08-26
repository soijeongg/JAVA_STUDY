package exam;

import java.util.Random;

public class Ex13lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		Random rd = new Random();
		//1~45 중 하나를 랜덤하게 만들어 대입
		
		for (int i=0; i< lotto.length;i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					
					i--;
					break;
					
				}
			}
					
		}
		
		System.out.println(lotto);
	}

}
