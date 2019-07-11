package com.xiahu.StringNew;

/*
 * String��Ļ�ȡ����:   8
 *    int length():��ȡ�ַ����ĳ��ȡ�
 *    char charAt(int index):��ȡָ������λ�õ��ַ�
 *    int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
 * 		Ϊʲô������int���ͣ�������char����?
 * 		ԭ���ǣ�'a'��97��ʵ�����Դ���'a'
 *    int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
 *    int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
 *    int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
 *    String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
 *    String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
 */
public class C_String_huoquMethod {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "helloworld";

		// int length():��ȡ�ַ����ĳ��ȡ�
		System.out.println("s.length:" + s.length());//10
		System.out.println("----------------------");

		// char charAt(int index):��ȡָ������λ�õ��ַ�
		System.out.println("charAt:" + s.charAt(7));//r
		System.out.println("----------------------");

		// int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf('l'));//2
		System.out.println("----------------------");

		// int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf("owo"));//4
		System.out.println("----------------------");

		// int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf('l', 4));//8
		System.out.println("indexOf:" + s.indexOf('k', 4)); // -1
		System.out.println("indexOf:" + s.indexOf('l', 40)); // -1
		System.out.println("----------------------");

		// int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf("llo", 3));//-1
		System.out.println("----------------------");
		
		// String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ������start�������
		System.out.println("substring:" + s.substring(5));//world
		System.out.println("substring:" + s.substring(0));//helloworld
		System.out.println("----------------------");

		// String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���������start�������ǲ���end����
		System.out.println("substring:" + s.substring(3, 8));//lowor
		System.out.println("substring:" + s.substring(0, s.length()));//helloworld
	}

}