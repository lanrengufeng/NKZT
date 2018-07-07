package WangYi.QiuZhao2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
来源：牛客网

小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。 
输入描述:
输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果


输出描述:
输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
示例1
输入
20
输出
3
 * @author kafka
 *
 */
public class Main7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		if(n<6||n==7){
			System.out.println(-1);
			return;
		}
		if(n==6||n==8){
			System.out.println(1);
			return;
		}
		
		int[] dp = new int[n+1];
		int[] data = {6,8};
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[6]=dp[8]=1;
		for(int i=0;i<dp.length;i++){
			if(dp[i]==Integer.MAX_VALUE){
				dp[i] = 0;
				continue;
			}
				
			for(int j=0;j<data.length;j++){
				int tmp = data[j];
				if(i+tmp<dp.length)
					dp[i+tmp] = Math.min(dp[i+tmp], dp[i]+1);
			}
		}
		if(dp[n]==0)
			System.out.println(-1);
		else
			System.out.println(dp[n]);
		
		in.close();
	}
}




