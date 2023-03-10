package etc.api.lang.math;
/** 
230310 
 */
public class MathExample {
	
	public static void main(String[] args) {
	
		//올림
		int i = (int) Math.ceil(1.1);  //원래 Math.ceil는 double형
		System.out.println(i);
		
		//내림
		double d = Math.floor(1.5);
		System.out.println(d);
		
		//반올림
		double d2 = Math.round(3.141592);
		  //소숫점 길어도 자릿수 정해주진 못한다- 소수점 첫째자리
		System.out.println(d2);
		
		double j = Math.round(3.141592*1000)* 0.001;
		System.out.println(j);  //돌려쓰기 편법
		
		//제곱
		double d3 = Math.pow(3.0, 4.0);
		System.out.println(d3);
		
		//최대값
		int max = Math.max(2, 10);
		System.out.println(max);
		
		//최소값
		int min = Math.min(24, 33);
		System.out.println(min);

	}
}
