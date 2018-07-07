package TongYiMoNiBiShi2;

import java.util.Scanner;

/**
 * 牛牛想在[a, b]区间内找到一些数满足可以被一个整数c整除,现在你需要帮助牛牛统计区间内一共有多少个这样的数满足条件？ 
输入描述:
首先输入两个整数a,b,（-5*10^8 ≤ a ≤ b ≤ 5*10^8) 接着是一个正整数c（1 <= c <= 1000）


输出描述:
输出一个整数表示个数。

输入例子1:
0 14 5

输出例子1:
3
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		if(a%c==0&&b%c==0&&c>1)
			System.out.println((b-a+1)/c+1);
		else
			System.out.println((b-a+1)/c);
		
		
		
		scanner.close();
	}
	
}












