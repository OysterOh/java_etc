package etc.api.lang.math;
/** 
230310 
 */
//import java.util.Scanner;

public class MathQuiz {
	
	public static int page(int num) {
		return (int) Math.ceil(num/10.0);
	}
	public static void main(String[] args) {

		/*
		 1~10이 전달되면 1이 반환되고,
		 11~10이 전달되면 2가 반환되고,
		 21~30이 전달되면 3이 반환되는
		 이런 로직을 수행하는 static 메서드 page를 선언해봐요
		 */
		
		System.out.println(page(68));
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("수 입력: " );
//		int i = sc.nextInt();
//		
//		int k = (int) Math.ceil(i*0.1);
//		System.out.println(k);
		
	}

}
