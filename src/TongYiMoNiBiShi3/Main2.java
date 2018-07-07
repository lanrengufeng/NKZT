package TongYiMoNiBiShi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给出一个区间[a, b]，计算区间内“神奇数”的个数。
神奇数的定义：存在不同位置的两个数位，组成一个两位数（且不含前导0），且这个两位数为质数。
比如：153，可以使用数字3和数字1组成13，13是质数，满足神奇数。同样153可以找到31和53也为质数，只要找到一个质数即满足神奇数。 
输入描述:
输入为两个整数a和b，代表[a, b]区间 (1 ≤ a ≤ b ≤ 10000)。


输出描述:
输出为一个整数，表示区间内满足条件的整数个数

输入例子1:
11 20

输出例子1:
6
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int count=0;
		for(int i=a;i<=b;i++){
			if(isMiracle(i))
				count++;
		}
		
		System.out.println(count);
		scanner.close();
		
	}
	
	public static boolean isMiracle(int n) {
		List<Integer> list = new ArrayList<Integer>();
		while(n!=0){
			if(n%10!=0)
				list.add(n%10);
			n/=10;
		}
	
		if(list.size()<2)
			return false;
		
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++){
				if(i==j)
					continue;
				n=list.get(i)*10+list.get(j);
				if(isPrime(n)){
					return true;
				}
					
			}
			
		}
		
		return false;
	}

	public static boolean isPrime(int n){
		
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}
















