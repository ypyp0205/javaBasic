package Z_exam;

public class Exam07 {

	public static void main(String[] args) {
		
		
	}
		// 풀지마!!!!!  1, 2, 14, 18, 19, 21, 22, 23, 25~~

//---------------------------------------------------------------------------------		
		/*[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.*/
		
		/*[정답] 오버라이딩(overriding)이란, ‘조상 클래스로부터 상속받은 메서드를 자손 클래
		스에 맞게 재정의 하는 것’을 말한다.
		조상 클래스로부터 상속받은 메서드를 자손 클래스에서 그대로 사용할 수 없는 경우가
		많기 때문에 오버라이딩이 필요하다.
		*/
		
//---------------------------------------------------------------------------------
		
		
		
		
		/*[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)  d, e
		a. 조상의 메서드와 이름이 같아야 한다.
		b. 매개변수의 수와 타입이 모두 같아야 한다.
		c. 리턴타입이 같아야 한다.
		d. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
		e. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.*/
		
		/*자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
		- 이름이 같아야 한다.
		- 매개변수가 같아야 한다.
		- 리턴타입이 같아야 한다.
		조상 클래스의 메서드를 자손 클래스에서 오버라이딩할 때
		1. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
		2. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
		3. 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
		*/
		
//---------------------------------------------------------------------------------		
		
		/*
		[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
		위해서는 코드를 어떻게 바꾸어야 하는가?
		[연습문제]/ch7/Exercise7_5.java
		class Product
		{
		int price; // 제품의 가격
		int bonusPoint; // 제품구매 시 제공하는 보너스점수
		
    >>>	product(){}  -->기본생성자가 빠져있었음
		
		Product(int price) {       
		this.price = price;
		bonusPoint =(int)(price/10.0);
			}
		}
		
		class Tv extends Product {
		Tv() {}
		
		public String toString() {
		return "Tv";
		}
		}
		
		class Exercise7_5 {
		public static void main(String[] args) {
		Tv t = new Tv();
			}
		}
		*/
//--------------------------------------------------------------------------------
		/*[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
		가?
		[정답] 조상에 정의된 인스턴스 변수들이 초기화되도록 하기 위해서.
		[해설] 자손클래스의 인스턴스를 생성하면 조상으로부터 상속받은 인스턴스변수들도 생성
		되는데, 이 상속받은 인스턴스변수들 역시 적절히 초기되어야 한다. 상속받은 조상의 인
		스턴스변수들을 자손의 생성자에서 직접 초기화하기보다는 조상의 생성자를 호출함으로써
		초기화되도록 하는 것이 바람직하다.
		각 클래스의 생성자는 해당 클래스에 선언된 인스턴스변수의 초기화만을 담당하고, 조상
		클래스로부터 상속받은 인스턴스변수의 초기화는 조상클래스의 생성자가 처리하도록 해야
		하는 것이다.*/
	
//--------------------------------------------------------------------------------	
/*
		[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
		[연습문제]/ch7/Exercise7_7.java*/
		class Parent {
		int x=100;
		Parent() {
		this(200); // Parent(int x)를 호출
		}
		Parent(int x) {
		this.x = x;
		}
		int getX() {
		return x;
		}
		}
		
		class Child extends Parent {
		int x = 3000;
		Child() {
		this(1000); // Child(int x)를 호출
		}
		Child(int x) {
		this.x = x;
		}
		}
		/*class Exercise7_7 {
		public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX());
		}
		}
		
		[정답] Child() → Child(int x) → Parent() → Parent(int x) → Object()의
		순서로 호출된다.
		*/
//--------------------------------------------------------------------------------


		/*[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		것은?
		a. public-protected-(default)-private
		b. public-(default)-protected-private
		c. (default)-public-protected-private
		d. private-protected-(default)-public
		[정답] a*/

//--------------------------------------------------------------------------------

/*
		[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
		옳지 않은 것은? (모두 고르시오)
		a. 지역변수 - 값을 변경할 수 없다.
		b. 클래스 - 클래스에 새로운 멤버를 추가할 수 없다.
		c. 메서드 - 오버로딩을 할 수 없다. ← 오버라이딩(overriding)을 할 수 없다.
		d. 멤버변수 - 값을 변경할 수 없다.
		[정답] c
		[해설] 제어자 final은 '마지막의' 또는 '변경될 수 없는'의 의미를 가지고 있으며 거의
		모든 대상에 사용될 수 있다.

		제어자 대상 의 미
		final
		클래스
		변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다.
		그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
		메서드
		변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해
		재정의 될 수 없다.
		멤버변수
		변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 된다.
		지역변수
*/


//--------------------------------------------------------------------------------


