package TongYiMoNiBiShi1;

import java.util.Scanner;

/**
 * 牛牛新买了一本算法书，算法书一共有n页，页码从1到n。牛牛于是想了一个算法题目：在这本算法书页码中0~9每个数字分别出现了多少次？ 
输入描述:
输入包括一个整数n(1 ≤ n ≤ 1,000,000,000)


输出描述:
输出包括一行10个整数，即0~9这些数字在页码中出现的次数，以空格分隔。行末无空格。

输入例子1:
999

输出例子1:
189 300 300 300 300 300 300 300 300 300
 * @author kafka
 *
 */
public class Main7 {

	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] cnt = new int[10];
		
		for(int i=1;i<=n;i++){
			String s = i+"";
			for(int j=0;j<s.length();j++){
				cnt[Integer.parseInt(s.charAt(j)+"")]+=1;
			}
		}
		for(int i=0;i<cnt.length-1;i++)
			System.out.print(cnt[i]+" ");
		System.out.println(cnt[9]);
		
		
		int[] cnt = new int[10];
		for(int i=1;i<=n;i++){
			int j=i;
			while(j>0){
				cnt[j%10]+=1;
				j/=10;
			}
		}
		
		for(int i=0;i<cnt.length-1;i++)
			System.out.print(cnt[i]+" ");
		System.out.println(cnt[9]);
		
		scanner.close();
	}*/
	
	
	public static int Cal(int n,int data){
        int num=0;
        int temp=1;
        int formal=n;
        while(n!=0){
            if(n%10<data)
                num+=n/10*temp;
            else if(n%10==data)
                num+=n/10*temp+(formal%temp+1);
            else num+=(n/10+1)*temp;
            n/=10;
            temp*=10;
        }
        return num;
    }
    public static int Cal0(int n){
        int num=0;
        int temp=1;
        int formal=n;
        while(n!=0){
            if(n%10==0)
                num+=(n/10-1)*temp+(formal%temp+1);
            else num+=(n/10)*temp;
            n/=10;
            temp*=10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result=new int[10];
        System.out.print(Cal0(n)+" ");
       for(int i=1;i<9;i++){
           System.out.print(Cal(n,i)+" ");
       }
       System.out.print(Cal(n,9));
    }

}









