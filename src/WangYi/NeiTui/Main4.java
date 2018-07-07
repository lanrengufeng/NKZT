package WangYi.NeiTui;

import java.util.Scanner;

/**
 * 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作: 1、将a_i放入b序列的末尾 2、逆置b序列
 * 小易需要你计算输出操作n次之后的b序列。 输入描述: 输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
 * 第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。
 * 
 * 
 * 输出描述: 在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
 * 
 * 输入例子1: 4 1 2 3 4
 * 
 * 输出例子1: 4 2 1 3
 * 
 * @author kafka
 *
 */
public class Main4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = new int[n];
		int index=0,mid = n/2;
		result[mid] = arr[0];
		if(n%2==0){//当有偶数个整数，从左侧开始，左偶右奇
			for(int i=1;i<n;i++){
				if(i%2==1){
					result[mid-(i/2+1)] = arr[i];
				}else{
					result[mid+i/2] = arr[i];
				}
			}
		}else{//当有奇数个整数，从右侧开始，左奇右偶
			for(int i=1;i<n;i++){
				if(i%2==1){
					result[mid+(i/2+1)] = arr[i];
				}else{
					result[mid-i/2] = arr[i];
				}
			}
		}
		
		for(int i=0;i<result.length;i++){
			if(i<result.length-1)
				System.out.print(result[i]+" ");
			else
				System.out.println(result[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			reverseArr(list);
		}

		// System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (i < list.size() - 1)
				System.out.print(list.get(i) + " ");
			else
				System.out.println(list.get(i));
		}

	}*/

	/*
	 * private static void reverseArr(List<Integer> list){ int
	 * left=0,right=list.size()-1,leftv=0,rightv=0; while(left<right){ leftv =
	 * list.get(left); rightv = list.get(right); list.remove(left);
	 * list.add(left, rightv); list.remove(right); list.add(right, leftv);
	 * left++; right--;
	 * 
	 * } }
	 */
	
/*	static Stack<Integer> stack = new Stack<Integer>();
	private static void reverseArr(List<Integer> list) {
		for (Integer integer : list) {
			stack.push(integer);
		}
		list.clear();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		
	}*/
}
