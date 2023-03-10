package etc.exception.basic;
/** 
230309 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			System.out.print("정수: ");
			int n = sc.nextInt();
			
			int result = 100 / n;
			
			System.out.println(arr[result]);
			
			String s = null;
			s.equals("메롱");
		
		/*
		 - 다중 catch문은 실제로 에러가 발생하면
		   위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에
		   부모 타입의 예외를 자식 타입의 예외보다 위에 작성하면 안된다.
		   
		 - catch 옆에 괄호에 예외 타입을 여러개 작성하고 싶은 경우는
		   | 기호를 사용하여 타입을 나열하면 하나의 catch블록으로 여러 타입의 예외를
		   동시에 처리할 수 있다.(java 7버전부터 가능한 문법)  
		 */
		
		
		} catch(InputMismatchException | ArithmeticException e) {
			System.out.println("정수를 입력하세요 0도 안된다");
		} 
		//관련 있는것들 | 연산자와 묶어서 가능하다(신버전)
		//catch (ArithmeticException e) {
		//System.out.println("0을 입력하시면 안돼요");
		//} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났어요");
		} catch (NullPointerException e) {
			System.out.println("null을 참조하면 어떡해");
		} catch (Exception e) {  
			//예측하지 못한 에러 있을지도 모르니 마지막에 Exception
			System.out.println("알 수 없는 에러가 확인됨");
			System.out.println("에러 원인: " + e.getMessage());
		}
		
		System.out.println("프로그램 정상 종료");
		sc.close();
		
	}

}
