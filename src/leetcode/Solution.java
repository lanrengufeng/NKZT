package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Solution so = new Solution();

		ListNode n = new ListNode(1);
		n.next = new ListNode(2);
		n.next.next = new ListNode(3);
		n.next.next.next = new ListNode(4);

		so.reorderList(n);

		/*
		 * ListNode res = so.insertionSortList(n); while (res != null) {
		 * System.out.println(res.val); res = res.next; }
		 */

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
	 * Given a string s and a dictionary of words dict, add spaces in s to
	 * construct a sentence where each word is a valid dictionary word.
	 * 
	 * Return all such possible sentences.
	 * 
	 * For example, given s ="catsanddog", dict =["cat", "cats", "and", "sand",
	 * "dog"].
	 * 
	 * A solution is["cats and dog", "cat sand dog"].
	 * 
	 * 
	 * @param s
	 * @param dict
	 * @return
	 */
	public ArrayList<String> wordBreak(String s, Set<String> dict) {
		ArrayList<String> list = new ArrayList<String>();
		if(s==null||s.length()<1||dict==null)
			return list;
		String tmp = s;		//辅助字符串
		ArrayList<String> list2 = new ArrayList<String>();	//辅助集合
		for(String string:dict){
			if(tmp.contains(string)){	//如果字符串中有字典中的单词，则替换为空格
				tmp = tmp.replace(string, "   ");		
				list2.add(string);
			}
		}
		return list;
	}

	/**
	 * Given a linked list, determine if it has a cycle in it.
	 * 
	 * Follow up: Can you solve it without using extra space?
	 * 
	 * 
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2)
				return true;
		}

		return false;
	}

	/**
	 * Given a linked list, return the node where the cycle begins. If there is
	 * no cycle, returnnull.
	 * 
	 * Follow up: Can you solve it without using extra space?
	 * 
	 * @param head
	 * @return
	 */
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2)
				break;
		}
		if (p2 == null || p2.next == null)
			return null; // 没有环
		p1 = head;
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

	/**
	 * Given a singly linked list L: L 0→L 1→…→L n-1→L n, reorder it to: L 0→L n
	 * →L 1→L n-1→L 2→L n-2→…
	 * 
	 * You must do this in-place without altering the nodes' values.
	 * 
	 * For example, Given{1,2,3,4}, reorder it to{1,4,2,3}.
	 * 
	 * @param head
	 */
	public void reorderList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null)
			return; // 链表长度小于3的时候不需要转换
		ListNode p1 = head; // 一次走一步
		ListNode p2 = head; // 一次走两步
		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		ListNode mid = p1; // 链表的中点位置
		// 翻转链表的后半部分
		ListNode cur = mid.next; // 中点的下一个节点，翻转的开始位置
		ListNode next = null; // 当前节点的下一个位置
		ListNode pre = mid; // 当前节点的上一个节点
		mid.next = null; // 中间节点指向null
		while (cur != null) {
			next = cur.next; // 记录下一个节点
			cur.next = pre; // 指向上一个节点
			pre = cur;
			cur = next;
		}
		ListNode end = pre; // 翻转后链表的右侧头结点
		ListNode start = head; // 左侧头结点
		while (true) {
			if (start == end || start == null) // 已遍历完毕
				break;
			ListNode startNext = start.next;
			ListNode endNext = end.next;
			start.next = end;
			end.next = startNext;
			start = startNext;
			end = endNext;
		}
	}

	/**
	 * Given a binary tree, return the preorder traversal of its nodes' values.
	 * 
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			root = stack.pop();
			list.add(root.val);
			if (root.right != null)
				stack.push(root.right);
			if (root.left != null)
				stack.push(root.left);
		}
		return list;
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
