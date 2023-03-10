package etc.api.util.arrays;

import java.util.Arrays;

/** 
230310 
 */
public class ArraysExample {

	public static void main(String[] args) {

		//배열의 복사
		char[] arr = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length); 
		//둘째 값에 숫자를 입력하면 그만큼만 복사  
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println(Arrays.toString(arr));  //J A V A
		System.out.println(Arrays.toString(arr2)); 
		System.out.println(Arrays.toString(arr3)); //A V
		
		//배열의 탐색: binarySearch(배열, 검색할 값)
		//반드시 정렬이 선행되어야 한다.
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};
		System.out.println("5의 위치: " + Arrays.binarySearch(numbers, 5));
		
		//배열의 정렬
		int[] nums = {42, 11, 35, 76, 12, 59};
		Arrays.sort(nums);  //작은수부터 큰수 순으로 정렬
		System.out.println(Arrays.toString(nums));
		
		
		//배열 내부 요소가 동일한지의 여부를 확인
		System.out.println(Arrays.equals(arr, arr2));  //arr == arr2 ??
			
		
	}

}

