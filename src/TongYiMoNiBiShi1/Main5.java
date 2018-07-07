package TongYiMoNiBiShi1;

import java.util.Scanner;

/**
 * 如果一个数字能表示为p^q(^表示幂运算)且p为一个素数,q为大于1的正整数就称这个数叫做超级素数幂。现在给出一个正整数n,如果n是一个超级素数幂需要找出对应的p,q。 
输入描述:
输入一个正整数n(2 ≤ n ≤ 10^18)


输出描述:
如果n是一个超级素数幂则输出p,q,以空格分隔,行末无空格。 如果n不是超级素数幂，则输出No

输入例子1:
27

输出例子1:
3 3
 * @author kafka
 *
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		
		//long[][] dp = new long[(int) (Math.sqrt(n))][(int) (Math.sqrt(n))];
		
		long num=0;
		int end = (int) Math.sqrt(n);
		
		for(int i=2;i<=end;i++){
			
				double pow = Math.pow(n, 1/(double)i);
				if(pow==(int)pow&&isPrime((int)pow)){
					System.out.println((int)pow+" "+i);
					return;
				
			}
		}
		
		
		System.out.println("No");
		
		scanner.close();
	}
	
	/**
	 * 判断一个数是否是素数
	 * @param n
	 * @return
	 */
	private static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}









