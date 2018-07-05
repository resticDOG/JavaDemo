package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * Actor的子类
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年7月4日 上午10:33:08
 */
public class Singer extends Actor {

	public Singer() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Singer(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public void perform(Actor actor) {
		System.out.println("歌手" + getName() + "正在演唱《爱我中华》");
	}

}
