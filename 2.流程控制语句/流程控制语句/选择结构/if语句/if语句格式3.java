/*
 * ����:����¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
 *      90-100 ����
 *	    80-90  ��
 *	    70-80  ��
 *	    60-70  ����
 *	    0-60   ������
 *
 */
public class Demo {
	public static void main(String[] args) {
		while (true) {
			// ��������¼���¼�
			Scanner sc = new Scanner(System.in);
			System.out.println("��������ĳɼ�");
			int number = sc.nextInt();
			if (number >= 90 && number <= 100) {
				System.out.println("��ĳɼ�������");
			} else if (number > 80 && number < 90) {
				System.out.println("��ĳɼ��Ǻ�");
			} else if (number > 70 && number < 80) {
				System.out.println("��ĳɼ�����");
			} else if (number > 60 && number < 70) {
				System.out.println("��ĳɼ��Ǽ���");
			} else {
				System.out.println("��û�м���");
			}
		}

	}

}