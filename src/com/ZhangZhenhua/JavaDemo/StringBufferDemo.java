package com.ZhangZhenhua.JavaDemo;
/**
 * 
 * @�����ܣ�����StringBuffer��Ч��
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��7��3�� ����10:42:42
 */
public class StringBufferDemo {
	static final int  N = 100000;
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		String str = "*";
		for (int i = 0; i < N; i++) {
			str += "*";
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("+=" + "�ܺ�ʱ" + (endTime - startTime) + "����");
		System.out.println("StringBuffer��append()����" + "�ܺ�ʱ" + stingBuffer() + "����");
		System.out.println("StringBuilder��append()����" + "�ܺ�ʱ" + stingBuilder() + "����");
		
	}
	
	/**
	 * ����StringBufferЧ��
	 * @return ������ͬ����µĺ�ʱ
	 */
	public static long stingBuffer() {
		long startTime = System.currentTimeMillis(); 
		StringBuffer str = new StringBuffer("*"); //ʵ����һ��StringBuffer����
		for (int i = 0; i < N; i++) {
			str.append("*");
			
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	/**
	 * ����StringBuilderЧ��
	 * @return ������ͬ����µĺ�ʱ
	 */
	public static long stingBuilder() {
		long startTime = System.currentTimeMillis(); 
		StringBuilder str = new StringBuilder("*"); //ʵ����һ��StringBuilder����
		for (int i = 0; i < N; i++) {
			str.append("*");
			
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
