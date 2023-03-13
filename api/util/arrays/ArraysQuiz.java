package etc.api.util.arrays;

import java.util.Arrays;

/** 
230310 
 */
public class ArraysQuiz {

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);  //가나다순 정렬
		Arrays.sort(completion);   //완주자 정렬
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));
		//int idx=0;
		
		for(int i=0; i<completion.length;i++) {  //i 실패자
			if(!completion[i].equals(participant[i])) {//성공자와 참여자가 달라질 때 
				
				// == if(!participant[i].equals(completion[i]))
				//idx = i;  //실패자가 idx
				//break;   //실패자 한명 구했으므로 for문 종료
				
				return participant[i];
			}
		}
		/*
        참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 1명이라고 가정한다.
		 */
		//return participant[idx];
		
		return participant[participant.length-1];
		
	}

	public static void main(String[] args) {

		//		String[] fail = Arrays.toString(participant)- Arrays.toString(completion);

		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
		
		System.out.println("완주하지 못한 사람: " + solution(participant,completion));

	}

}
