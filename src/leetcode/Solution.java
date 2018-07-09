package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Solution so = new Solution();

		ListNode n = new ListNode(5);
		n.next = new ListNode(4);
		n.next.next = new ListNode(3);
		n.next.next.next = new ListNode(2);

		ListNode res = so.insertionSortList(n);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}

		/*
		 * Point[] points = { new Point(84, 250), new Point(0, 0), new Point(1,
		 * 0), new Point(0, -70), new Point(0, -70), new Point(1, -1), new
		 * Point(21, 10), new Point(42, 90), new Point(-42, -230) };
		 * System.out.println(so.maxPoints(points));
		 */

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
	 * Given a binary tree, return the postorder traversal of its nodes' values.
	 * 
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(root);
		while (!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if (root.left != null)
				s1.push(root.left);
			if (root.right != null)
				s1.push(root.right);
		}
		while (!s2.isEmpty())
			list.add(s2.pop().val);
		return list;
	}

	/**
	 * Sort a linked list using insertion sort.
	 * 
	 * @param head
	 * @return
	 */
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode preHead = new ListNode(-1);
		while (head != null) {
			// head是要插入的节点，next是下一个节点，pre是新链表中的节点
			ListNode pre = preHead;
			ListNode next = head.next;
			while (pre.next != null && pre.next.val <= head.val) {
				pre = pre.next;
			}
			head.next = pre.next;
			pre.next = head;
			head = next;
		}
		return preHead.next;
	}

	/**
	 * Sort a linked list in O(n log n) time using constant space complexity.
	 * 
	 * @param head
	 * @return
	 */
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode mid = getMid(head);
		ListNode midNext = mid.next;
		mid.next = null;
		/*
		 * ListNode n1 = sortList(head); ListNode n2 = sortList(midNext); return
		 * mergeList(n1, n2);
		 */
		return mergeList(sortList(head), sortList(midNext));
	}

	private ListNode getMid(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode mid = head;
		ListNode tmp = head;
		while (tmp.next != null && tmp.next.next != null) {
			mid = mid.next;
			tmp = tmp.next.next;
		}
		return mid;
	}

	private ListNode mergeList(ListNode p1, ListNode p2) {
		ListNode preHead = new ListNode(-1);
		ListNode cur = preHead;
		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				cur.next = p1;
				p1 = p1.next;
			} else {
				cur.next = p2;
				p2 = p2.next;
			}
			cur = cur.next;
		}
		cur.next = p1 == null ? p2 : p1;
		return preHead.next;
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
			// HashMap<Float, Integer> map = new HashMap<Float, Integer>();
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
					// String k = Math.round((y1 - y2)*1000000.0 / (x1 -
					// x2))/1000000+"";
					String k = String.format("%.4f", ((double) (y1 - y2)) / (x1 - x2));
					// float k = (float)(y1-y2)/(x1-x2);
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
