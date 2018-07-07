package TongYiMoNiBiShi2;

import java.util.Scanner;

/**
 * 牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。 
输入描述:
首先输入一个正整数N表示点的个数（2 <= N <= 50）
  
接下来N行每行两个整数x, y，表示该点的坐标。绝对值均小于等于100.


输出描述:
一个整数表示最小矩形的面积。

输入例子1:
2
0 1
1 0

输出例子1:
1
 * @author kafka
 *
 */
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] data=new int[n][2];
		for(int i=0;i<n;i++){
			data[i][0]=scanner.nextInt();
			data[i][1]=scanner.nextInt();
		}
		
		int maxX=0,maxY=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				maxX=Math.max(maxX, Math.abs(data[i][0]-data[j][0]));
				maxY=Math.max(maxY, Math.abs(data[i][1]-data[j][1]));
			}
		}
		System.out.println(maxX*maxY);
		scanner.close();
	}
}












