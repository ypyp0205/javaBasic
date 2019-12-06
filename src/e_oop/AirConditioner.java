package e_oop;

public class AirConditioner {
	
	boolean power;  //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}

	
	
	//전원 버튼
	void power(){
		power = !power;
	}
	
	//온도
	void temperatureUp(){
		if(30 > temperature && power){
		temperature++;
			
		}
	}
	
	//온도 - 버튼
	void temperatureDown(){	
		if(18 < temperature && power){
			temperature--;
			
		}
	}
	
	//풍량 버튼
	void airVolume(){
	if(power){
		if(3 < ++airVolume && power){
			airVolume = 1;
			}
	 	}
	}	
	//온도가 18 ~ 30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을 때만 버튼들이 작동되도록 메서드들을 변경해주세요.

			
		
	
	
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		
		 
		ac.power();
		System.out.println(ac.power);
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureDown();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		ac.temperatureUp();
		
		System.out.println(ac.temperature);
		
		
	}
	}










































