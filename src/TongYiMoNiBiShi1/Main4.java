package TongYiMoNiBiShi1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛牛的好朋友羊羊在纸上写了n+1个整数，羊羊接着抹除掉了一个整数，给牛牛猜他抹除掉的数字是什么。牛牛知道羊羊写的整数神排序之后是一串连续的正整数，牛牛现在要猜出所有可能是抹除掉的整数。例如：
10 7 12 8 11 那么抹除掉的整数只可能是9
5 6 7 8 那么抹除掉的整数可能是4也可能是9

输入描述:
输入包括2行：
 第一行为整数n(1 <= n <= 50)，即抹除一个数之后剩下的数字个数
 第二行为n个整数num[i] (1 <= num[i] <= 1000000000)


输出描述:
在一行中输出所有可能是抹除掉的数,从小到大输出,用空格分割,行末无空格。如果没有可能的数，则输出mistake

输入例子1:
2 3 6

输出例子1:
mistake
 * @author kafka
 *
 */
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i=0;i<n;i++){
			data[i] = scanner.nextInt();
		}
		
		Arrays.sort(data);
		int cnt=0,num = 0;;
		for(int i=1;i<n;i++){
			if(data[i]-data[i-1]==2){
				cnt++;
				num = data[i]-1;
			}
			else if(data[i]-data[i-1]==1)
				continue;
			else{
				System.out.println("mistake");
				return;
			}
		}
		
		if(cnt==0){
			if(data[0]==1)
				System.out.println(data[n-1]+1);
			else
				System.out.println(data[0]-1+" "+(data[n-1]+1));
		}
		else if(cnt==1)
			System.out.println(num);
		else
			System.out.println("mistake");
		scanner.close();
	}
}









