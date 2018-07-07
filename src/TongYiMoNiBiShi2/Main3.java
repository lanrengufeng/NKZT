package TongYiMoNiBiShi2;

import java.util.Scanner;

/**
 * 牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,你能计算出牛牛有多少种取法吗?(考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。 
输入描述:
首先输入一个正整数N，接下来的一行共有N个正整数表示每个木棒的长度。

N ≤ 50, 木棒的长度 ≤ 10000.


输出描述:
输出一个整数表示方法数。

输入例子1:
5
1 2 3 4 5

输出例子1:
3
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++){
			data[i]=scanner.nextInt();
		}
		int sum=0;
		int l1=0,l2=0,l3=0;
		for(int i=0;i<n;i++){
			l1=data[i];
			for(int j=i+1;j<n-1;j++){
				l2=data[j];
				for(int k=j+1;k<n;k++){
					l3=data[k];
					if(isTriangle(l1, l2, l3))
						sum++;
				}
			}
			
		}
		
		System.out.println(sum);
		
		scanner.close();
	}
	
	public static boolean isTriangle(int a,int b,int c){
		if(a+b>c&&a+c>b&&b+c>a)
			return true;
		
		return false;
	}
}












