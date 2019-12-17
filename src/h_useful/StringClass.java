package h_useful;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*스트링에 쓸만한 메서드들
		 * equals()			: 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length()			: 문자열의 길이를 반환한다.
		 * substring() 		: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt()			: 지정된 위치의 문자를 반환한다.  인덱스에 있는 문자를 반환
		 * indexOf()		: 주어진 문자의 위치를 반환한다.   가장 처음에 오는 위치를 알려주는
		 * lastIndexOf()	: 주어진 문자의 마지막 위치를 반환하다.   마지막에 위치하는 인덱스
		 * replace()		: 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로 바꾼문자열을 반환한다.
		 * replaceAll() 	: 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		 * Split()			: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startsWith() 	: 주어진 문자열로 시작하는 여부를 반환한다.
		 * endsWith()		: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase()	: 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase()	: 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim()			: 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str = "abc abc  abc";
		System.out.println(str.indexOf("a"));     //첫번째 인덱스 위치
		System.out.println(str.lastIndexOf("a"));   //마지막 인덱스 위치
		System.out.println(str.indexOf("a", 1));   //선택한
		
		System.out.println(str.replace("a", "0"));     //a를 0으로 바꾸고싶다능
		System.out.println(str.replaceAll("[a-z]", "0")); //a를 전부 0으로 바꾸고싶다능
		
		System.out.println(Arrays.toString(str.split(" ")));  //배열로 반환
		System.out.println(Arrays.toString(str.split(" +")));
		
		System.out.println(str.startsWith("a"));  //투루, 폴스로 반환
		System.out.println(str.startsWith("b"));
		
		System.out.println(str.endsWith("c"));
		System.out.println(str.endsWith("b"));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase().toLowerCase());
		
		String str2 = " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

}

