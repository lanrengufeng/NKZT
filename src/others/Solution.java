package others;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2 };
		System.out.println(Arrays.toString(new Solution().solve(arr)));

	}

	/**
	 * 题目： 输入一个数组，它由数字构成，可以表示成一个数A，反转该数得到B，求A与B差的绝对值。（不允许使用Java类库） 如[1,2,3] ,
	 * 321-123 = 198, 输出 [1,9,8] [1,2,1],输出[0]
	 * 
	 * @param digits
	 * @return
	 */
	public static int[] solve2(int[] digits) {
		if (digits == null || digits.length < 1)
			return null;
		int[] res = new int[digits.length];
		int[] tmp = new int[digits.length]; // 反转后的数组
		for (int i = 0; i < digits.length; i++) {
			tmp[i] = digits[digits.length - i - 1];
		}
		if (tmp[0] > digits[0]) // 保证tmp数组的数小于digits的数
			return solve(tmp);
		int a = 0; // 是否借位

		for (int i = digits.length - 1; i >= 0; i--) {
			int d = digits[i] - a;
			int t = tmp[i];
			if (d >= t) {
				res[i] = d - t;
				a = 0;
			} else {
				res[i] = d - t + 10;
				a = 1;
			}

		}
		if (res[res.length - 1] == 0)
			return new int[] { 0 };
		if (res[0] != 0)
			return res;
		int index = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] == 0)
				index = i;
			else
				break;
		}
		index++;
		if (index == 0)
			return res;
		else {
			int[] result = new int[res.length - index];
			for (int i = 0; i < result.length; i++)
				result[i] = res[i + index];
			return result;
		}

	}

	public static int[] solve(int[] digits) {
		if (digits == null || digits.length < 1)
			return null;
		int[] res = new int[digits.length];
		int[] tmp = new int[digits.length]; // 反转后的数组
		for (int i = 0; i < digits.length; i++) {
			tmp[i] = digits[digits.length - i - 1];
		}
		int j = 0;
		while (j < digits.length) {
			int d = digits[j];
			int t = tmp[j];
			if (d == t) {
				j++;
			} else if (d > t) {
				break;
			} else if (d < t) {
				return solve(tmp);
			}
		}
		int a = 0; // 是否借位

		for (int i = digits.length - 1; i >= 0; i--) {
			int d = digits[i] - a;
			int t = tmp[i];
			if (d >= t) {
				res[i] = d - t;
				a = 0;
			} else {
				res[i] = d - t + 10;
				a = 1;
			}

		}

		if (res[0] != 0)
			return res;
		int index = -1;
		for (int i = 0; i < res.length; i++) {
			if (res[i] == 0)
				index = i;
			else
				break;
		}
		index++;
		if (index == 0)
			return res;
		else if (index == res.length)
			return new int[] { 0 };
		else {
			int[] result = new int[res.length - index];
			for (int i = 0; i < result.length; i++)
				result[i] = res[i + index];
			return result;
		}

	}

}
