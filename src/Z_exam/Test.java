package Z_exam;

public class Test {

	public static void main(String[] args) {
		
		
		
		/*[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_9.java*/
		
		char[][] star = {{'*','*',' ',' ',' '},
						 {'*','*',' ',' ',' '},
						 {'*','*','*','*','*'},
						 {'*','*','*','*','*'}};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
		for(int j=0; j < star[i].length;j++) {
		System.out.print(star[i][j]);
		}
		System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {
		for(int j=0; j < star[i].length;j++) {
		
		
		 }
		}
		for(int i=0; i < result.length;i++) {
		for(int j=0; j < result[i].length;j++) {
		System.out.print(result[i][j]);
		}
		System.out.println();
		}
		
		/*[실행결과]
		**
		**
		*****
		*****
		****
		****
		**
		**
		**
		Java의 정석定石 3판 - 연습문제 풀이 29*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}