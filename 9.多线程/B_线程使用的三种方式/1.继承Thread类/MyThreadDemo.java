package cn.itcast_02;

/*
 * 需求：我们要实现多线程的程序。
 * 
 * 方式1：继承Thread类。
 * 步骤
 * 		A:自定义类MyThread继承Thread类。
 * 		B:MyThread类里面重写run()?
 * 			为什么是run()方法呢?
 * 		C:创建对象
 * 		D:启动线程
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		

		// 创建两个线程对象
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my1.start();
		my2.start();
	}
}
