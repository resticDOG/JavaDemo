import java.util.Scanner;

/**
 * 
 * @程序功能：显示用户输入年份和月份的那一月月历
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年6月26日 下午2:50:23
 */
public class CalendarDemo {
	/** 声明并赋值用户输入的全局变量 */
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
	/** 声明一年中各月的天数数组（默认平年） */
	private static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
	
		
		PrintCalendar();
		
	}
	/** 
	 * 打印日历的核心方法
	 *  主要调用私有方法实现
	 */
	public static void PrintCalendar() {
		// 1.让用户输入年份和月份（全局变量接收）
		InputYearAndMonth();
		//判断用户输入的数据
		while(IsRightInput()) {
			System.out.println("输入有误，请重新输入！");
			InputYearAndMonth();
		}
		// 2.计算1990.1.1到用用户输入年月的天数（默认到该月的1号）
		int sum = 0;
		sum = getSumOfDay();
		// 3.打印用户输入信息，打印星期标题
		printYearAndMonth();
		// 4.计算该月1号是星期几然后确定打印换行的位置
		printThisCalendar(sum % 7);
	
	}
	
	/**
	 * 提示用户输入year和month并将值赋给他们
	 */
	private static void InputYearAndMonth() {
		Scanner input = new Scanner(System.in);
		//提示用户输入年月
		System.out.println("请输入年份：");
		year = input.nextInt();
		System.out.println("请输入月份：");
		month = input.nextInt();
	}
	
	/**
	 * 判断用户是否输入了有效数据
	 * @return 有效返回false,无效返回true
	 */
	private static boolean IsRightInput() {
		return (((year > 2118) || (year < 1990))   || month <= 0 || month > 12);

	}
	
	/**
	 * 计算1990.1.1到用户输入月份的时间 
	 * @return 返回总天数sum
	 */
	private static int getSumOfDay() {
		int sum = 0;
		/** 计算1990年到year年的天数  */
		for (int i = 1990; i < year; i++) {
			sum += 365;
			//判断当前年份是否是闰年,若是闰年总天数+1
			if(IsLeapYear(i)) {
				sum++;
			}
			
		}
		/** 计算year年1月1日到month月的天数 */
		
		for (int i = 0; i < month-1; i++) { //先算到上月最后一天的天数再+1
			
			sum += dayOfMonth[i];
			
		}
		if(IsLeapYear(year) && month > 2) {
			sum++;
		}
		sum++;
		
		return sum;
	}
	
	/**
	 * 判断所给年份是否是闰年
	 * @param thisYear 需要判断的年份
	 * @return 是闰年返回true 否则返回false
	 */
	private static boolean IsLeapYear(int thisYear) {
		return (thisYear % 4 ==0 && thisYear % 100 != 0 || thisYear % 400 == 0);
		
	}
	
	/**
	 * 打印用户输入的日期和星期标题
	 */
	private static void printYearAndMonth() {
		System.out.println("\t\t\t" + year + "年" + month + "月");
		System.out.println("星期一\t"+ "星期二\t" +"星期三\t" + "星期四\t" + "星期五\t" + "星期六\t" + "星期日\t");
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