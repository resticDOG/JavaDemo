/**
 * 
 * @�����ܣ�Math�����
 * @�汾�ţ�1.0
 * @���ߣ�anguliuyun
 * @ʱ�䣺2018��6��14�� ����4:05:56
 */
public class MathTest {
	public static void main(String[] args) {
		System.out.println("Math.PI:\t" + Math.PI);
		System.out.println("Math.ceil(78.1):\t" + Math.ceil(78.1));
		System.out.println("Math.floor(78.1):\t" + Math.floor(78.1));
		System.out.println("Math.ceil(-78.1):\t" + Math.ceil(-78.1));
		System.out.println("Math.floor(-78.1):\t" + Math.floor(-78.1));
		for (int i = 0; i < 100; i++) {
			System.out.println("100�������" + (int)(Math.random()*10000)%52);
			
		}
		
	}

}
