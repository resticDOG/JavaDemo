package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * 
 * �����࣬�൱��ҵ���еĺ���ҵ����
 * ������Ա����
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��7��4�� ����10:50:18
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
