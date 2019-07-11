/*
 *	需求:用while循环实现1-100之和
 *
 */
public class Demo {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		while (x <= 100) {
			sum += x;
			x++;
		}
		System.out.println(sum);
	}

