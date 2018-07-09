package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Solution so = new Solution();

		Point[] points = { new Point(84, 250), new Point(0, 0), new Point(1, 0), new Point(0, -70), new Point(0, -70), new Point(1, -1), new Point(21, 10),
				new Point(42, 90), new Point(-42, -230) };
		System.out.println(so.maxPoints(points));

		/*
		 * String[] tokens = { "2", "1", "+", "3", "*" };
		 * System.out.println(so.evalRPN(tokens));
		 */
		/*
		 * TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
		 * root.right = new TreeNode(3); root.left.left = new TreeNode(4);
		 * root.left.right = new TreeNode(5); // root.right.left = new
		 * TreeNode(6); root.right.right = new TreeNode(7);
		 * 
		 * System.out.println(so.run(root));
		 */

		/*
		 * int[] A = { 2, 2, 1, 0, 4 }; System.out.println(new
		 * Solution().canJump(A));
		 */
	}

	/**
	 * Given n points on a 2D plane, find the maximum number of points that lie
	 * on the same straight line.
	 * 
	 * @param points
	 * @return
	 */
	public int maxPoints(Point[] points) {
		if (points == null || points.length < 1)
			return 0;
		if (points.length <= 2)
			return points.length;
		int max = 0;
		for (int i = 0; i < points.length; i++) {
			int dup = 1; // 重合的点数
			int vtl = 0; // 垂直的点数
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			//HashMap<Float, Integer> map = new HashMap<Float, Integer>();
			int x1 = points[i].x;
			int y1 = points[i].y;
			for (int j = 0; j < points.length; j++) {
				if (j == i)
					continue;
				int x2 = points[j].x;
				int y2 = points[j].y;
				if (x1 == x2)
					if (y1 == y2)
						dup++;
					else
						vtl++;
				else {
					//String k = Math.round((y1 - y2)*1000000.0 / (x1 - x2))/1000000+"";
					String k = String.format("%.4f",((double)(y1 - y2)) / (x1 - x2));
					//float k = (float)(y1-y2)/(x1-x2);
					if (map.containsKey(k))
						map.put(k, map.get(k) + 1);
					else
						map.put(k, 1);
				}
			}

			int tmp = vtl;
			for (String s : map.keySet())
				tmp = Math.max(tmp, map.get(s));
			max = Math.max(max, tmp + dup);
		}
		return max;
	}

	/**
	 * Evaluate the value of an arithmetic expression in Reverse Polish
	 * Notation.
	 * 
	 * Valid operators are+,-,*,/. Each operand may be an integer or another
	 * expression.
	 * 
	 * Some examples:
	 * 
	 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9 ["4", "13", "5", "/",
	 * "+"] -> (4 + (13 / 5)) -> 6
	 * 
	 * @param tokens
	 * @return
	 */
	public int evalRPN(String[] tokens) {
		if (tokens.length < 1 || tokens == null)
			return Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			String s = tokens[i];
			if (s.equals("+"))
				stack.push(stack.pop() + stack.pop());
			else if (s.equals("-")) {
				int a = stack.pop();
				stack.push(stack.pop() - a);
			} else if (s.equals("*"))
				stack.push(stack.pop() * stack.pop());
			else if (s.equals("/")) {
				int a = stack.pop();
				stack.push(stack.pop() / a);
			} else
				stack.push(Integer.valueOf(s));
		}
		return stack.pop();
	}

	/**
	 * 1 Given a binary tree, find its minimum depth.The minimum depth is the
	 * number of nodes along the shortest path from the root node down to the
	 * nearest leaf node.
	 * 
	 * @param root
	 * @return
	 */
	public int run(TreeNode root) {
		if (root == null)
			return 0;
		int deep = 0;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			deep++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left == null && node.right == null)
					return deep;
				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);
			}
		}
		return -1;
	}

	/**
	 * 1 Given a binary tree, find its minimum depth.The minimum depth is the
	 * number of nodes along the shortest path from the root node down to the
	 * nearest leaf node.
	 * 
	 * @param root
	 * @return
	 */
	public int run2(TreeNode root) {
		if (root == null)
			return 0;
		int left = run(root.left);
		int right = run(root.right);
		if (left == 0 || right == 0)
			return right + 1 + left;
		return Math.min(left + 1, right + 1);
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
		int cur = 0; // 当前位置
		int next = 0; // 下一步的最远位置
		for (int i = 0; i < A.length && i <= next; i++) {
			if (i > cur) { // 当前位置落后于实际位置，则向跳
				step++;
				cur = next; // 跳到可以达到的最远位置
			}
			next = Math.max(next, i + A[i]);
		}
		if (next < A.length - 1)
			return 0;
		else
			return step;
	}

}
