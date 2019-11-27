package d_array;

import java.util.Arrays;


public class TSSSSSSSSS {

	public static void main(String[] args) {


			
		/*
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		int max = numbers[0]; // 최대값
		int min = numbers[0]; // 최소값

		for (int i = 0; i < numbers.length; i++)
			if (max < numbers[i]) {
				max = numbers[i];

			} else if (min > numbers[i]) {
				min = numbers[i];

			}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		*/
		
/*		int[] abc = new int[10];

		for (int i = 0; i < abc.length; i++) {
			abc[i] = (int) (Math.random()*100)+1;
		}

		int max = abc[0];
		int min = abc[0];

		for (int i = 0; i < abc.length; i++)
			if (max < abc[i]){
				max = abc[i];

			}else if (min > abc[i]){
				min = abc[i];
			}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);*/
		
		
		
		/*int[] ko = new int[10];
		
		for(int i = 0; i < ko.length; i++){
			ko[i] = (int)(Math.random()*100)+1;
		}
		int mx = ko[0];
		int mn = ko[0];
		
		for(int i = 0; i < ko.length; i++)
		if( mx < ko[i]){
			mx = ko[i]; 
		}	
		else if( mn > ko[i]){
			     mn = ko[i];
		}
		System.out.println("최대값은" + mx + "최소값은" + mn);*/
		
		
		
		int[] ko = new int[10];
			
		for(int i = 0; i < 500; i++){
			int bo = (int)(Math.random()*10)+1;
			ko[bo-1]++;
		}
			System.out.println(Arrays.toString(ko));
			
		
				
		
		
	
		
		
		
		
		
		
		
	}

}
