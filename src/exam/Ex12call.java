package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call by value
		int num =5;
		int num2 =num;
		System.out.println(num2);
		num2 =10;
		System.out.println(num2);
		System.out.println(num);
		
		//call by Reference
		String[] snacks = {"베이키","리얼브라우니","꼬깔콘"};
		String[] drinks = {"데자와", "솔의눈", "ZICO"};
		
		System.out.println(Arrays.toString(snacks));
		System.out.println(Arrays.toString(drinks));
		drinks = snacks;
		System.out.println(Arrays.toString(drinks));
		snacks[0] = "새우깡";
		System.out.println(Arrays.toString(drinks));
		System.out.println(snacks);
		System.out.println(drinks);
		
		int age =23; 
		Scanner sc  = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		

	}

}
