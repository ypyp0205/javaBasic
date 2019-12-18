package Z_exam;

import java.util.ArrayList;

public class Exem_Chart {

	public static void main(String[] args) {

		/*

		 *  우리반 모두의 Java, Orecle, HTML, CSS JQuery, JSP 점수를

		 *  50~100까지 랜덤으로 생성시켜주고,

		 *  석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력하라

		 *  

		 *  순위  이름   Java Oracle HTML CSS JQuery JSP  총첨    평균

		 *  1   홍길동   90	 100   80   50   30    90  400  70

		 *  2   홍길동   90	 100   80   50   30    90  400  70

		 *  3   홍길동   90	 100   80   50   30    90  400  70

		 *  4   홍길동   90	 100   80   50   30    90  400  70

		 *  5   홍길동   90	 100   80   50   30    90  400  70

		 */
		

		
	//	ArrayList<ArrayList<String>> students1 = new ArrayList<>();
	
		ArrayList<String> subject = new ArrayList<>();
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("CSS");
		subject.add("JQuery");
		subject.add("JSP");
		
		
		
		ArrayList<String> students = new ArrayList<>();
		students.add("이름");
		students.add("김지선");
		students.add("이누리");
		students.add("정대석");
		students.add("박종민");
		students.add("정재영");
		students.add("강현철");
		students.add("주향한");
		students.add("윤창훈");
		students.add("연은주");
		students.add("김령환");
		students.add("구한나");
		students.add("백종빈");
		students.add("이병훈");
		students.add("강현지");
		students.add("김경운");
		students.add("이지형");
		students.add("이예림");
		students.add("이승재");
		students.add("민태홍");
		students.add("정보람");
		students.add("박진영");
		
		
	
		
		int java = 0, Oracle = 0, HTML = 0, CSS = 0, JQuery = 0, JSP = 0;
		
		System.out.println("석차\t" + "이름\t" + "Java\t" + "Oracle\t" + "HTML\t" + "CSS\t" + "JQuery\t" + "JSP\t" + "총점\t" + "평균");
		
		
		
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		ArrayList<Integer>tmp=new ArrayList<>();
		
		
		
		ArrayList<Integer> sum = new ArrayList<>();
		ArrayList<Integer> avg = new ArrayList<>();
		ArrayList<Integer> rank = new ArrayList<>();
		
		


		for(int i =0; i < students.size(); i++){
			for(int j = 0; j < subject.size(); j++){
				tmp.add(i, (int)(Math.random()* (100-50+1) + 50));
				score.add(tmp);
				
			}
			
			System.out.println(score.get(i));
		}
		
				
			

		
			
		
		
		
		
		
		/*students.add("이름");
		students.add("김지선");
		students.add("이누리");
		students.add("정대석");
		students.add("박종민");
		students.add("정재영");
		students.add("강현철");
		students.add("주향한");
		students.add("윤창훈");
		students.add("연은주");
		students.add("김령환");
		students.add("구한나");
		students.add("백종빈");
		students.add("이병훈");
		students.add("강현지");
		students.add("김경운");
		students.add("이지형");
		students.add("이예림");
		students.add("이승재");
		students.add("민태홍");
		students.add("정보람");
		students.add("박진영");*/
	 
		
		
		
		
		
		
		
		
		/*//2차원 배열
				ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
				
				//{{10},{10}}
				
				ArrayList<Integer> list4 = new ArrayList<>();
				
				list4.add(10);
				
				list3.add(list4);
				
				list4 = new ArrayList<>();
				list4.add(10);
				
				list3.add(list4);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
