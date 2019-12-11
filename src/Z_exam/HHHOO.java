package Z_exam;

import java.util.Arrays;
import java.util.Scanner;






public class HHHOO {

	
public static void main(String[] args){	
	
	
	
	
	
	ho.select();
		
	




}

	static String[] parkNum = { "--비어있음--", "--비어있음--", "--비어있음--", "--비어있음--", "--비어있음--", "--비어있음--", "--비어있음--" }; // 주차장 자릿수
	static String myCarNum = new String(); // 내차량 번호 입력할 변수
	static int myCarPosition = 0; // 내차량 위치를 저장할 변수
	
	
	
	int payMent = 10000;     //주차 요금
	
	
	
	public static HHHOO ho = new HHHOO();
	
	void select(){        //입차할 것인지 출차할 것인지 선택하는 창
		System.out.println("<< JYP Parking Center >>\n");
		System.out.println("  < 현재 주차현황 > ");
		for(int i = 0; i < ho.parkNum.length; i++){
			System.out.println("   " + ho.parkNum[i]);
		}
		System.out.println("- 원하시는 버튼을 누루세요. \n- 입차 >> 1번 버튼 \n- 출차 >> 2번 버튼");
		String text = new String();	
		Scanner scan = new Scanner(System.in);   //스케너 
		text = scan.nextLine();
		if(text.equals("1")){
			ho.inPut();
		}else if(text.equals("2")){
			ho.outPut();
		}else{
			System.out.println("잘못 누루셨습니다.");
			ho.select();
		}
	}
		

	
	
	void inPut(){   //입차시 고객의 차량번호 저장하기
		
		System.out.println("입차하실 고객님의 차량번호를 입력해 주세요.");
		String text = new String();	
		Scanner scan = new Scanner(System.in);   //스케너 
		text = scan.nextLine();
		if(text.length() == 7){
			System.out.println("고객님의 차량번호 [" + text + "]가 정상 입력되었습니다.");
		for(int i = 0; i < parkNum.length; i++){
			if(ho.parkNum[i] == "--비어있음--" ){
				ho.parkNum[i] = text;
				ho.select();
				break;
				}
			}
		}else{
			System.out.println("잘못 누루셨습니다.");
			ho.inPut();
		}
	}				
				
					

				
		

	
	void outPut(){    //출차시 저장해놨던 차량번호를 확인하고 결제창으로 넘기기
		System.out.println("출차하실 고객님의 차량번호를 입력해 주세요.");
		String text = new String();	
		Scanner scan = new Scanner(System.in);   //스케너 
		text = scan.nextLine();
		ho.myCarNum = text;
		if(text.length() == 7){
			System.out.println("고객님의 차량번호 <" + text + ">가 정상 입력되었습니다.");
			
			
			ho.cash();
		}else{
			System.out.println("입력하신 차량번호가 올바르지 않습니다.");
			ho.outPut();
		}
	}
	
	
	
	void cash(){     //결제창 결제금액보다
		System.out.println("고객님의 결제하실 금액은 " + payMent + "원 입니다.");
		System.out.println(payMent + "원을 투입해 주세요.");
		String text = new String();	
		Scanner scan = new Scanner(System.in);   //스케너 
		text = scan.nextLine();
		int intPay = Integer.parseInt(text); 	
		ho.reCash(payMent,intPay);
		
	}
			
			
	
	void reCash(int a, int b){
		
		if(a == b){
			System.out.println("주차요금 " + payMent + "원이 정상 결제 되었습니다. \n안녕히 가십시오");
			ho.finish();
		}else if(a > b){
			int c = a - b;
			System.out.println(c + "원이 부족합니다.");
			System.out.println(c + "원을 더 투입해주세요.");
			String text = new String();	
			Scanner scan = new Scanner(System.in);   //스케너 
			text = scan.nextLine();
			int intPay = Integer.parseInt(text); 	
			ho.reCash(c, intPay);
		
		}else if(a < b){
			int d = b - a;
			System.out.println("주차요금 " + payMent + "원이 정상 결제 되었습니다. \n잔돈 " + d + "원을 받아주세요. \n안녕히 가십시요.");
		}
		
	}

	void finish(){
		for(int i = 0; i < parkNum.length; i++){
			if(parkNum[i] == myCarNum){
				parkNum[i] = "--비어있음--";
				select();	
			}
		
		
		
		}
	}

	
	
	
	

}











