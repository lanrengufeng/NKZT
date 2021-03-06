package TongYiMoNiBiShi2;

import java.util.Scanner;

/**
 * 牛牛在研究他自己独创的平衡数，平衡数的定义是：将一个数分成左右两部分，分别成为两个新的数。
左右部分必须满足以下两点：
1，左边和右边至少存在一位。
2，左边的数每一位相乘如果等于右边的数每一位相乘，则这个数称为平衡数。
例如：1221这个数，分成12和21的话，1*2=2*1，则称1221为平衡数，再例如：1236这个数，可以分成123和1*2*3=6，所以1236也是平衡数。而1234无论怎样分也不满足平衡数。 
输入描述:
输入一个正整数（int范围内）。


输出描述:
如果该数是平衡数，输出 "YES", 否则输出 "NO"。

输入例子1:
1221
1234

输出例子1:
YES
NO
 * @author kafka
 *
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		if(n<=10){
			System.out.println("NO");
			return;
		}
		
		String ns=n+"";
		String ls="",rs="";
		int left=1,right=1;
		for(int i=1;i<=ns.length()-1;i++){
			left=1;
			right=1;
			ls=ns.substring(0, i);
			rs=ns.substring(i);
			for(int j=0;j<ls.length();j++){
				left*=Integer.parseInt(ls.charAt(j)+"");
			}
			for(int j=0;j<rs.length();j++){
				right*=Integer.parseInt(rs.charAt(j)+"");
			}
			if(left==right){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
		scanner.close();
	}
}












