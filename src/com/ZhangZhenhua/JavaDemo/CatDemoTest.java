package com.ZhangZhenhua.JavaDemo;

import java.util.Scanner;

public class CatDemoTest {
	public static void main(String[] args) {
		
		CatDemo cat1 = new CatDemo("С����", 0.3f, "Ů", "Ӣ����ëè", "��ɫ");
		System.out.println("���Сèȡ�����ɣ�ע�⣺ȡ������֮���޷����ģ�:");
		String firstName = new Scanner(System.in).next();
		cat1 = new CatDemo(firstName);
		//cat1.setName("��ɽ");
		System.out.println(cat1.miaow());
		cat1.eat();
		cat1.showName();
		
	}

}
