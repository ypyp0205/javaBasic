package d_array;

public class SUBJECT {

	public static void main(String[] args) {


		String[] students = { "박진영", "정보람", "민태홍", "이승재", "이예림", "이누리", "박종민",

							  "이지형", "김경운", "강현지", "이병훈", "백종빈", "정재영", "정대석",

							  "구한나", "김령환", "연은주", "윤창훈", "주향한", "강현철", "김지선" };

		String[] subjects = { "Java", "Oracle", "HTML", "CSS", "JQuery", "JSP" };

		double[][] scores = new double[students.length][subjects.length + 3 ];
		
		//점수 입력
		for (int i = 0; i < scores.length; i++) {
			scores[i][0] = 1; // 석차
			for (int j = 0; j < subjects.length; j++) {
				scores[i][j + 1] = (int) (Math.random() * 51) + 50;
			}
		}
		
		//총점과 평균을 구한다.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				scores[i][scores[i].length - 2] += scores[i][j + 1]; // 총점
			}

			scores[i][scores[i].length - 1] = (int) (scores[i][scores[i].length - 2]
					/ subjects.length * 100 + 0.5) / 100.0; // 평균
		}

		 //석차
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]) {
					scores[i][0]++;
			
				}
			}
		}
		
		//정렬
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i][0] > scores[j][0]) {
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;

					String tempName = students[i];
					students[i] = students[j];
					students[i] = tempName;
				}
			}
		}
		
		//출력한다.
		System.out.print("석차\t이름");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t총점\t평균\t");

		for (int i = 0; i < scores.length; i++) {
			System.out.print((int) scores[i][0] + "\t" + students[i]);
			for (int j = 1; j < scores[i].length; j++) {
				System.out.print("\t" + scores[i][j]);
			}
			System.out.println();
		}
		
		//과목별 평균
		System.out.print("과목별 평균");
		for(int i = 1; i <= subjects.length; i++){
			double sum = 0;
			for(int j = 0; j < scores.length; j++){
				sum += scores[j][i];
			}
			double avg = (int)(sum / scores.length * 100 + 0.5)
					/ 100.0;
					System.out.print("\t" + avg);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
