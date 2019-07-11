import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 *	模拟单项选择题。

 分析：
 A:出一个选择题，然后供你选择。
 B:键盘录入选择的数据。
 C:根据选择来给出你选择的结论。
 *
 */
public class Demo {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请选择你最喜欢的明星");
			System.out.println("A:刘亦菲");
			System.out.println("B:林青霞");
			System.out.println("C:张敏");
			System.out.println("D:杨幂");

			// 创建键盘录入事件
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你的选项");
			String select = sc.nextLine();
			switch (select) {
			case "A":
				System.out.println("你选择的是刘亦菲，对不起，你选择错误");
				break;
			case "B":
				System.out.println("你选择的是林青霞，对不起，你选择错误");
				break;
			case "C":
				System.out.println("你选择的是张敏，恭喜你选择正确");
				break;
			case "D":
				System.out.println("你选择的是杨幂，对不起，你选择错误");
				break;

			default:
				System.out.println("你选择的明星不存在");
				break;
			}
		}

	}

}
