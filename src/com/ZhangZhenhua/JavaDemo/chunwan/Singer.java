package com.ZhangZhenhua.JavaDemo.chunwan;
/**
 * Actor������
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��7��4�� ����10:33:08
 */
public class Singer extends Actor {

	public Singer() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Singer(String name) {
		super(name);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	@Override
	public void perform(Actor actor) {
		System.out.println("����" + getName() + "�����ݳ��������л���");
	}

}
