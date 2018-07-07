package WangYi.QiuZhao2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3.......
这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的 石板，小易单次只能往前跳K的一个约数(不含1和K)步，即跳到K+X(X为K的一个非1和本身的约数)的位置。 小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，小易想知道最少需要跳跃几次可以到达。
例如：
N = 4，M = 24：
4->6->8->12->18->24
于是小易最少需要跳跃5次，就可以从4号石板跳到24号石板 
输入描述:
输入为一行，有两个整数N，M，以空格隔开。 (4 ≤ N ≤ 100000) (N ≤ M ≤ 100000)


输出描述:
输出小易最少需要跳跃的步数,如果不能到达输出-1

输入例子1:
4 24

输出例子1:
5
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		if (m == n) {
			System.out.println(0);
            return;
        }
		int steps = m-n+1;
		int[] dp = new int[steps];		//// 规划的量：到达 每个位置需要的最小步数
		Arrays.fill(dp, Integer.MAX_VALUE);	//初始化，MAX_VALUE表示不可达
		dp[0] = 0;
		for(int i=0;i<steps;i++){
			 // 0对应n石板 ；steps - 1 = m-n对应m石板
			if(dp[i]==Integer.MAX_VALUE){
				dp[i]=0;
				continue;
			}
			ArrayList<Integer> list = getDivisors(n+i);		//n+i是石板号
			for(int j=0;j<list.size();j++){
				int x = list.get(j);
				if(i+n+x<=m)
					dp[i+x] = Math.min(dp[i+x], dp[i]+1);
			}
		}
		
		if(dp[steps-1]==0)
			System.out.println(-1);
		else
			System.out.println(dp[steps-1]);
		in.close();
	}
	
	
	private static ArrayList<Integer> getDivisors(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				list.add(i);
				if (n / i != i) {
                    list.add(n / i);
                }
			}
		}
		return list;
		
	}
}




