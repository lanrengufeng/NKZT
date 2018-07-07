package TongYiMoNiBiShi3;


import java.util.Scanner;

/**
 * 牛牛定义排序子序列为一个数组中一段连续的子序列,并且这段子序列是非递增或者非递减排序的。牛牛有一个长度为n的整数数组A,他现在有一个任务是把数组A分为若干段排序子序列,牛牛想知道他最少可以把这个数组分为几段排序子序列.
如样例所示,牛牛可以把数组A划分为[1,2,3]和[2,2,1]两个排序子序列,至少需要划分为2个排序子序列,所以输出2
 * @author kafka
 *
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i]=scanner.nextInt();
		}
		
		int count=1;
		int flag=0;
		for(int i=1;i<n;i++){
			if(nums[i]>nums[i-1]){
				if(flag==0){
					flag=1;
				}
				if(flag==-1){
					flag=0;
					count++;
				}
				
			}else if(nums[i]<nums[i-1]){
				if(flag==0)
					flag=-1;
				if(flag==1){
					flag=0;
					count++;
				}
			}
		}
		
		
		System.out.println(count);
		scanner.close();
	}
}
