package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * 演员父类
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年7月4日 上午10:28:47
 */
public abstract class Actor {
	private String name;
	
	public Actor() {
		
	}

	public Actor(String name) {
		super();
		this.name = name;
	}
	public void perform(Actor actor) {
		System.out.println("演员" + getName() + "正在表演节目");	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
