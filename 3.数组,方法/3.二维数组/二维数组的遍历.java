/*
 * 需求:遍历二维数组
 */
public class Demo {
	public static void main(String[] args) {
		//定义一个二维数组
		int [][] array={{4,5,6},{7,2,7},{1,8,9}};
		for(int x=0;x<array.length;x++){
			for(int y=0;y<array[x].length;y++){
				System.out.print(array[x][y]);
			}
			System.out.println();
		}
		
	}

}