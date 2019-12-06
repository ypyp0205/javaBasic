package e_oop;

public class ClassMaker2 {
	
	public static void main(String[] args){
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.yp);
	}
	
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int yp = 77;
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		yp = 12;
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int yp){
		this.yp = yp;
	}
	
	ClassMaker2(long yp){
		this.yp = (int)yp;                                      //항상 생성자가 마지막에 실행되고  초기화 블럭과 명시적블럭은 자리가 위쪽일수록 먼저 실행된다.
	}

	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
	this(23);
	}
}

