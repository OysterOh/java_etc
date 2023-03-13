package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/** 
230313 
 */
public class LottoSimulator {

	static Random r =new Random();
	static int prize1 =0;  //1등 당첨 횟수를 세 줄 변수
	static int prize2 =0;  //2등 당첨 횟수를 세 줄 변수
	static int prize3 =0;  //3등 당첨 횟수를 세 줄 변수
	static int prize4 =0;  //4등 당첨 횟수를 세 줄 변수
	static int prize5 =0;  //5등 당첨 횟수를 세 줄 변수
	static int failCnt =0;  //꽝 당첨 횟수를 세 줄 변수
	
	public static void createLotto(){
		
		/*
		 - 1~45까지의 난수 6개 생성하여 컬렉션 자료형에 모아서 리턴한다
		   중복 발생하면 안된다. 
		 */
		
		
	}
	
	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(List<Integer>lotto) {
		while(true) {
			int a = r.nextInt(45) + 1;
			if(lotto.contains(a)) {
				return a;
				
			}
			
		}
		
		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받은 후에
		   당첨 번호들을 피해서 보너스번호 하나만 뽑는다.
		   범위는 마찬가지로 1~45 사이의 난수
		 */
	}
	
	//당첨 등수를 알려주는 메서드
//	public static void checkLottoNumber(???, ???, ???) {
		/*
		 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받는다.
		 내 로또 번호와 당첨번호를 비교하여 일치하는 횟수를 세준 후 등수를 판단한다.
		 판단된 등수에 해당하는 static변수의 값을 올려주면 된다.
		 6개 일치-> 1등
		 5개 일치 + 보너스번호 일치->2등
		 5개 일치-> 3등
		 4개 일치-> 4등
		 3개 일치-> 5등
		 나머지 -> 꽝
		 */
//	}
	
	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> lotto = new HashSet<>();
		Set<Integer> a = new HashSet<>();
		while(lotto.size()<6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		System.out.println(lotto + ", " + a);
		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시킨다.
		//보너스번호도 하나 고정시킨다.
		
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		while(true) {
			/*
			 - 1등 당첨될 때까지 반복문 돌린다
			 - 1등이 당첨된다면, 1등 되기까지 누적 당첨 횟수를 출력하고 반복문 종료
			 - 로또를 구매하기 위한 금액도 출력(long)
			 */
		}
	}

}
