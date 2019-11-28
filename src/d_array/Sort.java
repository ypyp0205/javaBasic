package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * << 정렬 >> 
		 * -선택정령 : 첫번쨰 숫자부터 그 뒤의 모든 숫자들과 비굑해서 작은 수와 자리 바꾸시를 반복해 앞에서부터 작은 수를 채워나가는 방식
		 * 			
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * - 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 등수를 1씩 증가시키는 방식
		 */

	int[] numbers= new int[10];
	
	for(int i = 0; i < numbers.length; i++){
		numbers[i] = i + 1;
	}
	shuffle(numbers);
	System.out.println(Arrays.toString(numbers));
	
//	selectSort(numbers);   //선택정렬
//	bubblesort(numbers);    //버블정렬
//	insertsort(numbers);     //삽입정렬
	printRank(numbers);      //석차구하기
	
//	System.out.println(Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) {           //석차구하기
	
		int[] level = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j])
					level[i]++;
			}
		}
		System.out.println(Arrays.toString(level));
		
		
		
		
	}

	private static void insertsort(int[] numbers) {         //삽입정렬


		for(int i = 0; i < numbers.length-1; i++){                    
			int temp = numbers[i];
			int j = 0;
			for(j = i -1; j >= 0; j--){
				if(temp < numbers[j]){
					numbers[j + 1] = numbers[j];   //j + 1은 한칸뒤로
				}else{
					break;
				}
			}
		numbers[j + 1] = temp;
		}
	}

	private static void bubblesort(int[] numbers) {         //버블정렬
		/*
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9
		 */
		for(int i = 0; i < numbers.length-1; i++){                    
			boolean changed = false;
			for(int j = 0; j < numbers.length - i - 1; j++){
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}	
		
		
		
	}

	private static void selectSort(int[] numbers) {
		for(int i = 0; i < numbers.length-1; i++){                            //선택정렬
			for(int j = i + 1; j < numbers.length; j++){
		if(numbers[i] > numbers[j]){
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			
				}
			}
		}
	}

	private static void shuffle(int[] numbers) {
		for(int i =0; i < numbers.length * 10; i++){
			int random = (int)(Math.random() * numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	
	
		
		
		
		
	
	
	
	

		
	}

}
