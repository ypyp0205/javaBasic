package e_oop;  //현재 클래스의 위치를 알려준다.

import java.util.*;  //다른 패키지에 있는 클래스의 위치를 알려준다.  java.util에 있는 Scanner를 사용하겠다는 뜻   Scanner자리에 *를 넣으면 모든것을 쓰겠다는 뜻

public class SampleClass {  //클래스명은 항상 첫글자는 대문자로!   클래스뒤에 이름을 붙이면 선언이 된다.
	
	int field = 10;  //전역변수 : 클래스 전체 영역에서 공유하는 변수
	
	
	/*
	 * - 메서드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 * - 리턴타입 메서드명(파라미터){ }
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야 하는 결과물
	 * - 파라미터(매개변수) : 실행에 필요한 정보  ( )안에 있는걸 파라미터라함
	 * 
	 */
	
	void method1(){       //void는 리턴타입 (피라미터도 리턴타입도 없는 메서드)
		System.out.println("피라미터도 리턴타입도 없는 메서드");
	}
	
	void method2(int parameter){      //(int parameter)는 이안에서만 사용하는 지역변수라고 생각하면 된다.
		System.out.println(parameter + "를 사용해 명령을 수행하는 메서드");
	}
	
	String method3(){      //타입만 적어주면 된다.
		return "명령 수행 후 결과물을 돌려주는 메서드";       
		//return : 메서드를 종료시키고 결과물을 돌려준다.
		//리턴타입이 없는 메서드에서는 메서드를 종료시킨다.  예)void
	}
	
	int method4(int a, int b){
		System.out.println(a + ", " + b + " 를 사용해 명령을 수행하고 결과물을 돌려주는 메서드");
		return a + b;
	}
		
		void test1(){
			System.out.println("test1 시작");  //1
			test3();
			System.out.println("test 종료");   //6ㄴ
		}
		
		void test2(){
			System.out.println("test2 시작");   //3
			System.out.println("test2 종료");   //4
		}
		
		void test3(){
			System.out.println("test3 시작");   //2
			test2();
			System.out.println("test3 종료");   //5
		}	
			
			
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

