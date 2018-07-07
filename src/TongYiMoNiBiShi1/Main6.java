package TongYiMoNiBiShi1;

import java.util.Scanner;

/**
 * 给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。答案可能有多个，我我们需要找出长度最小的那个。
例如 N = 18 L = 2：
5 + 6 + 7 = 18 
3 + 4 + 5 + 6 = 18
都是满足要求的，但是我们输出更短的 5 6 7

输入描述:
输入数据包括一行： 两个正整数N(1 ≤ N ≤ 1000000000),L(2 ≤ L ≤ 100)


输出描述:
从小到大输出这段连续非负整数，以空格分隔，行末无空格。如果没有这样的序列或者找出的序列长度大于100，则输出No

输入例子1:
18 2

输出例子1:
5 6 7
 * @author kafka
 *
 */
public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int l = scanner.nextInt();
		
		getL(n, l);
		
		
		scanner.close();
	}
	
	
	private static void getL(int n,int l){
		if(l>n/2+1||l>100||l<2){
			System.out.println("No");
			return;
		}
		if(l%2==1){		//奇数个数表示
				if(n%l==0){		//l个连续整数表示n
					for(int i=-l/2;i<l/2;i++){
						System.out.print(n/l+i+" ");
						
					}
					System.out.println(n/l+l/2);
					return;
				}
				else
					 getL(n, l+1);
				
			
		}else{		//偶数个数表示
				if((n-l/2)%l==0){
					for(int i=1-l/2;i<l/2;i++){
						System.out.print(n/l+i+" ");
					}
					System.out.println(n/l+l/2);
					return;
				}
				else
					 getL(n, l+1);
			}
		
	}
}









