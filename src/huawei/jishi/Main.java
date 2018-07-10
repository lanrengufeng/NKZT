package huawei.jishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Main mm = new Main();

		mm.moveCoordinate();

		// mm.maxValue();

		// mm.numOf1();

		// mm.sortString();

		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.println(mm.reverse(in.nextLine())); in.close();
		 */

		// mm.reverseNum();

		// mm.numOfChar();

		// mm.noRepeatNum();

		// mm.mergeTable();

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
	 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，
	 * 并将最终输入结果输出到输出文件里面。
	 * 
	 * 
	 * 
	 * 输入：
	 * 
	 * 
	 * 
	 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
	 * 
	 * 
	 * 
	 * 坐标之间以;分隔。
	 * 
	 * 
	 * 
	 * 非法坐标点需要进行丢弃。如AA10; A1A; $%$; YAD; 等。
	 * 
	 * 
	 * 
	 * 下面是一个简单的例子 如：
	 * 
	 * 
	 * 
	 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
	 * 
	 * 
	 * 
	 * 处理过程：
	 * 
	 * 
	 * 
	 * 起点（0,0）
	 * 
	 * 
	 * 
	 * + A10 = （-10,0）
	 * 
	 * 
	 * 
	 * + S20 = (-10,-20)
	 * 
	 * 
	 * 
	 * + W10 = (-10,-10)
	 * 
	 * 
	 * 
	 * + D30 = (20,-10)
	 * 
	 * 
	 * 
	 * + x = 无效
	 * 
	 * 
	 * 
	 * + A1A = 无效
	 * 
	 * 
	 * 
	 * + B10A11 = 无效
	 * 
	 * 
	 * 
	 * + 一个空 不影响
	 * 
	 * 
	 * 
	 * + A10 = (10,-10)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 结果 （10， -10）
	 * 
	 * 
	 * 输入描述: 一行字符串
	 * 
	 * 输出描述: 最终坐标，以,分隔
	 */
	public void moveCoordinate() {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] data = input.split(";");
		int x = 0, y = 0; // 初始坐标
		for (int i = 0; i < data.length; i++) {
			String s = data[i]; // 当前运算
			if (s.length() < 2 || s.length() > 3) // 空串或者不符合的直接跳过
				continue;
			try {
				if (s.charAt(0) == 'A')
					x -= Integer.parseInt(s.substring(1));
				else if (s.charAt(0) == 'D')
					x += Integer.parseInt(s.substring(1));
				else if (s.charAt(0) == 'W')
					y += Integer.parseInt(s.substring(1));
				else if (s.charAt(0) == 'S')
					y -= Integer.parseInt(s.substring(1));
			} catch (Exception e) {
				// 数字解析异常，说明不符合，直接跳过
				continue;
			}
		}
		System.out.println(x + "," + y);
		in.close();
	}

	/**
	 * 题目描述 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，
	 * 下表就是一些主件与附件的例子： 主件 附件 电脑 打印机，扫描仪 书柜 图书 书桌 台灯，文具 工作椅 无
	 * 如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2
	 * 个附件。附件不再有从属于自己的附件。王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第
	 * 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。他希望在不超过 N 元（可以等于 N
	 * 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。 设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k
	 * 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为： v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ …
	 * +v[j k ]*w[j k ] 。（其中 * 为乘号） 请你帮助王强设计一个满足要求的购物单。
	 * 
	 * 
	 * 
	 * 输入描述: 输入的第 1 行，为两个正整数，用一个空格隔开：N m
	 * 
	 * （其中 N （ <32000 ）表示总钱数， m （ <60 ）为希望购买物品的个数。）
	 * 
	 * 
	 * 从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3 个非负整数 v p q
	 * 
	 * 
	 * （其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的重要度（ 1 ~ 5 ）， q 表示该物品是主件还是附件。如果 q=0
	 * ，表示该物品为主件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）
	 * 
	 * 
	 * 
	 * 
	 * 输出描述: 输出文件只有一个正整数，为不超过总钱数的物品的价格与重要度乘积的总和的最大值（ <200000 ）。
	 */
	public void maxValue() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int m = in.nextInt();
		int[] v = new int[m + 1]; // 物品的价格
		int[] p = new int[m + 1]; // 物品的重要度
		int[] q = new int[m + 1]; // 0表示为主件，否则为附件所属主件的编号
		for (int i = 1; i <= m; i++) {
			v[i] = in.nextInt();
			p[i] = v[i] * in.nextInt();
			q[i] = in.nextInt();
		}

		int[][] dp = new int[m + 1][N + 1]; // dp[i][j]表示总钱数为j时从前i件物品中能获得的最大价值
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= N; j++) {
				if (q[i] == 0) { // 第i个物品是主件
					if (v[i] <= j)
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v[i]] + p[i]);
					else
						dp[i][j] = dp[i - 1][j];
				} else { // 第i个物品是附件 所属主件编号为q[i]
					if (v[i] + v[q[i]] <= j)
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v[i] - v[q[i]]] + p[i] + p[q[i]]);
					else
						dp[i][j] = dp[i - 1][j];
				}
			}
		}
		System.out.println(dp[m][N]);
		in.close();
	}

	/**
	 * 统计二进制中1的个数
	 */
	public void numOf1() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0;
		while (n != 0) {
			cnt++;
			n &= (n - 1);
		}
		System.out.println(cnt);
		in.close();
	}

	/**
	 * 字符串字典序排序
	 */
	public void sortString() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		ArrayList<String> set = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			set.add(in.nextLine());
		}
		Collections.sort(set);
		for (String s : set) {
			System.out.println(s);
		}
		in.close();
	}

	/**
	 * 题目描述 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
	 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
	 * 
	 * @param sentence
	 * @return
	 */
	public String reverse(String sentence) {
		sentence = new StringBuilder(sentence).reverse().toString();
		String[] ss = sentence.split(" ");
		if (ss.length <= 1)
			return sentence;
		sentence = "";
		for (int i = 0; i < ss.length; i++) {
			String s = ss[i];
			sentence += new StringBuilder(s).reverse().toString() + " ";
		}
		return sentence.substring(0, sentence.length() - 1);
	}

	/**
	 * 题目描述 描述：
	 * 
	 * 输入一个整数，将这个整数以字符串的形式逆序输出
	 * 
	 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
	 * 
	 * 
	 * 
	 * 输入描述: 输入一个int整数
	 * 
	 * 输出描述: 将这个整数以字符串的形式逆序输出
	 */
	public void reverseNum() {
		Scanner in = new Scanner(System.in);
		System.out.println(new StringBuilder(in.next()).reverse());
		in.close();
	}

	/**
	 * 题目描述 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
	 * 
	 * 输入描述: 输入N个字符，字符在ACSII码范围内。
	 * 
	 * 输出描述: 输出范围在(0~127)字符的个数。
	 */
	public void numOfChar() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int[] arr = new int[128];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch <= 127 && ch >= 0)
				;
			arr[ch] = 1;
		}
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
		System.out.println(arr[arr.length - 1]);
		in.close();
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
		for (int i = n.length() - 1; i >= 0; i--) {
			set.add(n.charAt(i));
		}
		n = "";
		for (Character character : set) {
			n += character;
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
