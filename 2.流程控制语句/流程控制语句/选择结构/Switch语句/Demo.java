/*
 * 需求:键盘录入一个数据，根据这个数据，我们输出对应的星期?
 键盘录入1,对应输出星期一
 键盘录入2,对应输出星期二
 ...
 键盘录入7,对应输出星期日
 *
 */
public class Demo {
	public static void main(String[] args) {
		// 创建键盘录入事件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;

		default:
			System.out.println("不存在");
			break;

		}

	}

}