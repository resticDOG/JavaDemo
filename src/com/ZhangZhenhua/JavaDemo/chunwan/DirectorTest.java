package com.ZhangZhenhua.JavaDemo.chunwan;

public class DirectorTest {
	public static void main(String[] args) {
		Director xiaoshasha = new Director("郑利莎");//导演郑利莎
		Singer jayChou = new Singer("周杰伦");	//歌手 周杰伦
		Dancer zhixiangLou = new Dancer("罗志祥");//舞者 罗志祥
		xiaoshasha.action(jayChou);
		xiaoshasha.action(zhixiangLou);
	}
}
