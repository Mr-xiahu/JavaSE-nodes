/*
 *	����:����һ������,�����������ȫ��Ԫ��
 *
 */
public class Demo {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 6, 5, 48, 9, };
		//��ͨ��forѭ�����
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("----------");
		
		//��ǿfor���
		for(int x:arr){
			System.out.println(x);
		}

	}
}
