
import java.util.Scanner;

public class AreaOfACircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//����Scannerɨ���û���������
		System.out.print("������뾶��");					//��ʾ�û�����Բ�뾶
		double radius = input.nextDouble();				//����double�����ݽ����û�����
		System.out.printf("������İ뾶Ϊ��%f\n", radius);	//��֪�û�����Ľ��
		System.out.printf("Բ�����Ϊ��%.2f\n",3.14*radius*radius);	//���㲢��ʾԲ���
				
	}

}