	/*	[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		getter와 setter메서드를 추가하라.*/


	class MyTv2 {
		boolean isPowerOn;
		int channel;
		int volume;
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
			
		public void setVolume(int volume) {
			if (volume > MAX_VOLUME || volume < MIN_VOLUME)
				return;
			this.volume = volume;
		}

		public int getVolume() {
			return volume;
		}
			
		public void setChannel(int channel) {
			if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
				return;
			this.channel = channel;
		}
			
		public int getChannel() {
			return channel;
		}
	}
		
			/*class Exercise7_10 {
			public static void main(String args[]) {
			MyTv2 t = new MyTv2();
			t.setChannel(10);
			System.out.println("CH:"+t.getChannel());
			t.setVolume(20);
			System.out.println("VOL:"+t.getVolume());
			}
			}
			[실행결과]
			CH:10
			VOL:20*/

//--------------------------------------------------------------------------------
	/*[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
	기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
	[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
	메서드명 : gotoPrevChannel
	기 능 : 현재 채널을 이전 채널로 변경한다.
	반환타입 : 없음
	매개변수 : 없음*/
	
	
	class MyTv3 {
		boolean isPowerOn;
		int channel;
		int volume;
		int prevChannel; // 이전 채널(previous channel)
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		public void setVolume(int volume){
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
		return;
		this.volume = volume;
		}
		public int getVolume(){
		return volume;
		}
		public void setChannel(int channel){
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
		return;
		prevChannel = this.channel; // 현재 채널을 이전 채널에 저장한다.
		this.channel = channel;
		}
		public int getChannel(){
		return channel;
		}
		public void gotoPrevChannel() {
		setChannel(prevChannel); // 현재 체널을 이전 채널로 변경한다.
		}
		}
		/*class Exercise7_11 {
		public static void main(String args[]) {
		MyTv2 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		}
		}
	
	
		[실행결과]
		CH:10
		CH:20
		CH:10
		CH:20*/

//--------------------------------------------------------------------------------	
	
	/*[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. public은 접근제한이 전혀 없는 접근 제어자이다.
			b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
			c. 지역변수에도 접근 제어자를 사용할 수 있다.
			d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
			e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.
			[정답] c
			[해설]*/
	
//--------------------------------------------------------------------------------
	
	/*[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
			[정답] Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기 때
			문에 객체를 생성할 필요가 없기 때문
			[해설] Math클래스는 몇 개의 상수와 static메서드만으로 구성되어 있기 때문에 인스턴스
			를 생성할 필요가 없다. 그래서 외부로부터의 불필요한 접근을 막기 위해 다음과 같이 생
			성자의 접근 제어자를 private으로 지정하였다.
			public final class Math {
			private Math() {}
			//...
			}*/
	
	
//--------------------------------------------------------------------------------	
	
	/*[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
			(모두 고르시오.)
			class Unit {}
			class AirUnit extends Unit {}
			class GroundUnit extends Unit {}
			class Tank extends GroundUnit {}
			class AirCraft extends AirUnit {}
			Unit u = new GroundUnit();
			Tank t = new Tank();
			AirCraft ac = new AirCraft();
			
			a. u = (Unit)ac;
			b. u = ac;
			c. GroundUnit gu = (GroundUnit)u;
			d. AirUnit au = ac;
			e. t = (Tank)u; ← 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
			f. GroundUnit gu = t;
			[정답] e*/
	
	
//--------------------------------------------------------------------------------
	
	
	/*[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
			class Car {}
			class FireEngine extends Car implements Movable {}
			class Ambulance extends Car {}
			FireEngine fe = new FireEngine();
			a. fe instanceof FireEngine
			b. fe instanceof Movable
			c. fe instanceof Object
			d. fe instanceof Car
			e. fe instanceof Ambulance
			[정답] e
			[해설] instanceof연산자는 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해
			true를 반환한다. 그래서, 아래 그림에서 알 수 있듯이 FireEngine인스턴스는 Object,
			Car, Movable, FireEngine타입에 대해 instanceof연산을 하면 결과로 true를 얻는다. 어
			떤 타입에 대해 instanceof연산결과가 true라는 것은 그 타입으로 형변환이 가능하다는
			것을 뜻한다. 참조변수의 형변환을 하기에 앞서 instanceof연산자로 형변환이 가능한지
			미리 확인해 보는 것이 좋다.*/
	
//--------------------------------------------------------------------------------
	
