/*
 * 需求:键盘录入一个成绩，判断并输出成绩的等级。
 *      90-100 优秀
 *	    80-90  好
 *	    70-80  良
 *	    60-70  及格
 *	    0-60   不及格
 *
 */
public class Demo {
	public static void main(String[] args) {
		while (true) {
			// 创建键盘录入事件
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你的成绩");
			int number = sc.nextInt();
			if (number >= 90 && number <= 100) {
				System.out.println("你的成绩是优秀");
			} else if (number > 80 && number < 90) {
				System.out.println("你的成绩是好");
			} else if (number > 70 && number < 80) {
				System.out.println("你的成绩是良");
			} else if (number > 60 && number < 70) {
				System.out.println("你的成绩是及格");
			} else {
				System.out.println("你没有及格");
			}
		}

	}

}