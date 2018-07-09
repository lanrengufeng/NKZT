package others;

import java.util.Scanner;

/**
 * leetcode 数组跳跃
 * @author Watcher
 *
 */
public class Jump {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = in.nextInt();
		int step = jump(arr);
		System.out.println(step);
		in.close();
	}
	
	
	public static int jump(int[] arr){
		int cur = 0,next=0;	//cur表示当前位置，next表示下一次的位置
		int step = 0;	//跳跃的步数
		int i=0;	//数组的下标
		while(cur<arr.length){
			if(cur==arr.length-1)
				return step;
			int tmp = -1;
			for(int k=1;k<=arr[cur];k++){
				if(cur+k<arr.length){
					if(tmp<arr[cur+k]+k){
						tmp = arr[cur+k]+k;
						next = cur+k;
					}
						
				}
			}
			cur = next;
			step++;
			
		}
		
		
		return -1;
	}
}
