package com.ZhangZhenhua.JavaDemo;

public class CatDemo {
	// 1.名字、年龄、性别、品种、毛色
	private String name;
	
	private float age;
	
	private String sex;
	
	private String breed;
	
	private String hairColor;
	
	public CatDemo(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param name名字
	 * @param age年龄 
	 * @param sex性别
	 * @param breed品种
	 * @param hairColor毛色
	 */
	public CatDemo(String name, float age, String sex, String breed, String hairColor) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.breed = breed;
		this.hairColor = hairColor;
	}

	// 2.吃饭、叫
	/**
	 * 吃饭方法，无参数，无返回值
	 */
	public void eat() {
		System.out.println("真香！");
		
	}
	
	/**
	 * 猫叫的方法
	 * @return 返回“喵喵喵”字符
	 */
	public String miaow() {
		return "喵喵喵";
	}
	
	public  void showName() {
		
		System.out.println(name);
	}

	/**
	 * 起名字的方法，如若没有此方法，将无法给name赋值
	 * @param name 传入的名字
	 */
	private void setName(String name) {
		
		this.name = name;
		
	}
	

	/**
	 * 得到名字的方法
	 * @return 返回字符串型名字
	 */
	public String getName() {
		
		return name;
	}

}
