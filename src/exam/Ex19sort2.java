package exam;

import java.util.Arrays;

public class Ex19sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. select sort
		//로직은 동일한데 치환을 안하고 전체 값을 탐색하면서 첫번쨰 사이클 탐색시
		//마지막 값 빼고 가장 큰값을 정해 놨다가 그 값이 마지막 값보다 크면 교체한다
		int[] array = {98,7,70,13,24};
		
		int maxIndex =0;
		int temp =0;
		maxIndex=0;
		for (int j=5;j>1;j--) {
			for (int i=0;i<j; i++) {
				if(array[i]>array[maxIndex]) {
					maxIndex =i;
					//maxIndex는 인덱스 번호를 저장하는 것 위치 정보 저장
					// 이제 치환해야 함
					
					
				}
				
			}
			temp = array[j-1];
			array[j-1] = array[maxIndex];
			array[maxIndex] = temp;
			
		}
		System.out.println(Arrays.toString(array));
		
		
		

	}

}
