package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ��ͨ���ֽ���һ��д��һ���ֽ�����
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		// ����Դ
		InputStream inputStream = new FileInputStream(new File("a.txt"));
		// Ŀ�ĵ�
		OutputStream outputStream = new FileOutputStream(new File("b.txt"));

		// һ�ζ�ȡһ���ֽ�
		byte[] bys = new byte[1024];
		int length = 0;
		while ((length = inputStream.read(bys))!=-1) {
			outputStream.write(bys, 0, length);
		}
		
		inputStream.close();
		outputStream.close();
	}

}
