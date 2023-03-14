package etc.generic.basic02;
/** 
230314 
 */
public class MainClass {

	public static void main(String[] args) {

		Basic<Integer, String> b = new Basic<>(1, "오정원");
		String name = b.get(1);
		b.put(10, "오니");
		System.out.println(name);
		System.out.println(b);
	}

}
