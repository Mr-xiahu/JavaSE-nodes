/*
 *	����:��whileѭ��ʵ��1000��ˮ�ɻ��ĸ���
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