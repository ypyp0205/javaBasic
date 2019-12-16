package Z_exam;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) {
		
				String[] participant = {"leo", "kiki", "eden"};
				String[] completion = {"eden", "kiki"};  
				String txt;
				for(int i = 0; i < participant.length; i++){					
				    for(int j = 0; j < completion.length; j++){
				        if(!participant[i].equals(completion[j])){
				        	txt = participant[i];
				        	participant[i] = completion[j];
				        	completion[j] = txt;
				        		
				       
				        }
				        
				    }
				}
		
		
		
		
		
		
		
	}
	


		
		
		
	
}