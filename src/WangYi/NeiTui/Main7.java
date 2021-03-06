package WangYi.NeiTui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * 小易老师是非常严厉的,它会要求所有学生在进入教室前都排成一列,并且他要求学生按照身高不递减的顺序排列。有一次,n个学生在列队的时候,小易老师正好去卫生间了。学生们终于有机会反击了,于是学生们决定来一次疯狂的队列,他们定义一个队列的疯狂值为每对相邻排列学生身高差的绝对值总和。由于按照身高顺序排列的队列的疯狂值是最小的,他们当然决定按照疯狂值最大的顺序来进行列队。现在给出n个学生的身高,请计算出这些学生列队的最大可能的疯狂值。小易老师回来一定会气得半死。 
输入描述:
输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),表示学生的人数
第二行为n个整数h[i](1 ≤ h[i] ≤ 1000),表示每个学生的身高


输出描述:
输出一个整数,表示n个学生列队可以获得的最大的疯狂值。

如样例所示: 
当队列排列顺序是: 25-10-40-5-25, 身高差绝对值的总和为15+30+35+20=100。
这是最大的疯狂值了。

输入例子1:
5
5 10 25 40 25

输出例子1:
100
 * @author kafka
 *
 */
public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		if(n==1){
			System.out.println(0);
			return;
		}else if(n==2){
			System.out.println(Math.abs(arr[0]-arr[1]));
			return;
		}
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		list.add(arr[n-1]);
		int left=1,right=n-2;
		int result=Math.abs(arr[0]-arr[n-1]),diff1=0,diff2=0,diff3=0,diff4=0;
		while(left<=right){
			diff1=Math.abs(arr[left]-list.get(0));
			diff2=Math.abs(arr[left]-list.get(list.size()-1));
			diff3=Math.abs(list.get(0)-arr[right]);
			diff4 = Math.abs(list.get(list.size()-1)-arr[right]);
			int max = Math.max(diff1, Math.max(diff2, Math.max(diff3, diff4)));
			if(diff1==max){
				list.add(0, arr[left]);
				left++;
			}else if(diff2==max){
				list.add(arr[left]);
				left++;
			}else if (diff3==max) {
				list.add(0, arr[right]);
				right--;
			}else if (diff4==max) {
				list.add(arr[right]);
				right--;
			}
			result+=max;
		}
		
		System.out.println(result);
		
	}
}
