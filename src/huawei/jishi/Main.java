package huawei.jishi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//lastStringLength();
		charNum();
	}

	/**
	 * 题目描述 计算字符串最后一个单词的长度，单词以空格隔开。 输入描述: 一行字符串，非空，长度小于5000。
	 * 
	 * 输出描述: 整数N，最后一个单词的长度。
	 */
	public static void lastStringLength() {
		Scanner in = new Scanner(System.in);
		String[] arr = in.nextLine().split(" ");
		System.out.println(arr[arr.length - 1].length());
		in.close();
	}

	/**
	 * 题目描述 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
	 * 
	 * 输入描述: 输入一个有字母和数字以及空格组成的字符串，和一个字符。
	 * 
	 * 输出描述: 输出输入字符串中含有该字符的个数。
	 */
	public static void charNum() {
		Scanner in = new Scanner(System.in);
		char[] cs = in.nextLine().toLowerCase().toCharArray();
		char ch = in.nextLine().toCharArray()[0];
		int cnt = 0;
		for (int i = 0; i < cs.length - 1; i++) {
			if (cs[i] == ch)
				cnt++;
		}
		System.out.println(cnt);
		in.close();
	}

}
