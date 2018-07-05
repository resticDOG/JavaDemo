package com.ZhangZhenhua.JavaDemo;
/**
 * 
 * @程序功能：计算StringBuffer的效率
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年7月3日 上午10:42:42
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
		System.out.println("+=" + "总耗时" + (endTime - startTime) + "毫秒");
		System.out.println("StringBuffer的append()方法" + "总耗时" + stingBuffer() + "毫秒");
		System.out.println("StringBuilder的append()方法" + "总耗时" + stingBuilder() + "毫秒");
		
	}
	
	/**
	 * 测试StringBuffer效率
	 * @return 返回相同情况下的耗时
	 */
	public static long stingBuffer() {
		long startTime = System.currentTimeMillis(); 
		StringBuffer str = new StringBuffer("*"); //实例化一个StringBuffer对象
		for (int i = 0; i < N; i++) {
			str.append("*");
			
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	/**
	 * 测试StringBuilder效率
	 * @return 返回相同情况下的耗时
	 */
	public static long stingBuilder() {
		long startTime = System.currentTimeMillis(); 
		StringBuilder str = new StringBuilder("*"); //实例化一个StringBuilder对象
		for (int i = 0; i < N; i++) {
			str.append("*");
			
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
