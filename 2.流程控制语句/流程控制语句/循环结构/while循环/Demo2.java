/*
 *	需求:用while循环实现1000内水仙花的个数
 *
 */
public class Demo {
	public static void main(String[] args) {
		int x = 100;
		int count = 0;
		while (x < 1000) {
			int ge = x % 10;
			int bai = x / 10 % 10;
			int qian = x / 10 / 10 % 10;
			if ((ge * ge * ge + bai * bai * bai + qian * qian * qian) == x) {
				count++;
			}
			x++;

		}
		System.out.println(count);
	}
}