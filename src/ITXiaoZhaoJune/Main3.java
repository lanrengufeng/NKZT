package ITXiaoZhaoJune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 又是晴朗的一天，牛牛的小伙伴们都跑来找牛牛去公园玩。但是牛牛想呆在家里看E3展，不想出去逛公园，可是牛牛又不想鸽掉他的小伙伴们，于是找来了公园的地图，
 * 发现公园是由一个边长为n的正方形构成的，公园一共有m个入口，但出口只有一个。公园内有一些湖和建筑，牛牛和他的小伙伴们肯定不能从他们中间穿过，所以只能绕行。
 * 牛牛想知道他需要走的最短距离并输出这个最短距离。 输入描述: 第一行输入一个数字n(1≤n≤1000)表示公园的边长
 * 接下来会给你一个n*n的公园地图，其中 .
 * 表示公园里的道路，@表示公园的入口，*表示公园的出口，#表示公园内的湖和建筑。牛牛和他的小伙伴们每次只能上下左右移动一格位置。
 * 输入保证公园入口个数m(1≤m≤10000)且所有的入口都能和出口相连。 输出描述: 输出牛牛需要行走的最短距离。 示例1 输入 10
 * .@....##@. 
 * ......#... 
 * ...@..#...
 * ###....... 
 * ....##..#. 
 * ...####... 
 * @...##....
 * #####..... 
 * ..##*####. 
 * #......... 
 * 输出 16
 * 
 * @author kafka
 *
 */
public class Main3 {
	public static int result= Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer[][]> entrance = new ArrayList<Integer[][]>(); // 存放每一个入口的坐标
		int exitX, exitY; // 唯一出口的坐标
		int n = in.nextInt();
		String[] map = new String[n]; // 地图
		int[][] arr = new int[n][n]; // 坐标
		for (int i = 0; i < n; i++) {
			map[i] = in.next();
		}
		
		process(map, 0, n-2, 0, 0);
		System.out.println(result);
		in.close();
	}

	public static void process(String[] map, int i, int j, int step, int last) {
		if(map[i].charAt(j)=='*'){
			//System.out.println(step);
			result = Math.min(step, result);
		}
		if(last==0){
			//往左走
			if(j>0&&map[i].charAt(j-1)!='#')
				process(map, i, j-1, step+1, 4);
			//往右走
			if(j<map.length-1&&map[i].charAt(j+1)!='#')
				process(map, i, j+1, step+1, 3);
			//往上走
			if(i>0&&map[i-1].charAt(j)!='#')
				process(map, i-1, j, step+1, 2);
			//往下走
			if(i<map.length-1&&map[i+1].charAt(j)!='#')
				process(map, i+1, j, step+1, 1);
		}
		if (last == 1) {//从上面过来的
			//往左走
			if(j>0&&map[i].charAt(j-1)!='#')
				process(map, i, j-1, step+1, 4);
			//往右走
			if(j<map.length-1&&map[i].charAt(j+1)!='#')
				process(map, i, j+1, step+1, 3);
			//往下走
			if(i<map.length-1&&map[i+1].charAt(j)!='#')
				process(map, i+1, j, step+1, 1);
		}
		if (last == 2) {//从下面过来的
			//往左走
			if(j>0&&map[i].charAt(j-1)!='#')
				process(map, i, j-1, step+1, 4);
			//往右走
			if(j<map.length-1&&map[i].charAt(j+1)!='#')
				process(map, i, j+1, step+1, 3);
			//往上走
			if(i>0&&map[i-1].charAt(j)!='#')
				process(map, i-1, j, step+1, 2);
		}
		if (last == 3) {//从左边过来的
			//往上走
			if(i>0&&map[i-1].charAt(j)!='#')
				process(map, i-1, j, step+1, 2);
			//往右走
			if(j<map.length-1&&map[i].charAt(j+1)!='#')
				process(map, i, j+1, step+1, 3);
			//往下走
			if(i<map.length-1&&map[i+1].charAt(j)!='#')
				process(map, i+1, j, step+1, 1);
		}
		if (last == 4) {//从右边过来的
			//往上走
			if(i>0&&map[i-1].charAt(j)!='#')
				process(map, i-1, j, step+1, 2);
			//往左走
			if(j>0&&map[i].charAt(j-1)!='#')
				process(map, i, j-1, step+1, 4);
			//往下走
			if(i<map.length-1&&map[i+1].charAt(j)!='#')
				process(map, i+1, j, step+1, 1);
		}
	}
}
