package exam;

import java.util.Arrays;

public class Ex18sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정렬하는 이유 궁극적으로 탐색하기 위해 
		//정렬하기 위해 치환이 필요
		//1.Bubble Sort
		int[] array = {42,7,12,82,25};
		int temp =0;
		//cycle1
		for (int j=4;j>1;j--) {
			for (int i=0; i<j;i++) {
				if (array[i]>array[i+1]) {
					//치환
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
			}	
		}
		
		System.out.println(Arrays.toString(array));
		

}
}
}
