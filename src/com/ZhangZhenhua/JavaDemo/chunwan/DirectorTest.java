package com.ZhangZhenhua.JavaDemo.chunwan;

public class DirectorTest {
	public static void main(String[] args) {
		Director xiaoshasha = new Director("֣��ɯ");//����֣��ɯ
		Singer jayChou = new Singer("�ܽ���");	//���� �ܽ���
		Dancer zhixiangLou = new Dancer("��־��");//���� ��־��
		xiaoshasha.action(jayChou);
		xiaoshasha.action(zhixiangLou);
	}
}
