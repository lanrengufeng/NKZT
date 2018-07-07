package WangYi.XiaoYuanZhaoPin2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和, 例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6(其中||表示绝对值)。
现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,这一个是最小难度和的方案了。 
输入描述:
输入包括两行,第一行一个正整数n(1 ≤ n ≤ 2000) 第二行n个整数v[i](1 ≤ v[i] ≤ 10^6), 表示每个音调。


输出描述:
输出一个整数,表示小Q和牛博士演唱最小的难度和是多少。

输入例子1:
5
1 5 6 2 1

输出例子1:
3
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] data = new int[n];
		for(int i=0;i<n;i++){
			data[i] = in.nextInt();
		}
		if(n==1||n==2){
			System.out.println(0);
			return;
		}
		
		int index1=0,index2=0;
		int max1=0,max2=0,temp=0;
		
		for(int i=1;i<n;i++){
			temp = Math.abs(data[i]-data[i-1]);
			if(max1>max2){
				if(max2<temp){
					max2=temp;
					index2=i;
				}
			}else{
				if(max1<temp){
					max1 = temp;
					index1 = i;
				}
			}
		}
		
		if(index1>index2){
			temp=index1;
			index1 = index2;
			index2 = temp;
		}
		int sum=0;
		for(int i=index1+1;i<index2;i++){
			sum+=Math.abs(data[i]-data[i-1]);
		}
		for(int i=1;i<index1;i++){
			sum+=Math.abs(data[i]-data[i-1]);
		}
		for(int i=index2+1;i<n;i++){
			sum+=Math.abs(data[i]-data[i-1]);
		}
		sum+=Math.abs(data[index1-1]-data[index2]);
		System.out.println(sum);
		in.close();
	}
}





