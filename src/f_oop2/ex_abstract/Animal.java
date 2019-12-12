package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려간다~~~~");
	}
	abstract void bark();
}


class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍!!");
	}
}


class Tiger extends Animal{

	@Override
	void bark() {
		System.out.println("으르렁~~");
	}
}


class Monkey extends Animal{

	@Override
	void bark() {
		System.out.println("우이히하하하하~~!");
	}
}



