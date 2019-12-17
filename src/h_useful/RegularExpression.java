package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	- 뒷 문자로 시작
		 * $	- 앞 문자로 종료
		 * .	- 임의의 문자(줄바꿈 제외)
		 * *	- 앞 문자가 0개 이상
		 * +	- 앞 문자가 1개 이상
		 * ?	- 앞 문자가 없거나 1개
		 * []	- 문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌것)
		 * {}	- 앞 문자의 개수({2} : 2개, {2, 4} : 2개 이상 4개 이하)
		 * () 	- 그룹화(1개의 문자처럼 인식)
		 * |	- OR 연산
		 * \s	- 공백, 탭, 줄바꿈
		 * \S	- 공백, 탭, 줄바꿈이 아닌 문자
		 * \w	- 알파벳이나 숫자
		 * \W	- 알파벡이나 숫자가 아닌 문자
		 * \d 	- 숫자
		 * \D	- 숫자가 아닌 문자
		 * (?i)	- 뒷 문자의 대소문자 구분 안함
		 * \	- 정규표현식에서 사용되는 특수문자 표현
		 */

			String str = "abc123";
//			String regex = "[a-z]{3}[0-9]{1,3}";    //  a부터z까지 3개온다 그리고 0부터9까지 1~3개가 온다
//			String regex = "[a-z0-9]+";				//  a부터z까지 그리고 0부터9까지 1개 이상이 온다
//			String regex = "\\w*";					//	알파벳이나 숫자
			String regex = ".*";					//  *이란건 0개이상
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(str);
			System.out.println(m.matches());
			
			//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
			
			String ID = "gogo5451";
			String NUM = "010-7156-4503";
			String EMAIL = "gogo5451@naver.com";
			
			String id = "[a-z0-9_-]{5,20}";     
			String number = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
			String email = "[a-z0-9_-]{5,20}@+[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
					
			
			
			Pattern pp = Pattern.compile(id);
			Matcher mm = pp.matcher(ID);
			System.out.println(mm.matches());
			
			Pattern qq = Pattern.compile(number);
			Matcher ww = qq.matcher(NUM);
			System.out.println(ww.matches());
			
			Pattern ee = Pattern.compile(email);
			Matcher rr = ee.matcher(EMAIL);
			System.out.println(rr.matches());
			
			
	}

}





