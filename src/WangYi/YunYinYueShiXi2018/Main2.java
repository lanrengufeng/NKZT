package WangYi.YunYinYueShiXi2018;

import java.util.Scanner;

/**
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。

但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
牛牛希望你能帮他计算一共有多少个可能的数对。


输入描述:
输入包括两个正整数n,k(1 <= n <= 10^5, 0 <= k <= n - 1)。


输出描述:
对于每个测试用例, 输出一个正整数表示可能的数对数量。

输入例子1:
5 2

输出例子1:
7
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		/*int cnt = 0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%j>=k)
					cnt++;
			}
		}
		System.out.println(cnt);
		*/
		if(k==0){
			System.out.println(n*1l*n);
		}else{
			long cnt = 0;
			for(int y=k+1;y<=n;y++){
				cnt+=n/y*(y-k);
				if(n%y>=k)
					cnt+=n%y-k+1;
			}
			
			System.out.println(cnt);
		}

		in.close();
	}
}







