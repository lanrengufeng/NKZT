package TongYiMoNiBiShi4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛家庄幼儿园为庆祝61儿童节举办庆祝活动,庆祝活动中有一个节目是小朋友们围成一个圆圈跳舞。牛老师挑选出n个小朋友参与跳舞节目,已知每个小朋友的身高h_i。为了让舞蹈看起来和谐,牛老师需要让跳舞的圆圈队形中相邻小朋友的身高差的最大值最小,牛老师犯了难,希望你能帮帮他。
如样例所示:
当圆圈队伍按照100,98,103,105顺时针排列的时候最大身高差为5,其他排列不会得到更优的解 
输入描述:
输入包括两行,第一行为一个正整数n(3 ≤ n ≤ 20)
第二行为n个整数h_i(80 ≤ h_i ≤ 140),表示每个小朋友的身高。


输出描述:
输出一个整数,表示满足条件下的相邻小朋友身高差的最大值。

输入例子1:
4
100 103 98 105

输出例子1:
5
 * @author kafka
 *
 */
public class Main6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int [] arrNew=new int[n];
		
		for(int i=0;i<n;i++){
			arrNew[n/2+((i+1)/2)*(int)Math.pow(-1, i)]=arr[i];
		}
		int max=0;
		for(int i=1;i<n;i++){
			if(Math.abs(arrNew[i]-arrNew[i-1])>max)
				max=Math.abs(arrNew[i]-arrNew[i-1]);
		}
		if(Math.abs(arrNew[0]-arrNew[n-1])>max)
			max=Math.abs(arrNew[0]-arrNew[n-1]);
		System.out.println(max);
		
		scanner.close();
	}
}













