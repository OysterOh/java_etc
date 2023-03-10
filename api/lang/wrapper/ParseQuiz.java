package etc.api.lang.wrapper;

import java.util.Scanner;

/** 
230310 
 */
public class ParseQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;  //주민번호를 문자열로 받는다.
		char c;

		while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			a = sc.next(); 
			
			if(a.indexOf("-") == -1) {  //'-' 찾기
				//특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
                //만약 찾지 못했을 경우 "-1"을 반환한다.
				System.out.println("주민등록번호는 하이픈을 포함시켜주세요.");
				continue;
			}

			c = a.charAt(7);
			//String으로 저장된 문자열 중에서 한 글자만 선택해서
            //char타입으로 변환해준다.
			if(!(c=='1'||c=='2'||c=='3'||c=='4')) {
				System.out.println("뒷자리 첫번째 숫자는 1,2,3,4중 하나여야 합니다.");
				continue;
			}

			try {//substring 문자열을 원하는 위치에서 잘라준다.(주민번호 앞/뒷자리)
				String test = a.substring(0, 6);
				String test2 = a.substring(7);
				//parseInt 문자열을 숫자열로 변환시킨다.
				Integer.parseInt(test);  //앞
				Integer.parseInt(test2);  //뒤
				break;
			} catch (NumberFormatException e) {
				System.out.println("주민등록번호를 정수로 정확히 입력해 주세요");
			}

		}

		int year = Integer.parseInt(a.substring(0, 2));
		int month = Integer.parseInt(a.substring(2, 4));
		int day = Integer.parseInt(a.substring(4, 6));

		String gender; int birthYear;
		if(c=='1'||c=='3') {
			gender = "남자";
		} else {
			gender = "여자";
		}

		if(c=='1'||c=='2') {
			birthYear = 1900 + year;
		} else {
			birthYear = 2000 + year;
		}

		int age = 2023 - birthYear;

		System.out.printf("%d년 %d월 %d일 %d세 %s\n "
				, birthYear, month, day, age, gender);

		sc.close();
	}

}

