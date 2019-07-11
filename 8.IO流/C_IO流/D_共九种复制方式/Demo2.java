package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 普通类字节流一次写入一个字节数组
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		// 数据源
		InputStream inputStream = new FileInputStream(new File("a.txt"));
		// 目的地
		OutputStream outputStream = new FileOutputStream(new File("b.txt"));

		// 一次读取一个字节
		byte[] bys = new byte[1024];
		int length = 0;
		while ((length = inputStream.read(bys))!=-1) {
			outputStream.write(bys, 0, length);
		}
		
		inputStream.close();
		outputStream.close();
	}

}
