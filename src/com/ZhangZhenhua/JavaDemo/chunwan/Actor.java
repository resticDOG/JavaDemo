package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * ��Ա����
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��7��4�� ����10:28:47
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
		System.out.println("��Ա" + getName() + "���ڱ��ݽ�Ŀ");	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
