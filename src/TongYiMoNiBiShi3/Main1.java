package TongYiMoNiBiShi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 牛牛想对一个数做若干次变换，直到这个数只剩下一位数字。
变换的规则是：将这个数变成 所有位数上的数字的乘积。比如285经过一次变换后转化成2*8*5=80.
问题是，要做多少次变换，使得这个数变成个位数。 
输入描述:
输入一个整数。小于等于2,000,000,000。


输出描述:
输出一个整数，表示变换次数。

输入例子1:
285

输出例子1:
2
 * @author kafka
 *
 */
public class Main1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		List<Integer> list=new ArrayList<Integer>();		//存放每一位上的数字
		
		int count=0;		//需要计算的次数
		int num=n;
		while(num>=10){
			while(n!=0){
				if(n%10==0){
					System.out.println(++count);
					return;
				}
				list.add(n%10);
				n/=10;
			}
			count++;
			num=1;
			for (Integer integer : list) {
				num*=integer;
			}
			n=num;
			list.clear();
		}
		
		System.out.println(count);
		scanner.close();
	}
}















