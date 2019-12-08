package Z_exam;

import java.util.Scanner;
import java.util.*;
public class Home {
	/*
	 * 주차 정산 시스템 
	 * 
	 * 1. 들어오는 차번호를 입력시 시간 카운팅 시작
	 * 2. 나갈 차번호를 입력시 지난 시간에 비례하여 금액 산정
	 * 3. 현금으로 할 것인지 카드로 할 것인지 선택
	 * 4. 현금 시 입금 금액 입력시 정산 및 거스름돈 출력
	 * 5. 카드 결제시 카드 번호 입력 후 정산 처리 완려 출력
	 * 6. 주차공간 개수 초과시 만차라는 문구 표현
	 *  */
	String[] carNum = new String[4];
//	"31수7857","31가2345","31나4567","49조8879"
	/*
	 * 입차인지 출차인지 선택하는 구문 출력
	 * */
	 String myCarNum = new String();
	 int myCarPosition = 0;
	public static Home h = new Home();
	public static void main(String[] args) {
	
		
		h.selectInOut();
		
		
	}
	void selectInOut(){
		for(int i = 0; i < h.carNum.length; i++){
			System.out.println(h.carNum[i]);
			
		}
		System.out.println("입차면 1번 출차면 2번을 입력하여 주세요.");
		
		String getText = new String();
		Scanner scan = new Scanner(System.in);
		getText = scan.nextLine();
		if(getText.equals("1")){
			h.inPutCar();
//			System.out.println("입력하신 입차 번호는" + getText + "입니다");
//			배열 카운팅 만석일시에 만석 표시 or inPutCar로 이동
		}else if(getText.equals("2")){
			System.out.println("입력하신 출차 번호는" + getText + "입니다");
			
			h.outPutCar();
			
//			outPutCar 로 이동
		}else{
			System.out.println("잘못 입력 하셨습니다");
			h.selectInOut();
		}
		
	}
	