	/*[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
	클래스를 상속받도록 코드를 변경하시오.*/
	/*class Marine { // 보병
	int x, y; // 현재 위치
	void move(int x, int y) {  지정된 위치로 이동  }
	void stop() {  현재 위치에 정지  }
	void stimPack() {  스팀팩을 사용한다.}
	}
	class Tank { // 탱크
	int x, y; // 현재 위치
	void move(int x, int y) {  지정된 위치로 이동  }
	void stop() {  현재 위치에 정지  }
	void changeMode() {  공격모드를 변환한다. }
	}
	class Dropship { // 수송선
	int x, y; // 현재 위치
	void move(int x, int y) {  지정된 위치로 이동  }
	void stop() {  현재 위치에 정지  }
	void load() {  선택된 대상을 태운다. }
	void unload() {  선택된 대상을 내린다. }
	}*/
	
	
	/*[정답] 각 클래스의 공통부분을 뽑아서 Unit클래스를 생성하면 된다. 클래스마다 이동하
	는 방법이 다르므로 move메서드는 추상메서드로 정의하였다. 책에도 같은 내용이 있기 때
	문에 자세한 설명은 생략하겠다.*/
	abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // 추상클래스
	void stop() { /* 현재 위치에 정지 */ }
	}
	class Marine extends Unit { // 보병
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stimPack() { /* 스팀팩을 사용한다.*/}
	}
	class Tank extends Unit { // 탱크
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void changeMode() { /* 공격모드를 변환한다. */}
	}
	class Dropship extends Unit { // 수송선
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void load() { /* 선택된 대상을 태운다.*/ }
	void unload() { /* 선택된 대상을 내린다.*/ }
	}
	
//--------------------------------------------------------------------------------
	
	/*[7-20] 다음의 코드를 실행한 결과를 적으시오.
	[연습문제]/ch7/Exercise7_20.java
	class Exercise7_20 {
	public static void main(String[] args) {
	Parent p = new Child();
	Child c = new Child();
	System.out.println("p.x = " + p.x);
	p.method();
	System.out.println("c.x = " + c.x);
	c.method();
	}
	}
	class Parent {
	int x = 100;
	void method() {
	System.out.println("Parent Method");
	}
	}
	class Child extends Parent {
	int x = 200;
	void method() {
	System.out.println("Child Method");
	}
	}
	
	[실행결과]
			p.x = 100
			Child Method
			c.x = 200
			Child Method*/
	
	
//--------------------------------------------------------------------------------
	
	/*[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
				a. 표준화를 가능하게 해준다.
				b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
				c. 독립적인 프로그래밍이 가능하다.
				d. 다중상속을 가능하게 해준다.
				e. 패키지간의 연결을 도와준다.
				
			[정답] e
			[해설] 인터페이스를 사용하는 이유와 그 장점을 정리해 보면 다음과 같다.
			
			1. 개발시간을 단축시킬 수 있다.
			일단 인터페이스가 작성되면, 이를 사용해서 프로그램을 작성하는 것이 가능하다. 메서드를 호출하
			는 쪽에서는 메서드의 내용에 관계없이 선언부만 알면 되기 때문이다.
			그리고 동시에 다른 한 쪽에서는 인터페이스를 구현하는 클래스를 작성하도록 하여, 인터페이스를
			구현하는 클래스가 작성될 때까지 기다리지 않고도 양쪽에서 동시에 개발을 진행할 수 있다.
			
			2. 표준화가 가능하다.
			프로젝트에 사용되는 기본 틀을 인터페이스로 작성한 다음, 개발자들에게 인터페이스를 구현하여 프
			로그램을 작성하도록 함으로써 보다 일관되고 정형화된 프로그램의 개발이 가능하다.
			
			3. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
			서로 상속관계에 있지도 않고, 같은 조상클래스를 가지고 있지 않은 서로 아무런 관계도 없는 클래
			스들에게 하나의 인터페이스를 공통적으로 구현하도록 함으로써 관계를 맺어 줄 수 있다.
			
			4. 독립적인 프로그래밍이 가능하다.
			인터페이스를 이용하면 클래스의 선언과 구현을 분리시킬 수 있기 때문에 실제구현에 독립적인 프로
			그램을 작성하는 것이 가능하다. 클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접
			적인 관계로 변경하면, 한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프
			로그래밍이 가능하다.*/
	
	
	
	
	
	
	
	
	

}
