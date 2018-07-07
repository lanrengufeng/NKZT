package huawei.xiaoyuanzhaopin2016;

import java.util.Scanner;

/**
 * 输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。


输出描述:
对于每一次询问操作，在一行里面输出最高成绩.

输入例子1:
5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5

输出例子1:
5
6
5
9
 * @author kafka
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] score = new int[n];
			for(int i=0;i<n;i++){
				score[i] = scanner.nextInt();
			}
			for(int i=0;i<m;i++){	//处理m个操作
				String s = scanner.next();
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if(s.equals("Q")){
					System.out.println(getMax(score, a,b));
				}else{
					score[a-1] = b;
				}
			}
		}

		scanner.close();
	}
	
	
	/**
	 * 返回数组arr中下标a-1到b-1中的最大值
	 * @param arr
	 * @param a
	 * @param b
	 * @return
	 */
	private static int getMax(int[] arr,int a,int b){
		int max = 0;
		if(a<=b){
			for(int i=a-1;i<=b-1;i++){
				if(max<arr[i])
					max=arr[i];
			}
			return max;
		}else{
			for(int i=b-1;i<=a-1;i++){
				if(max<arr[i])
					max=arr[i];
			}
			return max;
		}
		
		
	}
}






