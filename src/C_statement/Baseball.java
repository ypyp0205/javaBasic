package C_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		
		
		//숫자 야구게임을 만들어라
				Scanner s = new Scanner(System.in);
				int ball = 0, strike = 0, out = 0;
				int x, y, z;
				
	
				do{
					
					x=(int)(Math.random()*9)+1;
					y=(int)(Math.random()*9)+1;
					z=(int)(Math.random()*9)+1;
				}while(x==y || y==z || z==x);
				
				System.out.println(x + " " + y + " "+ z);
				
				int xx;
				int yy;
				int zz;
				do{
					do{
						System.out.println("숫자 3개를 입력하라");
						
						xx=Integer.parseInt(s.nextLine());
						yy=Integer.parseInt(s.nextLine());
						zz=Integer.parseInt(s.nextLine());
					}while(xx==yy || yy==zz || zz==xx);
						
					System.out.println();
				
					strike = ball = 0;
					
					if(x==xx) {
						strike++;
					}
					if(y==yy){
						strike++;
					}
					if(z==zz){
						strike++;
					}
					
					if(x==yy || x==zz){
						ball++;
					}
					if(y==xx || y==zz){
						ball++;
					}
					if(z==xx || z==yy){
						ball++;
					}
					out= 3-(strike+ball); 
					
					System.out.println(strike+" strike!  " + ball + " ball  "+ out +" out  ");
				}while(strike!=3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	//숫자 야구게임을 만들어주세요.
		
		Scanner s = new Scanner(System.in);
		
		
		
		
		int[] number = new int[3];    //랜덤 숫자가 들어갈 배열
        int[] answer = new int[3];    //도전해볼 숫자가 들어갈 배열
        int ball = 0; //볼의 개수
        int strike = 0;    //스트라이크 개수
        
        //랜덤함수 만드는 반복문
        for(int i=0; i<3; i++){
            number[i] = (int)(Math.random()*9)+1;
            for(int j=0; j<i; j++){    //중복숫자가 나오지 않게 하기위함
                if(number[i] == number[j]){
                    i--;
                    break;
                }
            }
        }
        
        	for(int i=0; i<3; i++){
            System.out.print(number[i]);
        }
        
        
        for(int x=0; x<10; x++){
            //도전할 숫자 입력
            for(int i=0; i<3; i++){
                answer[i] = s.nextInt();
            }
            
            //숫자와 자리가 맞다면 스트라이크+1, 숫자는 맞고 자리가 틀리면 볼+1
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(number[i] == answer[j]){
                        if(i == j){
                            strike++;
                        }else{
                            ball++;
                        }
                    }
                }
            }
                        
            if(ball == 0 && strike == 0){ //모든 숫자가 틀렸을 경우
                System.out.println("OUT!");
            }else if(ball == 0 && strike != 0){    
                if(strike==3){    //정답을 맞춘 경우
                    System.out.println("맞췄습니다. 승리했습니다!");
                    break;
                }else{
                    System.out.println(strike + "Strike");
                }
            }else if(ball != 0 && strike == 0){
                System.out.println(ball + "Ball");
            }else{
                System.out.println(strike + "Strike  " + ball + "Ball");
            }
            
            //한판이 끝나고 볼과 스트라이크 초기화 후 다시도전
            ball = 0;
            strike = 0;
            
            //10번안에 답을 못맞췄을 경우
            if(x==9){
                System.out.print("패배했습니다. 답은 ");
                for(int y=0; y<3; y++){
                    System.out.print(number[y]);
                }
                System.out.println("입니다.");
           
            
            
            
            
            
            }
        }
    
    */
 

		
		
		
		
		
		
		

	}

}
