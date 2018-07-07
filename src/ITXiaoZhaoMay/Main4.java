package ITXiaoZhaoMay;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 牛牛得知了一些股票今天买入的价格和明天卖出的价格，他找犇犇老师借了一笔钱，现在他想知道他最多能赚多少钱。 
输入描述:
每个输入包含一个测试用例。
输入的第一行包括两个正整数,表示股票的种数N(1<=N<=1000)和牛牛借的钱数M(1<=M<=1000)。
接下来N行，每行包含两个正整数，表示这只股票每一股的买入价X(1<=X<=1000)和卖出价Y(1<=Y<=2000)。
每只股票可以买入多股，但必须是整数。


输出描述:
输出一个整数表示牛牛最多能赚的钱数。

输入例子1:
3 5 
3 6 
2 3 
1 1

输出例子1:
4
 * @author kafka
 *
 */
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			//int[][] items = new int[n][2];		//股票价格
			int[] items = new int[n];		//股票价格
			int[] values = new int[n];		//收益
			 scanner.nextLine();
				for(int i=0;i<n;i++){
//					items[i][0] = Integer.parseInt(scanner.next());
//					items[i][1] = Integer.parseInt(scanner.next());
					items[i] = scanner.nextInt();
					values[i] = scanner.nextInt();
					//values[i] = scanner.nextInt()-items[i];
					scanner.nextLine();
				}
			
			
			
			int[] dp = new int[m+1];
			for(int i=0;i<n;i++){
				for(int j=items[i];j<=m;j++){
					dp[j] = Math.max(dp[j], dp[j-items[i]]+values[i]-items[i]);
				}
			}
			
			//System.out.println(dp[m-1]);
			System.out.println(dp[m]);
			
			scanner.close();
		}
		
	
	
	
}






