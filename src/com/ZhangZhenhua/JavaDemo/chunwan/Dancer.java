package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * 
 * Actor的子类
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年7月4日 上午10:44:30
 */
public class Dancer extends Actor {
	public Dancer() {
		super();
	}
	
	public Dancer(String dancer) {
		super(dancer);
	}
	
	@Override
	public void perform(Actor actor) {
		System.out.println("舞者" + getName() + "正在表演《千手观音》");
	}
	

}
