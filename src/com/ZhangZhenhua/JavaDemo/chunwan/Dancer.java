package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * 
 * Actor������
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��7��4�� ����10:44:30
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
		System.out.println("����" + getName() + "���ڱ��ݡ�ǧ�ֹ�����");
	}
	

}
