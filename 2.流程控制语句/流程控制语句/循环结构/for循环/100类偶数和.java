/*
 *	需求:100类偶数和
 *
 */
public class Demo {
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x <= 100; x++) {
			if (x % 2 == 0) {
				sum += x;
			}
		}
		System.out.println(sum);
	}

}