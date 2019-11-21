package b_operator;

public class Arithmaticoperator {

	public static void main(String[] args) {
		/*
		 * << 산술 연산자 >>
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이향 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2 ;
		System.out.println(a);
		//수학과 같이 *, /, % 연산자가 +, -보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		
		a = (int)(10 + 20.3);   //10은 인트 (정수)  20.3은 더블(실수)  큰 값에 작은 값을 넣으면 형변환 생략가능 이미 더블타입되어 있음
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);
		//int보다 작은 정수 타입은 int로 형변환 후 연산이 수행된다.
		
		long e1 = 100000 * 100000;  //100000는 인트이다.
		System.out.println(e1); //오버플로우가 발생
		long e2 = 100000 * 100000L;  //피연사자 중 하나는 long이어야 결과로 long을 받을 수 있다.
		System.out.println(e2);
		
		float f1 = 10 / 4;
		System.out.println(f1);   //2.0
		float f2 = 10 / 4f;
		System.out.println(f2);    //2.5
		int f3 = 10 % 4;   //10을 4로 나눈 나머지
		System.out.println(f3);   //2
		
		//정수는 0으로 나눌 수 없다.
//      int g1 = 10 / 0; //런타임 에러 발생
		float g2 = 10.0f / 0;
		System.out.println(g2);  //infinity : 무한대
		float g3 = 0 /0f;
		System.out.println(g3);  //NaN : Not a Number
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D' - 'A';  //D = 68 - A = 65
		System.out.println(h3);
		
		int h4 = '5' - '0';  //5 = 53, 0 = 48
		System.out.println(h4);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		
		i = i + 1;
		i += 1;
		i = i + 2;
		i += 2;  //복합연산자
		//더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		i = i - 1;
		i -= 1;
		
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		//반올림해서 출력해주세요.
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		//소수점 두쨰자리에서 반올림해주세요.
		round = 3.14;
		System.out.println((int)(round * 10 + 0.5) / 10d);   //나누기 10 뒤에 d,f, 0.0 을 넣어야 소수첫째점까지 값이 나온다.
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 12345 + 654321
		//2. 1번의 결과 값  * 123456
		//3. 2번의 결과 값  / 123456
		//4. 3번의 결과 값  - 654321
		//5. 4번의 결과 값  % 12345
		
		
		
		double result = 12345 + 654321;
		result *= 123456;
		result /= 123456;
		result -= 654321;
		result %= 12345;
		System.out.println(result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//(평균은 소수점 두쨰자리에서 반올림)
		
		int num1 = 80;
		int num2 = 55;
		int num3 = 97;
		
		
		
		int sum = num1 + num2 + num3;
		double avg = (int)(sum / 3.0 * 10 + 0.5) / 10.0;
		System.out.println("합계 : " + sum + " / 평균 : " + avg); 
		
		
		
		
		
 	}

}
