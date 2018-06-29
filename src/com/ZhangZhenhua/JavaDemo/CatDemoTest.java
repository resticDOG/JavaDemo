package com.ZhangZhenhua.JavaDemo;

import java.util.Scanner;

public class CatDemoTest {
	public static void main(String[] args) {
		
		CatDemo cat1 = new CatDemo("小公主", 0.3f, "女", "英国短毛猫", "蓝色");
		System.out.println("请给小猫取个名吧（注意：取了名字之后无法更改）:");
		String firstName = new Scanner(System.in).next();
		cat1 = new CatDemo(firstName);
		//cat1.setName("大山");
		System.out.println(cat1.miaow());
		cat1.eat();
		cat1.showName();
		
	}

}
