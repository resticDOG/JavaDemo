package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * 
 * 导演类，相当于业务中的核心业务类
 * 控制演员表演
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年7月4日 上午10:50:18
 */
public class Director {

	private String name;
	
	public Director() {
		
	}
	
	public Director(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void action(Actor actor) {
		actor.perform(actor);
	}

}
