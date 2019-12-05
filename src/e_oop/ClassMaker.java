package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해주세요.
		String name = "JYP";
		
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
				
		void method1(){       
			System.out.println(name);
		}
		
		//전역변수와 동일한 타입의 리턴타입이 잇고 파라미터가 없는 메서드 하나를 만들어 주세요.
		//매서드 안에서 전역변수를 리턴해주세요.
		String method2(){       
			return name;
		}
		//리턴타입은 없고 파라미터가 하나 잇는 메서드를 만들어주세요.
		//메서드 안에서 파라미터를 출력해주세요.
		void method3(int parameter){
			System.out.println(parameter);
		}

		//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
		//메서 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
		int method4(int a, int b){
			return a*b; 
		}
			
		
}