package TongYiMoNiBiShi3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛牛现在有一个n个数组成的数列,牛牛现在想取一个连续的子序列,并且这个子序列还必须得满足:最多只改变一个数,就可以使得这个连续的子序列是一个严格上升的子序列,牛牛想知道这个连续子序列最长的长度是多少。 
输入描述:
输入包括两行,第一行包括一个整数n(1 ≤ n ≤ 10^5),即数列的长度;
第二行n个整数a_i, 表示数列中的每个数(1 ≤ a_i ≤ 10^9),以空格分割。


输出描述:
输出一个整数,表示最长的长度。

输入例子1:
6 
7 2 3 1 5 6

输出例子1:
5
 * @author kafka
 *
 */
public class Main7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N<=2){
        	System.out.println(N);
        	return;
        }
        	
        int[] pre = new int[100005];            //从前往后最大递增子序列
        int[] suf = new int[100005];            //从后往前最大递增子序列
        int[] num = new int[100005];
        Arrays.fill(pre,1);
        Arrays.fill(suf, 1);
        for ( int i = 0 ; i < N ; i++){
             num[i] = in.nextInt();
        }

        for ( int i = 1 ; i < N ; i++){
            if ( num[i] > num[i-1]){
                pre[i] = pre[i-1]+1;
            }
        }

        for ( int i = N-2 ; i >= 0 ; i--){
            if (num[i] < num[i+1]){
                suf[i] = suf[i+1]+1;
            }
        }

        int res = 1;
        for(int i = 1 ; i < N-1 ; i++){
            res = Math.max(res, pre[i]+1);
            res = Math.max(res, suf[i]+1);//以上两步是在找当前最长递增子序列，无论正的或者反的
            if(num[i+1] - num[i-1] >= 2){
                res = Math.max(res, pre[i-1]+suf[i+1]+1);
            }
        }
        System.out.println(res);

        in.close();
    }

}















