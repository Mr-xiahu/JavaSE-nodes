/*
 * ����:����¼��һ�����ݣ�����������ݣ����������Ӧ������?
 ����¼��1,��Ӧ�������һ
 ����¼��2,��Ӧ������ڶ�
 ...
 ����¼��7,��Ӧ���������
 *
 */
public class Demo {
	public static void main(String[] args) {
		// ��������¼���¼�
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;

		default:
			System.out.println("������");
			break;

		}

	}

}