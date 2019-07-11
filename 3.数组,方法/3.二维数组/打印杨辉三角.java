import java.util.Scanner;

/*
 * 	需求：打印杨辉三角形(行数可以键盘录入)
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
		// 键盘录入事件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要打印的杨辉三角形的行数");
		int n = sc.nextInt();

		// 定义一个二维数组
		int[][] array = new int[n][n];

		// 给这个二维数组的任意一行的第一个元素和最后一个元素赋值1
		for (int x = 0; x < array.length; x++) {
			array[x][0] = 1;
			array[x][x] = 1;
		}

		for (int x = 2; x < array.length; x++) {
			for (int y = 1; y < array[x].length; y++) {
				array[x][y] = array[x-1][y - 1] + array[x - 1][y];

			}
		}

		// 遍历该数组
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}

	}

}
