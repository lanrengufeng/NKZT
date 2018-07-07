package huawei.yanfagongchengshi2016;

import java.util.Scanner;

/**
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。

输入描述:
每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。


输出描述:
一行输出最后一个被删掉的数的原始下标位置。

输入例子1:
8

输出例子1:
6
 * @author kafka
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			if(n<=0){
				System.out.println(-1);
			}else {
				int index = 0;	//下标
				int cnt = 0;	//为3时执行删除
				int total = 0;		//执行删除的总个数，为n时表示为最后一个删除的数			
				boolean[] flags = new boolean[n];		//每删除一个数，对应下标置为true
				
				while(total<n){
					if(!flags[index]){//false表示未删除
						cnt++;		//有效个数+1
						if(cnt==3){		//第三个有效数
							flags[index]=true;		//执行删除
							cnt=0;		//cnt归零
							total++;		//执行删除的次数
							if(total==n)
								System.out.println(index);		//输出第n个删除的有效数的下标，即为最后一个存活的数的下标
						}
					}
					
					
					index=(index+1)%n;
				}
			}
				
			
		}
		
		
		
		scanner.close();
	}
}











