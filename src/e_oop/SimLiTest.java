package e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		new SimLiTest().question1();
	}
	String questions[] = {"나는 금사빠다 , 금방 사랑에 빠진다 y/n",
						"연애를 할 떄 끌려다니느 타입이다 y/n",
						"데이트 코스는 미리짜는게 편하다 y/n",
						"감정 기복이 크지않다 y/n",
						"감정표현에 솔직한 편이다 y/n",
						"활동적인 데이트가 좋다 y/n",
						"연락이 없어도 믿고 기다리는 편이다 y/n",
						"이성친구는 존재할 수 없다 y/n",
						"아무것도 아닌일에 쉽게 섭섭함이 쌓인다 y/n"};
	
	String result[] = {	"서로에 대한 신뢰감이 깊고 존중해주는 타입어른스러운 연애를 하는 A타입", 
						"구속을 하는것도, 받는 것도 싫은 자유로운 연애를 하는 B타입",	
						"이것은 의리인가 사랑인가 친구같이 편안한 연애를 하는 C타입",
						"무조건 잘해주고 무조건 맞춰주는 다 퍼주는 연애를 하는 D타입"};

	Scanner scanner = new Scanner(System.in);
	
	void question1(){
		System.out.println(questions[0]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question2();
		}else{
			question4();
		}
	}	
	void question2(){
		System.out.println(questions[1]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question5();
		}else{
			question3();
		}
	}
	void question3(){
		System.out.println(questions[2]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question6();
		}else{
			question5();
		}
	}
	void question4(){
		System.out.println(questions[3]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question7();
		}else{
			question5();
		}
	}
	void question5(){
		System.out.println(questions[4]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question8();
		}else{
			question6();
		}
	}
	void question6(){
		System.out.println(questions[5]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question8();
		}else{
			question9();
		}
	}
	void question7(){
		System.out.println(questions[6]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			type_A();
		}else{
			question8();
		}
	}
	void question8(){
		System.out.println(questions[7]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question9();
		}else{
			type_B();
		}
	}
	void question9(){
		System.out.println(questions[8]);
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			type_D();
		}else{
			type_C();
		}
	}
	void type_A(){
		System.out.println(result[0]);
	}
	void type_B(){
		System.out.println(result[1]);	
	}
	void type_C(){
		System.out.println(result[2]);		
	}
	void type_D(){
		System.out.println(result[3]);	
	}
}