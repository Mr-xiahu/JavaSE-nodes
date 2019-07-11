import java.util.Scanner;

/*
 * 	���󣺴�ӡ���������(�������Լ���¼��)
 *	
 *	1
 *	1 1	
 *	1 2 1
 *	1 3 3 1
 *	1 4 6 4 1 
 *	1 5 10 10 5 1
 */
public class Demo {
	public static void main(String[] args) {
		// ����¼���¼�
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ����������ε�����");
		int n = sc.nextInt();

		// ����һ����ά����
		int[][] array = new int[n][n];

		// �������ά���������һ�еĵ�һ��Ԫ�غ����һ��Ԫ�ظ�ֵ1
		for (int x = 0; x < array.length; x++) {
			array[x][0] = 1;
			array[x][x] = 1;
		}

		for (int x = 2; x < array.length; x++) {
			for (int y = 1; y < array[x].length; y++) {
				array[x][y] = array[x-1][y - 1] + array[x - 1][y];

			}
		}

		// ����������
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}

	}

}
