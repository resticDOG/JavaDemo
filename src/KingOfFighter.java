import java.util.Scanner;
/**
 * @程序功能：低配版武林盟主大会
 * @版本号：1.0
 * @作者：anguliuyun
 * @时间：2018年6月7日 上午11:40:09
 */
public class KingOfFighter {
	public static void main(String [] args) {
		//1.输入角色名称
		Scanner input = new Scanner(System.in);
		System.out.print("请少侠报上名来：");		//提示用户输入名称
		String player1 = input.next();
		String player2 = "剑圣";				//自定义角色2名称
		System.out.println("武林盟主选拔大会开始！");
		System.out.println("对战信息：");
		System.out.println(player1 + "VS" +player2);		
		//2.循环控制攻击过程
		int hp1,hp2;
		hp1=hp2=100;	//给定双方相同血量
		while(hp1>0 && hp2>0) {
			//3.随机生成角色攻击力(攻击力为整数并且在5到15之间)
			int attack1=0, attack2=0; 			//生命并赋初值
			attack1 = (int)(Math.random() * 10000)%10+5;	//随机生成玩家1攻击力
			attack2 = (int)(Math.random() * 10000)%10+5;	//随机生成玩家2攻击力
			hp1-=attack2;	//玩家2先攻击，玩家1掉血
			hp2-=attack1;	//玩家1攻击，玩家2掉血
			System.out.println(player2+"对"+ player1+"使用了绝招，"+player1+"掉了" +attack2+"滴血！");
			System.out.println(player1+"不甘示弱，使出毕生绝学还击，"+player2+"掉了"+attack1+"滴血！");
			System.out.println("*******************************************************");
		}
		
		System.out.println("裁判时间！");
		System.out.println(player1+"血量： " + hp1);	//显示玩家血量
		System.out.println(player2+"血量： " + hp2);
		//4.判断谁赢了
		if(hp1<hp2) {
			System.out.println("还是"+player2+"技高一筹,少侠仍需努力！");
		}
		else {
			if(hp1==hp2) {
				System.out.println("棋逢对手，今晚你俩一定得喝一杯");
			}
			else {
				System.out.println("恭喜你，你成为了新的武林盟主");
			}
				
		}
		
	}


}
