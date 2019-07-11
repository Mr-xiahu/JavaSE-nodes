/*
 *	需求:定义一个数组,并且输出其中全部元素
 *
 */
public class Demo {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 6, 5, 48, 9, };
		//普通的for循环输出
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("----------");
		
		//增强for输出
		for(int x:arr){
			System.out.println(x);
		}

	}
}
