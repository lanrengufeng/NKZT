package WangYi.QiuZhao2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
如果 X = 123，则rev(X) = 321;
如果 X = 100，则rev(X) = 1.
现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？ 
输入描述:
输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开。


输出描述:
输出rev(rev(x) + rev(y))的值

输入例子1:
123 100

输出例子1:
223
 * @author kafka
 *
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(rev(rev(a)+rev(b)));
		
		
		
		in.close();
	}
	
	private static int rev(int a){
		return Integer.parseInt(new StringBuilder(a+"").reverse().toString());
	}
}




