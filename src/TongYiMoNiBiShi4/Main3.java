package TongYiMoNiBiShi4;

import java.util.Scanner;

/**
 * 牛牛以草料为食。牛牛有一天依次遇到n堆被施展了魔法的草料,牛牛只要遇到一堆跟他当前相同大小的草料,它就会把草料吃完,而使自己的大小膨胀一倍。一开始牛牛的大小的是A,然后给出牛牛依次遇到的n堆草料的大小。请计算牛牛最后的大小。
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n = scanner.nextInt();
		int start = scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		
		for(int i=0;i<n;i++){
			if(arr[i]==start){
				start*=2;
				
			}
		}
		
		System.out.println(start);
		
		scanner.close();
		
	}
}












