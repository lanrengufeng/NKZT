package ITXiaoZhaoJune;

import java.util.Scanner;

import org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;

/**
 * 牛牛与妞妞闲来无聊，便拿出扑克牌来进行游戏。游戏的规则很简单，两个人随机抽取四张牌，四张牌的数字和最大的取胜
 * （该扑克牌总张数为52张，没有大小王，A=1，J=11，Q=12，K=13，每种数字有四张牌），现在两人已经分别亮出了自己的前三张牌，
 * 牛牛想要知道自己要赢得游戏的概率有多大。
输入描述:
输入包含两行，第一行输入三个整数a1，b1，c1(1≤a1，b1，c1≤13)，表示牛牛亮出的扑克牌。
第二行输入三个整数a2，b2，c2(1≤a2，b2，c2≤13)，表示妞妞所亮出的扑克牌。
输出描述:
输出一个数字x（保留4位小数），表示牛牛获胜的概率。
示例1
输入
3 5 7
2 6 8
输出
0.3905
 * @author kafka
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		double sum1 = 0;
		double sum2 = 0;
		for(int i=0;i<3;i++){
			arr1[i] = in.nextInt();
			sum1+=arr1[i];
		}
			
		for(int i=0;i<3;i++){
			arr2[i] = in.nextInt();
			sum2+=arr2[i];
		}
		double x = sum1-sum2;	
		if(x>12){
			System.out.println(1.0000);
			return;
		}
		if(x<=-12){
			System.out.println(0.0000);
			return;
		}
		
		if(x<=0){
			double res = (12+x)*(13+x)/338;
			System.out.println((double)Math.round(res*10000)/10000);
		}
		if(x>0){
			double res = 1-(12-x)*(13-x)/338;
			System.out.println((double)Math.round(res*10000)/10000);
		}
			
		
		
		in.close();
	}
}



