package ITXiaoZhaoMay;

import java.util.Scanner;

/**
 * 牛牛在地上捡到了一个手套，他带上手套发现眼前出现了很多个小人，当他打一下响指，这些小人的数量就会发生以下变化：如果小人原本的数量是偶数那么数量就会变成一半，如果小人原本的数量是奇数那么数量就会加一。现在牛牛想考考你，他要打多少次响指，才能让小人的数量变成1。 
输入描述:
每个输入包含一个测试用例。
输入的第一行包括一个正整数，表示一开始小人的数量N(1<=N<=10^100)。


输出描述:
对于每个用例，在单独的一行中输出牛牛需要打多少次响指才能让小人的数量变成1。

输入例子1:
10000

输出例子1:
20

 * @author kafka
 *
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = Double.parseDouble(scanner.next()) ;
		int cnt=0;
		while(n>1){
			if(n%2==1)
				n+=1;
			else
				n/=2;
			cnt++;
		}
		System.out.println(cnt);
		scanner.close();
	}
}






