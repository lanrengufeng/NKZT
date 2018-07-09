package leetcode;

public class Solution {
	public static void main(String[] args) {
		int[] A = { 2, 2, 1, 0, 4 };
		System.out.println(new Solution().canJump(A));
	}

	/**
	 * Given an array of non-negative integers, you are initially positioned at
	 * the first index of the array.
	 * 
	 * Each element in the array represents your maximum jump length at that
	 * position.
	 * 
	 * Determine if you are able to reach the last index.
	 * 
	 * For example: A =[2,3,1,1,4], returntrue.
	 * 
	 * A =[3,2,1,0,4], returnfalse.
	 * 
	 * @param A
	 * @return
	 */
	public boolean canJump(int[] A) {
		if (A.length < 1 || A == null)
			return false;
		int max = A[0];
		for (int i = 0; i < A.length && i <= max; i++)
			max = max > i + A[i] ? max : (i + A[i]);
		if (max >= A.length - 1)
			return true;

		return false;
	}

	/**
	 * 
	 * Given an array of non-negative integers, you are initially positioned at
	 * the first index of the array.
	 * 
	 * Each element in the array represents your maximum jump length at that
	 * position.
	 * 
	 * Your goal is to reach the last index in the minimum number of jumps.
	 * 
	 * For example: Given array A =[2,3,1,1,4]
	 * 
	 * The minimum number of jumps to reach the last index is2. (Jump1step from
	 * index 0 to 1, then3steps to the last index.)
	 * 
	 * @param A
	 * @return
	 */
	public int jump(int[] A) {
		if (A.length <= 1 || A == null)
			return 0;
		int step = 0; // 步数
		int cur = 0;	//当前位置
		int next = 0; // 下一步的最远位置
		for (int i = 0; i < A.length && i <= next; i++) {
			if (i > cur) {	//当前位置落后于实际位置，则向跳
				step++;	
				cur = next;	//跳到可以达到的最远位置
			}
			next = Math.max(next, i + A[i]);
		}
		if(next<A.length-1)
			return 0;
		else 
			return step;
	}

}
