package com.ZhangZhenhua.JavaDemo;

public class CatDemo {
	// 1.���֡����䡢�Ա�Ʒ�֡�ëɫ
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
	 * @param name����
	 * @param age���� 
	 * @param sex�Ա�
	 * @param breedƷ��
	 * @param hairColorëɫ
	 */
	public CatDemo(String name, float age, String sex, String breed, String hairColor) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.breed = breed;
		this.hairColor = hairColor;
	}

	// 2.�Է�����
	/**
	 * �Է��������޲������޷���ֵ
	 */
	public void eat() {
		System.out.println("���㣡");
		
	}
	
	/**
	 * è�еķ���
	 * @return ���ء����������ַ�
	 */
	public String miaow() {
		return "������";
	}
	
	public  void showName() {
		
		System.out.println(name);
	}

	/**
	 * �����ֵķ���������û�д˷��������޷���name��ֵ
	 * @param name ���������
	 */
	private void setName(String name) {
		
		this.name = name;
		
	}
	

	/**
	 * �õ����ֵķ���
	 * @return �����ַ���������
	 */
	public String getName() {
		
		return name;
	}

}
