package WangYi.XiaoZhao2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小易将n个棋子摆放在一张无限大的棋盘上。第i个棋子放在第x[i]行y[i]列。同一个格子允许放置多个棋子。每一次操作小易可以把一个棋子拿起并将其移动到原格子的上、下、左、右的任意一个格子中。小易想知道要让棋盘上出现有一个格子中至少有i(1 ≤ i ≤ n)个棋子所需要的最少操作次数.

输入描述:
输入包括三行,第一行一个整数n(1 ≤ n ≤ 50),表示棋子的个数
第二行为n个棋子的横坐标x[i](1 ≤ x[i] ≤ 10^9)
第三行为n个棋子的纵坐标y[i](1 ≤ y[i] ≤ 10^9)


输出描述:
输出n个整数,第i个表示棋盘上有一个格子至少有i个棋子所需要的操作数,以空格分割。行末无空格

如样例所示:
对于1个棋子: 不需要操作
对于2个棋子: 将前两个棋子放在(1, 1)中
对于3个棋子: 将前三个棋子放在(2, 1)中
对于4个棋子: 将所有棋子都放在(3, 1)中

输入例子1:
4
1 2 4 9
1 1 1 1

输出例子1:
0 1 3 
 * @author kafka
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++){
			x[i] = in.nextInt();
		}
		for(int i=0;i<n;i++){
			y[i] = in.nextInt();
		}
		
		int[] step = new int[n];		//移动的步数
		int[] sum = new int[n];			//移动i-1个到第i个位置上的步数之和
		Arrays.fill(sum, Integer.MAX_VALUE); 	//取最小值，先初始化为一个很大的值
		
		//假设每一个点为中心点，遍历每一种情况
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					//第k个点到第(i,j)点的距离
					step[k] = Math.abs(x[k]-x[i])+Math.abs(y[k]-y[j]);
				}
				//对step做升序调整，step[0]肯定等于0，表示最大值为1时不需要移动，step[i]表示距离(i,j)位置第i远的点的距离
				Arrays.sort(step);
				
				int temp = 0;
				for(int l=0;l<n;l++){
					temp+=step[l];
					sum[l] = Math.min(temp, sum[l]);
				}
			}
		}
		//输出结果
		for(int i=0;i<n-1;i++){
			System.out.print(sum[i]+" ");
		}
		System.out.println(sum[n-1]);
		in.close();
	}
}




