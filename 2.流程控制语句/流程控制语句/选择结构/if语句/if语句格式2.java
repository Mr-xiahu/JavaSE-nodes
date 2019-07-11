/*
 * 需求:比较a,b的值,并输出最大值
 */
public class Demo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int max = 0;
		if (a > b) {
			max = a;
		}else{
			max=b;
		}
		System.out.println(max);
	}

}