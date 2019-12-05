package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 요이하다.
		 * 
		 * << 객체 생성 (인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리 (heap영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조 연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass();   //sc에는 클래스가 담겨있다.
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
			System.out.println(returnString);
			
		int returnInt = sc.method4(7, 15);
			System.out.println(returnInt);
			
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();
			
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker cm = new ClassMaker();
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 잇는 메서드는 리턴받은 값을 출력해주세요.
		
		
		
		/*cm.method1();
		
		String method2 = cm.method2();
		System.out.println(method2);
		
		cm.method3(3123);
		
		int method4 = cm.method4(31,23);
		System.out.println(method4);*/
		
		
		Calculator cc = new Calculator();
		
		double plus = cc.plus(123456,654321);
		System.out.println(plus);
		double minus = cc.minus(plus,123456);
		System.out.println(minus);
		double multi = cc.multi(minus,123456);
		System.out.println(multi);
		double division = cc.division(multi,654321);
		System.out.println(division);
		double remainder = cc.remainder(division,123456);
		System.out.println(remainder);
		
		
		
		
		
		
		
		
		
		
	}

}
