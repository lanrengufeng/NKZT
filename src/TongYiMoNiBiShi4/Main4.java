package TongYiMoNiBiShi4;

import java.util.Scanner;

/**
 * 牛牛有一个长度为n的整数序列s,羊羊要在牛牛的序列中选择不同的两个位置,然后交换这两个位置上的元素。现在需要求出羊羊交换后可以得到的不同的序列个数。(注意被交换的两元素值可能相同)。
如序列{1, 47},输出1.羊羊必须交换仅有的两个元素,得到序列{47, 1}。羊羊必须交换,不能保留原有的序列。
{1, 2, 1},输出3.羊羊通过交换可以得到{2, 1, 1},{1, 1, 2},{1, 2, 1}这三个序列。
 * @author kafka
 *
 */
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		
		int count=0;
		boolean flag=false;			//表示是否已访问过重复的数
		for(int i=0;i<n-1;i++){
			
			for(int j=i+1;j<n;j++){
				
				if(arr[i]==arr[j]){
					if(flag)
						continue;
					count++;
					flag=true;
				}else
					count++;
				
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
