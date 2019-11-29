package d_array;

import java.util.Scanner;

public class TTTTEESSTT {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
		sum += str.charAt(i) - '0';
		}
		System.out.println("sum=" + sum);

		
		/*[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
		은 코드를 넣어서 프로그램을 완성하시오.
		[연습문제]/ch4/Exercise4_13.java
		class Exercise4_13
		{
		public static void main(String[] args)
		{
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for(int i=0; i < value.length() ;i++) {
		
		(1) 알맞은 코드를 넣어 완성하시오.
		
		}
		if (isNumber) {
		System.out.println(value+"는 숫자입니다.");
		} else {
		System.out.println(value+"는 숫자가 아닙니다.");
		}
		} // end of main
		} // end of class
		[실행결과]
		2*1=2 3*1=3 4*1=4
		2*2=4 3*2=6 4*2=8
		2*3=6 3*3=9 4*3=12
		5*1=5 6*1=6 7*1=7
		5*2=10 6*2=12 7*2=14
		5*3=15 6*3=18 7*3=21
		8*1=8 9*1=9
		8*2=16 9*2=18
		8*3=24 9*3=27
		[실행결과]
		12o34는 숫자가 아닙니다.*/
		
		
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if (!('0' <= ch && ch <= '9')) 
				isNumber = false;
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} 
		else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
		
			
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//123456789 -> 123,456,789
		//12345 -> 12,345
		//1234 -> 1,234
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		String input = s.nextLine();
	
		for(int i = input.length() - 3; i > 0; i -= 3 ){
			String sub1 = input.substring(0,i);
			String sub2 = input.substring(i);
			 input = (sub1 + "," + sub2);
		}
		System.out.println(input);
		
			
		
		
		
		
		
		
		
			
	}

}
