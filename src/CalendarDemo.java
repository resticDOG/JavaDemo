import java.util.Scanner;

/**
 * 
 * @�����ܣ���ʾ�û�������ݺ��·ݵ���һ������
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��6��26�� ����2:50:23
 */
public class CalendarDemo {
	/** ��������ֵ�û������ȫ�ֱ��� */
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
	/** ����һ���и��µ��������飨Ĭ��ƽ�꣩ */
	private static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
	
		
		PrintCalendar();
		
	}
	/** 
	 * ��ӡ�����ĺ��ķ���
	 *  ��Ҫ����˽�з���ʵ��
	 */
	public static void PrintCalendar() {
		// 1.���û�������ݺ��·ݣ�ȫ�ֱ������գ�
		InputYearAndMonth();
		//�ж��û����������
		while(IsRightInput()) {
			System.out.println("�����������������룡");
			InputYearAndMonth();
		}
		// 2.����1990.1.1�����û��������µ�������Ĭ�ϵ����µ�1�ţ�
		int sum = 0;
		sum = getSumOfDay();
		// 3.��ӡ�û�������Ϣ����ӡ���ڱ���
		printYearAndMonth();
		// 4.�������1�������ڼ�Ȼ��ȷ����ӡ���е�λ��
		printThisCalendar(sum % 7);
	
	}
	
	/**
	 * ��ʾ�û�����year��month����ֵ��������
	 */
	private static void InputYearAndMonth() {
		Scanner input = new Scanner(System.in);
		//��ʾ�û���������
		System.out.println("��������ݣ�");
		year = input.nextInt();
		System.out.println("�������·ݣ�");
		month = input.nextInt();
	}
	
	/**
	 * �ж��û��Ƿ���������Ч����
	 * @return ��Ч����false,��Ч����true
	 */
	private static boolean IsRightInput() {
		return (((year > 2118) || (year < 1990))   || month <= 0 || month > 12);

	}
	
	/**
	 * ����1990.1.1���û������·ݵ�ʱ�� 
	 * @return ����������sum
	 */
	private static int getSumOfDay() {
		int sum = 0;
		/** ����1990�굽year�������  */
		for (int i = 1990; i < year; i++) {
			sum += 365;
			//�жϵ�ǰ����Ƿ�������,��������������+1
			if(IsLeapYear(i)) {
				sum++;
			}
			
		}
		/** ����year��1��1�յ�month�µ����� */
		
		for (int i = 0; i < month-1; i++) { //���㵽�������һ���������+1
			
			sum += dayOfMonth[i];
			
		}
		if(IsLeapYear(year) && month > 2) {
			sum++;
		}
		sum++;
		
		return sum;
	}
	
	/**
	 * �ж���������Ƿ�������
	 * @param thisYear ��Ҫ�жϵ����
	 * @return �����귵��true ���򷵻�false
	 */
	private static boolean IsLeapYear(int thisYear) {
		return (thisYear % 4 ==0 && thisYear % 100 != 0 || thisYear % 400 == 0);
		
	}
	
	/**
	 * ��ӡ�û���������ں����ڱ���
	 */
	private static void printYearAndMonth() {
		System.out.println("\t\t\t" + year + "��" + month + "��");
		System.out.println("����һ\t"+ "���ڶ�\t" +"������\t" + "������\t" + "������\t" + "������\t" + "������\t");
	}
	
	private static void printThisCalendar(int dayOfWeek) {
		int seccount = 0;
		if (dayOfWeek == 0) {
			seccount = 6;
		}
		else {
			seccount = dayOfWeek - 1;
		}
		for (int i = 0; i < seccount; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month - 1]; i++) {
			System.out.print(i + 1);
			if((i + 1 + seccount) % 7 == 0) {
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
			
		}
		if(IsLeapYear(year) && month == 2) {
			System.out.println("29");
		}
		
	}
}