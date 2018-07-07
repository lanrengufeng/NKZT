package ITXiaoZhaoJune;

import java.util.Scanner;

/**
 * 一闪一闪亮晶晶，满天都是小星星，牛牛晚上闲来无聊，便躺在床上数星星。
牛牛把星星图看成一个平面，左上角为原点(坐标为(1, 1))。现在有n颗星星，他给每颗星星都标上坐标(xi，yi)，表示这颗星星在第x行，第y列。
现在，牛牛想问你m个问题，给你两个点的坐标(a1, b1)(a2，b2)，表示一个矩形的左上角的点坐标和右下角的点坐标，请问在这个矩形内有多少颗星星（边界上的点也算是矩形内）。
输入描述:
第一行输入一个数字n(1≤n≤100000)，表示星星的颗数。
接下来的n行，每行输入两个数xi和yi(1≤xi，yi≤1000），表示星星的位置。
然后输入一个数字m(1≤m≤100000), 表示牛牛询问问题的个数。
接下来m行，每行输入四个数字a1，b1，a2，b2(1≤a1＜a2≤1000), (1≤b1＜b2≤1000）
题目保证两颗星星不会存在于同一个位置。
输出描述:
输出一共包含m行，每行表示与之对应的每个问题的答案。
示例1
输入
4
1 1
2 2
3 3
1 3
4
1 1 2 2
1 1 3 3
2 2 3 3
1 2 2 3
输出
2
4
2
2
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] stars = new int[n][2];
		int[][] data = new int[1005][1005];
		for(int i=0;i<n;i++){
			stars[i][0] = in.nextInt();
			stars[i][1] = in.nextInt();
			data[stars[i][0]][stars[i][1]] = 1;
		}
		int m = in.nextInt();
		
		for(int i=0;i<m;i++){
			int a1 = in.nextInt();
			int b1 = in.nextInt();
			int a2 = in.nextInt();
			int b2 = in.nextInt();
			int sum=0;
			for(int a=a1;a<=a2;a++){
				for(int b=b1;b<=b2;b++){
					sum+=data[a][b];
				}
			}
			System.out.println(sum);
		}
		
		
		in.close();
	}
}



