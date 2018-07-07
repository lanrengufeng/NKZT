package WangYi.YunYinYueShiXi2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。牛牛的小伙伴太多了，于是他只好把这个任务交给了你。 
输入描述:
每个输入包含一个测试用例。
每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
保证不存在两项工作的报酬相同。


输出描述:
对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。

输入例子1:
3 3 
1 100 
10 1000 
1000000000 1001 
9 10 1000000000

输出例子1:
100 
1000 
1001

 * @author kafka
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m =in.nextInt();
		/*int[][] data = new int[n][2];
		for(int i=0;i<n;i++){
			data[i][0] = in.nextInt();
			data[i][1] = in.nextInt();
		}
		int[] mdata = new int[m];
		for(int i=0;i<m;i++){
			mdata[i] =in.nextInt();
		}
		
		for(int i=0;i<m;i++){
			int max = 0;
			for(int j=0;j<n;j++){
				if(data[j][0]<=mdata[i]){
					if(max<data[j][1])
						max = data[j][1];
				}
			}
			System.out.println(max);
		}	*/
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();	//key:报酬  value：难度
		for(int i=0;i<n;i++){
			int value = in.nextInt();
			int key = in.nextInt();
			map.put(key, value);
		}
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());		
		
		//以value为准排序
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();
			}
		});
		int[][] data = new int[n][2];
		for(int i=0;i<n;i++){
			data[i][0] = list.get(i).getValue();		//难度
			data[i][1] = list.get(i).getKey();			//报酬
			//将难度对应的报酬设置为此难度以下的最大值
			if(i>0){
				if(data[i][1]<data[i-1][1])
					data[i][1] = data[i-1][1];
			}
		}
		
		TreeMap<Integer,Integer> tMap = new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			tMap.put(data[i][0], data[i][1]);
		}
		
		int mdata = 0;
		for(int i=0;i<m&&in.hasNextInt();i++){
			Integer max=0;
			mdata = in.nextInt();
			max = tMap.floorKey(mdata);		//返回小于等于mdata的最近的一个key值 。 treemap特有方法，不能用多态创建对象
			if (max!=null)
				System.out.println(tMap.get(max));
			else{
				System.out.println(0);
			}
		}
		

		
		in.close();
		

	}
}







