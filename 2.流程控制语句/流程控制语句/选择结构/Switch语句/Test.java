import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 *	ģ�ⵥ��ѡ���⡣

 ������
 A:��һ��ѡ���⣬Ȼ����ѡ��
 B:����¼��ѡ������ݡ�
 C:����ѡ����������ѡ��Ľ��ۡ�
 *
 */
public class Demo {
	public static void main(String[] args) {
		while (true) {
			System.out.println("��ѡ������ϲ��������");
			System.out.println("A:�����");
			System.out.println("B:����ϼ");
			System.out.println("C:����");
			System.out.println("D:����");

			// ��������¼���¼�
			Scanner sc = new Scanner(System.in);
			System.out.println("���������ѡ��");
			String select = sc.nextLine();
			switch (select) {
			case "A":
				System.out.println("��ѡ���������ƣ��Բ�����ѡ�����");
				break;
			case "B":
				System.out.println("��ѡ���������ϼ���Բ�����ѡ�����");
				break;
			case "C":
				System.out.println("��ѡ�������������ϲ��ѡ����ȷ");
				break;
			case "D":
				System.out.println("��ѡ��������ݣ��Բ�����ѡ�����");
				break;

			default:
				System.out.println("��ѡ������ǲ�����");
				break;
			}
		}

	}

}
