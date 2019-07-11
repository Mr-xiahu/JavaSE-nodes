/*
 *	需求:1+2+...+100的和
 *
 */
public class Demo {
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x <= 100; x++) {
			sum += x;
		}
		System.out.println(sum);

	}

}