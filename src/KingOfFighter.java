import java.util.Scanner;
/**
 * @�����ܣ�����������������
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��6��7�� ����11:40:09
 */
public class KingOfFighter {
	public static void main(String [] args) {
		//1.�����ɫ����
		Scanner input = new Scanner(System.in);
		System.out.print("����������������");		//��ʾ�û���������
		String player1 = input.next();
		String player2 = "��ʥ";				//�Զ����ɫ2����
		System.out.println("��������ѡ�δ�Ὺʼ��");
		System.out.println("��ս��Ϣ��");
		System.out.println(player1 + "VS" +player2);		
		//2.ѭ�����ƹ�������
		int hp1,hp2;
		hp1=hp2=100;	//����˫����ͬѪ��
		while(hp1>0 && hp2>0) {
			//3.������ɽ�ɫ������(������Ϊ����������5��15֮��)
			int attack1=0, attack2=0; 			//����������ֵ
			attack1 = (int)(Math.random() * 10000)%10+5;	//����������1������
			attack2 = (int)(Math.random() * 10000)%10+5;	//����������2������
			hp1-=attack2;	//���2�ȹ��������1��Ѫ
			hp2-=attack1;	//���1���������2��Ѫ
			System.out.println(player2+"��"+ player1+"ʹ���˾��У�"+player1+"����" +attack2+"��Ѫ��");
			System.out.println(player1+"����ʾ����ʹ��������ѧ������"+player2+"����"+attack1+"��Ѫ��");
			System.out.println("*******************************************************");
		}
		
		System.out.println("����ʱ�䣡");
		System.out.println(player1+"Ѫ���� " + hp1);	//��ʾ���Ѫ��
		System.out.println(player2+"Ѫ���� " + hp2);
		//4.�ж�˭Ӯ��
		if(hp1<hp2) {
			System.out.println("����"+player2+"����һ��,��������Ŭ����");
		}
		else {
			if(hp1==hp2) {
				System.out.println("�����֣���������һ���ú�һ��");
			}
			else {
				System.out.println("��ϲ�㣬���Ϊ���µ���������");
			}
				
		}
		
	}


}
