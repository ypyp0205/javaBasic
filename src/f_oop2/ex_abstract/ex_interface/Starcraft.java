package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	public static void main(String[] args) {
		SCV scv = new SCV();
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		
		scv.repair(tank);
//		scv.repair(marine);
		

	}

}


class Unit{
	int hp;  //체력
	final int MAX_HP;	//최대체력
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	Marine(){
		super(40);
	}
}
class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){
		//Repairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		//그러나  Repairable에는 멤버가 없기 때문에 아무것도 할 수 엇ㅂ다.
		//hp흫 멤버로 가진 부모클래스 Unit으로 형변환을 해줘야 한다.
		if(r instanceof Unit){ //Unit으로 형변환이 가능한지 확인
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{
	
}