	void inPutCar(){
		System.out.println("차번호를 입력하여 주십시오");
		Scanner scan = new Scanner(System.in);
		String txt = new String();
		txt = scan.nextLine();
		if(txt.length()==7 || txt.length() == 8){
//			1. 배열에 이번호가 있는지 없는지 비교하기
//			2. 배열에 빈공간이 있는지 없는지 비교하기
			System.out.println("차 번호는 " + txt);
			for(int i = 0; i <h.carNum.length; i++){
				if(txt.equals(h.carNum[i])){
					System.out.println("이미 있는 번호입니다 번호를 다시 입력해 주세요.");
					h.inPutCar();
				}else{
					if(h.carNum[i]==null||h.carNum[i]==""){
						h.carNum[i] = txt;
						h.selectInOut();
						break;
					}else{
						
					}
				}
				
				
			}	
			
		}else{
			System.out.println("다시 입력하여 주십시요");
			h.inPutCar();
		}
		
		
		/*차가 들어오는순간 시간을 가져와서 카운팅 함과 동시에 차 번호를 배열에 저장한다.
		 * */
	}
	void outPutCar(){
		/*배열에서 이 차번호가 있는지 확인하고 있을경우 selectPay로 이동
		 * 없을시에 없다는 경고 문구 표시후 다시 차번호 입력으로 이동
		 * */
		System.out.println("차번호를 입력하여 주십시요.");
		String getText = new String();
		Scanner scan = new Scanner(System.in);
		
		getText = scan.nextLine();
	
		myCarNum = getText;
		boolean b = Arrays.asList(h.carNum).contains(getText);
        if(b==true){
        	for(int i = 0; i <h.carNum.length; i++){
				if(getText.equals(h.carNum[i])){
					
						h.myCarPosition = i;
						
						System.out.println("차는 지금 " +h.myCarPosition+ "번째 공간에 있습니다.");
						h.selectPay();
						break;
					}else{
						
					}
				}
					
        	
        }else{
        	System.out.println("찾지 못하였습니다");
        	h.outPutCar();
        }
		
	}
	void selectPay(){
		System.out.println("현금으로 하실거면 1번 카드로 하실거면 2번을 입력해 주세요.");
		String getText = new String();
		Scanner scan = new Scanner(System.in);
		getText = scan.nextLine();
		switch (getText) {
		case "1":
			h.selectCash();
			break;
		case "2":
			h.selectCredit();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			h.selectPay();
			break;
		}
		/*현금으로 할 것인지 카드로 할 것인지 선택 번호를 표출후 선택하는 번호를 인풋 받는다.
		 * */
	}
	void selectCash(){
		System.out.println("현금결제 창 입니다.");
		/* 1. 현금일 경우 selectCash로 이동 받는 금액이 얼마인지와 내야할 금액이 얼마인지를 비교후 잔액을 표시한 후 출차 완료 표시(finishPay)
		 * 1-1. 만약 내야하는 금액보다 입력한 금액이 작을경우 금액이 잘 못 됐다는 문구 표현 및 모자라는 금액 출력.
		 * 
		 */
		int a = 3000;
		int b = 0;
		System.out.println("결제 비용은 "+ a + "원 입니다.");
		System.out.println(a + "원을 넣어 주십시요.");
		String getText = new String();
		Scanner scan = new Scanner(System.in);
		
		getText = scan.nextLine();
		b = Integer.parseInt(getText);
		if(b == a){
			h.finishPay();
		}else if(b > a){
			int c = b - a;
			
			System.out.println("거스름돈은"+ c + "원 입니다.");
			h.finishPay();
		}else if(b < a){
			int d = a-b;
			System.out.println("잔액이" + d + "원 모자랍니다.");
			System.out.println(d + "원을 추가로 넣어주세요.");
			scan = new Scanner(System.in);
			getText = scan.nextLine();
			int e = Integer.parseInt(getText);
			h.changeCash(d, e);
		}
		
		
		
	}
	void changeCash(int a, int b){
		if(a == b){
			h.finishPay();
		}else{
			int c = a-b;
			int d;
			System.out.println(c + "원이 모자랍니다.\n 추가요금을 넣어주세요.");
			String getText = new String();
			Scanner scan = new Scanner(System.in);
			
			getText = scan.nextLine();
			d = Integer.parseInt(getText);
			h.changeCash(c,d);
		}
	}
	void selectCredit(){
		System.out.println("카드결제 창입니다.");
		/* 2. 카드 일 경으 selectCredit 으로 이동 후 카드번호  16 자리 와 유효기간을 입력하게 한후 마지막으로 cvc 번호를 입력하는 구문출력.
		 * 2-1. 만약 카드번호를 잘못 입력하거나 숫자열이 아닐경우 잘못된 정보라는 문구와 함께 다시 카드번호를 입력하는 구문 출력
		 * 2-2. 만약 유효하지 않은 카드 번호일경우 유효하지 않는 번호라는 문구와 함께 다시 카드번호 입력하는 구문 출력
		 * 2-3. 모든게 정상적으로 진행 되었을때 finishPay로 이동.
		 * 
		 * 3. 특정 카드 번호를 미리 지정해놓고 그 카드번호가 입력 되었을때가 정상으로 처리되는 것으로 가정해놓는다.
		 *  ex) 1234 1234 1234 1234 12/23 123
		 */
		int a = 3000;
		int b = 0;
		System.out.println("결제 비용은 "+ a + "원 입니다.");
		System.out.println("카드번호를 적어 주십시요.");
		String getText = new String();
		Scanner scan = new Scanner(System.in);
		
		getText = scan.nextLine();
		
		if(getText.length()==16){
			h.finishPay();
		}else{
			System.out.println("카드번호가 잘못 되었습니다. \n 다시 입력하여 주십시요.");
			h.selectCredit();
		}
	}
	
	void finishPay(){
		System.out.println("차량번호 " + h.myCarNum + "의 주차요금이 정상 처리되었습니다 \n 안녕히 가십시요.");
		
		boolean b = Arrays.asList(h.carNum).contains(h.myCarNum);
        if(b==true){
        
        	
        	h.carNum[h.myCarPosition] = null;
        	
        }else{
        	System.out.println("찾지 못하였습니다");
        	h.outPutCar();
        }
        h.myCarNum = "";
        h.myCarPosition = 0;
		h.selectInOut();
	}
	
	
	
}
