package cn.itcast_02;

/*
 * ��������Ҫʵ�ֶ��̵߳ĳ���
 * 
 * ��ʽ1���̳�Thread�ࡣ
 * ����
 * 		A:�Զ�����MyThread�̳�Thread�ࡣ
 * 		B:MyThread��������дrun()?
 * 			Ϊʲô��run()������?
 * 		C:��������
 * 		D:�����߳�
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		

		// ���������̶߳���
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my1.start();
		my2.start();
	}
}
