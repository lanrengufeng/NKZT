package huawei.jishi;

import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Main mm = new Main();

		mm.noRepeatNum();
		
		//mm.mergeTable();

		// mm.approximateValue();

		/*
		 * Scanner in = new Scanner(System.in); long num = in.nextLong();
		 * 
		 * System.out.println(mm.getResult(num));
		 */
		// hexToDec();

		// splitStrings2();
		// splitStrings();
		// lastStringLength();
		// charNum();
		// in.close();
	}

	/**
	 * 题目描述 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
	 * 
	 * 输入描述: 输入一个int型整数
	 * 
	 * 输出描述: 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
	 */
	public void noRepeatNum() {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=n.length()-1;i>=0;i--){
			set.add(n.charAt(i));
		}
		n = "";
		for (Character character : set) {
			n+=character;
		}
		System.out.println(Integer.valueOf(n));
		in.close();
	}

	/**
	 * 题目描述 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
	 * 
	 * 输入描述: 先输入键值对的个数 然后输入成对的index和value值，以空格隔开
	 * 
	 * 输出描述: 输出合并后的键值对（多行）
	 */
	public void mergeTable() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int key = in.nextInt();
			int value = in.nextInt();
			if (map.containsKey(key))
				map.put(key, map.get(key) + value);
			else
				map.put(key, value);
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		in.close();
	}

	/**
	 * 题目描述 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
	 * 
	 * 输入描述: 输入一个正浮点数值
	 * 
	 * 输出描述: 输出该数值的近似整数值
	 */
	public void approximateValue() {
		Scanner in = new Scanner(System.in);
		float num = in.nextFloat();
		if (num - (int) num >= 0.5)
			System.out.println((int) num + 1);
		else
			System.out.println((int) num);

		in.close();
	}

	/**
	 * 题目描述 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
	 * 
	 * 最后一个数后面也要有空格
	 * 
	 * 详细描述：
	 * 
	 * 
	 * 函数接口说明：
	 * 
	 * public String getResult(long ulDataInput)
	 * 
	 * 输入参数：
	 * 
	 * long ulDataInput：输入的正整数
	 * 
	 * 返回值：
	 * 
	 * String
	 * 
	 * 
	 * 
	 * 输入描述: 输入一个long型整数
	 * 
	 * 输出描述: 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
	 * 
	 * @param ulDataInput
	 * @return
	 */
	public String getResult(long ulDataInput) {
		if (ulDataInput <= 1)
			return "";
		String res = "";
		long num = ulDataInput;
		while (num != 1) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					num /= i;
					res = res + i + " ";
					break;
				}
			}
		}
		return res;
	}

	public boolean isPrime(long num) {
		if (num < 2)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * 5 题目描述 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
	 * 
	 * 输入描述: 输入一个十六进制的数值字符串。
	 * 
	 * 输出描述: 输出该数值的十进制字符串。
	 */
	public static void hexToDec() {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String data = in.next();
			data = data.substring(2);
			System.out.println(Integer.parseInt(data, 16) + "");
		}
		in.close();
	}

	/**
	 * 4 题目描述 •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	 * 输入描述: 连续输入字符串(输入2次,每个字符串长度小于100)
	 * 
	 * 输出描述: 输出到长度为8的新字符串数组
	 */
	public static void splitStrings2() {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String s = in.nextLine();
			if (s.length() % 8 != 0)
				s += "0000000";
			while (s.length() >= 8) {
				System.out.println(s.substring(0, 8));
				s = s.substring(8);
			}
		}
		in.close();
	}

	/**
	 * 4 题目描述 •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	 * 输入描述: 连续输入字符串(输入2次,每个字符串长度小于100)
	 * 
	 * 输出描述: 输出到长度为8的新字符串数组
	 */
	public static void splitStrings() {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int index = 0;
		int len1 = s1.length();
		int len2 = s2.length();
		while (len1 - index >= 8) {
			System.out.println(s1.substring(index, index + 8));
			index += 8;
		}
		if (len1 - index > 0) {
			String s11 = s1.substring(index);
			for (int i = 0; i < 8 - len1 + index; i++) {
				s11 += 0;
			}
			System.out.println(s11);
		}
		index = 0;
		while (len2 - index >= 8) {
			System.out.println(s2.substring(index, index + 8));
			index += 8;
		}
		if (len2 - index > 0) {
			String s22 = s2.substring(index);
			for (int i = 0; i < 8 - len2 + index; i++) {
				s22 += 0;
			}
			System.out.println(s22);
		}

		in.close();
	}

	/**
	 * 1 题目描述 计算字符串最后一个单词的长度，单词以空格隔开。 输入描述: 一行字符串，非空，长度小于5000。
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
	 * 2 题目描述 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
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
