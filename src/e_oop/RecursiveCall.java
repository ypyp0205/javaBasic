package e_oop;

public class RecursiveCall {


		/*
		 * << 재귀호출 >>
		 * - 메서드 내에서 메서드 자신을 로출하는 것이다.
		 * - 재귀호출을 하는 메서드를 대쥐 메서드라고 한다.
		 * - 무한 반복을 벗어나기 위한 조건이 잇어야 한다.
		 */

	public static void main(String[] args) {
		//팩토리얼 : 4! == 4 * 3 * 2 * 1 == 24
		int result = factorial(4);
		System.out.println(result);
	}

	/*
	 * |factorial(1)|  1 * factorial(0) = 1
	 * |factorial(2)|  2 * factorial(1) = 2 * 1
	 * |factorial(3)|  3 * factorial(2) = 3 * 2 * 1
	 * |factorial(4)|  4 * factorial(3) = 4 * 3 * 2 * 1
	 * |main()		|
	 */
	
	
	private static int factorial(int i) {
		int result = 0;
		
		if(i == 1){
			result = 1;
		}else{
			result = i * factorial(i - 1);
		}
		
		return result;
	}
}
	

	  
	  
