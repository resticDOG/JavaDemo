/**
 * 
 * @程序功能：Math类测试
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年6月14日 下午4:05:56
 */
public class MathTest {
	public static void main(String[] args) {
		System.out.println("Math.PI:\t" + Math.PI);
		System.out.println("Math.ceil(78.1):\t" + Math.ceil(78.1));
		System.out.println("Math.floor(78.1):\t" + Math.floor(78.1));
		System.out.println("Math.ceil(-78.1):\t" + Math.ceil(-78.1));
		System.out.println("Math.floor(-78.1):\t" + Math.floor(-78.1));
		for (int i = 0; i < 100; i++) {
			System.out.println("100个随机数" + (int)(Math.random()*10000)%52);
			
		}
		
	}

}
