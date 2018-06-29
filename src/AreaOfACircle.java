
import java.util.Scanner;

public class AreaOfACircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//利用Scanner扫描用户输入数据
		System.out.print("请输入半径：");					//提示用户输入圆半径
		double radius = input.nextDouble();				//创建double型数据接收用户输入
		System.out.printf("您输入的半径为：%f\n", radius);	//告知用户输入的结果
		System.out.printf("圆的面积为：%.2f\n",3.14*radius*radius);	//计算并显示圆面积
				
	}

}
