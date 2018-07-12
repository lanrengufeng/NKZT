package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

import org.w3c.dom.ls.LSInput;

public class Solution {
	public static void main(String[] args) {
		Solution so = new Solution();
		
		char[] str = {  };
		char[] pattern = { '.', '*' };
		System.out.println(so.match(str, pattern));
		
		//System.out.println(so.isNumeric("-.2".toCharArray()));
		
		// [16,14,12,10,8,6,4],5
		//int[] arr = { 2, 3, 4, 2, 6, 2, 5, 1 };
		//System.out.println(so.maxInWindows(arr, 1).toString());

		/*
		 * TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
		 * root.right = new TreeNode(2); root.left.left = new TreeNode(3);
		 * root.right.right = new TreeNode(3);
		 * 
		 * ArrayList<ArrayList<Integer>> list3 = so.Print(root); for
		 * (ArrayList<Integer> arrayList : list3) {
		 * System.out.println(arrayList.toString()); }
		 */

		// System.out.println(so.isSymmetrical(root));

		char[] chs = { '-', '1', '.', '2', 'e', '3' };
		// System.out.println(so.isNumeric(chs));

		

		// System.out.println(so.StrToInt("+232323"));

		// System.out.println(so.Add(3, 12));

		// System.out.println(so.LeftRotateString("abcdefg", 8));

		// System.out.println(so.ReverseSentence(" "));
		// System.out.println(so.ReverseSentence("a b c").length());
		/*
		 * int[] arr = {2,3,4,1,1,2};
		 * System.out.println(minNumberInRotateArray(arr));
		 * System.out.println(RectCover(1));
		 */

		/*
		 * int[] pre = {1,2,4,7,3,5,6,8}; int[] in = {4,7,2,1,5,3,8,6}; TreeNode
		 * root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0,
		 * in.length-1); System.out.println(root.left.val);
		 * System.out.println(root.right.val);
		 */

		// System.out.println(NumberOf1(-7));

		// System.out.println(Power(4, -1));

		/*
		 * ListNode list1 = new ListNode(1); list1.next = new ListNode(3);
		 * list1.next.next = new ListNode(5); ListNode list2 = new ListNode(2);
		 * list2.next = new ListNode(4); list2.next.next = new ListNode(6);
		 * 
		 * 
		 * while(list1!=null){ System.out.println(list1.val); list1 =
		 * list1.next; } System.out.println("----------"); while(list2!=null){
		 * System.out.println(list2.val); list2 = list2.next; }
		 * System.out.println("----------");
		 * 
		 * ListNode head = Merge(list1, list2); while (head != null) {
		 * System.out.println(head.val); head = head.next; }
		 */

		/*
		 * TreeNode root1 = new TreeNode(1); root1.left = new TreeNode(2);
		 * root1.right = new TreeNode(3); root1.left.left = new TreeNode(4);
		 * root1.left.right = new TreeNode(5); root1.right.left = new
		 * TreeNode(6); root1.right.right = new TreeNode(7);
		 */

		/*
		 * TreeNode root2 = new TreeNode(3); root2.left = new TreeNode(3); //
		 * root2.right = new TreeNode(7);
		 * 
		 * System.out.println(HasSubtree(root1, root2));
		 */

		/*
		 * TreeNode root1 = new TreeNode(1); root1.left = new TreeNode(2);
		 * root1.right = new TreeNode(3); root1.left.left = new TreeNode(4);
		 * root1.left.right = new TreeNode(5); root1.right.left = new
		 * TreeNode(4); root1.right.right = new TreeNode(5);
		 * 
		 * 
		 * Mirror2(root1); System.out.println(serialTreeNode(root1));
		 * 
		 * 
		 * Solution so = new Solution(); //
		 * System.out.println(so.PrintFromTopToBottom(root1).toString());
		 * so.PrintFromTopToBottom2(root1);
		 */

		/*
		 * RandomListNode node1 = new RandomListNode(1); RandomListNode node2 =
		 * new RandomListNode(2); RandomListNode node3 = new RandomListNode(3);
		 * RandomListNode node4 = new RandomListNode(4); RandomListNode node5 =
		 * new RandomListNode(5);
		 * 
		 * node1.next = node2; node2.next = node3; node3.next = node4;
		 * node4.next = node5;
		 * 
		 * node1.random = node3; node2.random = node5; node4.random = node2;
		 * 
		 * Solution so = new Solution(); RandomListNode node = so.Clone(node1);
		 * while(node!=null){ if(node.random!=null)
		 * System.out.println(node.label+"---"+node.random.label); else
		 * System.out.println(node.label); node = node.next; }
		 */

		/*
		 * TreeNode root = new TreeNode(4); root.left = new TreeNode(2);
		 * root.right = new TreeNode(6); root.left.left = new TreeNode(1);
		 * root.left.right = new TreeNode(3); root.right.left = new TreeNode(5);
		 * root.right.right = new TreeNode(7);
		 * 
		 * new Solution().Convert(root);
		 */

		// System.out.println(new Solution().Permutation("abc").toString());

		// int[] arr = { 3, 32, 321 };
		// Solution so = new Solution();
		// System.out.println(so.PrintMinNumber(arr));

		/*
		 * for(int i=1;i<20;i++){
		 * System.out.println(so.GetUglyNumber_Solution(i)); }
		 */

		// System.out.println(so.GetUglyNumber_Solution(1500));

		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(3);
		node1.next.next.next.next = new ListNode(4);
		node1.next.next.next.next.next = new ListNode(4);
		node1.next.next.next.next.next.next = new ListNode(5);

		ListNode res = so.deleteDuplication(node1);
		/*
		 * while (res != null) { System.out.println(res.val); res = res.next; }
		 */

		ListNode node2 = new ListNode(1);
		node2.next = new ListNode(2);
		node2.next.next = node1.next.next;

		// System.out.println(so.FindFirstCommonNode(node1, node2).val);
		// System.out.println(so.getCommonNode2(node1, node2).val);

		/*
		 * ArrayList<ArrayList<Integer>> list3 = so.FindContinuousSequence(9);
		 * for (ArrayList<Integer> arrayList : list3) {
		 * System.out.println(arrayList.toString()); }
		 */

	}

	/**
	 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
	 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
	 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
	 * 
	 * @param array
	 * @return
	 */
	public static int minNumberInRotateArray(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++)
			min = Math.min(min, array[i]);
		return min;
	}

	/**
	 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
	 */
	public static int RectCover(int target) {
		if (target < 1)
			return 0;
		if (target == 1)
			return 1;
		if (target == 2)
			return 2;
		return RectCover(target - 1) + RectCover(target - 2);
	}

	/**
	 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
	 * 
	 * @param pre
	 * @param preStart
	 * @param preEnd
	 * @param in
	 * @param inStart
	 * @param inEnd
	 * @return
	 */
	private static TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
		if (preStart > preEnd || inStart > inEnd)
			return null;
		TreeNode root = new TreeNode(pre[preStart]);
		for (int i = inStart; i <= inEnd; i++) {
			if (in[i] == pre[preStart]) {
				root.left = reConstructBinaryTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
				root.right = reConstructBinaryTree(pre, preStart + i - inStart + 1, preEnd, in, i + 1, inEnd);
			}
		}

		return root;
	}

	/**
	 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
	 * 
	 * @param n
	 * @return
	 */
	public static int NumberOf1(int n) {
		int cnt = 0;
		while (n != 0) {
			n = (n - 1) & n;
			cnt++;
		}
		return cnt;
	}

	/**
	 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
	 * 
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static double Power(double base, int n) {
		/*
		 * double res=1; while(exponent!=0){ exponent--; res*=base; } return
		 * res;
		 */

		// return Math.pow(base, exponent);
		int exponent = n;
		double res = 1;

		if (n > 0)
			exponent = n;
		else if (n < 0) {
			if (base == 0)
				throw new RuntimeException("分母不能为0");
			exponent = -n;
		} else
			return 1;

		while (exponent != 0) {
			if ((exponent & 1) == 1)
				res *= base;
			base *= base;
			exponent >>= 1;
		}

		return n > 0 ? res : (1 / res);
	}

	/**
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
	 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	 * 
	 * @param array
	 */
	public static void reOrderArray(int[] array) {
		int[] help = new int[array.length];
		int index = 0;
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1) {
				array[index++] = array[i];
			} else {
				help[j++] = array[i];
			}
		}
		j = 0;
		for (int i = index; i < array.length; i++)
			array[i] = help[j++];

	}

	/**
	 * 输入一个链表，输出该链表中倒数第k个结点。
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode FindKthToTail(ListNode head, int k) {
		ListNode res = head;
		if (head == null || k <= 0)
			return null;
		for (int i = 0; i < k - 1; i++) {
			head = head.next;
			if (head == null)
				return null;
		}
		while (head.next != null) {
			head = head.next;
			res = res.next;
		}

		return res;
	}

	/**
	 * 输入一个链表，反转链表后，输出链表的所有元素。
	 * 
	 * @param head
	 * @return
	 */
	public ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;

			pre = head;
			head = next;
		}
		return pre;
	}

	/**
	 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode head = null, curr = null;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				if (head == null) {
					head = curr = list1;
				} else {
					curr.next = list1;
					curr = curr.next;
				}
				list1 = list1.next;
			}

			else {
				if (head == null)
					head = curr = list2;
				else {
					curr.next = list2;
					curr = curr.next;
				}
				list2 = list2.next;
			}

		}
		if (list1 != null)
			curr.next = list1;
		else
			curr.next = list2;

		return head;

		/*
		 * if(list1==null) return list2; if(list2==null) return list1; ListNode
		 * head = null; if(list1.val<list2.val){ head = list1; head.next =
		 * Merge(list1.next, list2); }else{ head = list2; head.next =
		 * Merge(list1, list2.next); }
		 * 
		 * return head;
		 */

	}

	/**
	 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val)
				result = doseTreeNode1HasTreeNode2(root1, root2);
			if (!result)
				result = doseTreeNode1HasTreeNode2(root1.left, root2);
			if (!result)
				result = doseTreeNode1HasTreeNode2(root1.right, root2);
		}

		return result;
	}

	private static boolean doseTreeNode1HasTreeNode2(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return doseTreeNode1HasTreeNode2(root1.left, root2.left) && doseTreeNode1HasTreeNode2(root1.right, root2.right);
	}

	/**
	 * 将二叉树序列化成字符串 1_2_#_#_`````` 以_分割，#表示空
	 * 
	 * @param root
	 * @return
	 */
	public static String serialTreeNode(TreeNode root) {
		if (root == null)
			return "#_";
		String res = root.val + "_";
		res += serialTreeNode(root.left);
		res += serialTreeNode(root.right);
		return res;
	}

	/**
	 * 操作给定的二叉树，将其变换为源二叉树的镜像。
	 * 
	 * @param root
	 */
	public static void Mirror(TreeNode root) {
		if (root == null)
			return;
		// 序列化，然后重建
		String node = serialTreeNode(root);
		String[] strings = node.split("_");
		// System.out.println(Arrays.toString(strings));
		LinkedList<String> queue = new LinkedList<String>();
		for (int i = 0; i < strings.length; i++)
			queue.offer(strings[i]);
		rebuildTree(queue, root);
		// System.out.println(serialTreeNode(root));
	}

	private static TreeNode rebuildTree(LinkedList<String> queue, TreeNode root) {
		if (queue.isEmpty())
			return null;
		String s = queue.poll();
		if (s.equals("#"))
			return null;
		if (root == null)
			root = new TreeNode(Integer.valueOf(s));
		root.val = Integer.valueOf(s);
		root.right = rebuildTree(queue, root.right);
		root.left = rebuildTree(queue, root.left);
		return root;
	}

	/**
	 * 操作给定的二叉树，将其变换为源二叉树的镜像。
	 * 
	 * @param root
	 */
	public static void Mirror2(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			return;
		}
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		Mirror2(root.left);
		Mirror2(root.right);

	}

	/**
	 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13
	 * 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	 * 
	 * @param matrix
	 * @return
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return null;
		int a = 0, b = 0, c = matrix.length - 1, d = matrix[0].length - 1; // (a,b)(c,d)为左上角和右下角的坐标
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (a <= c && b <= d) {
			printMatrix(list, matrix, a, b, c, d);
			a++;
			b++;
			c--;
			d--;
		}
		return list;
	}

	private void printMatrix(ArrayList<Integer> list, int[][] matrix, int a, int b, int c, int d) {
		if (a == c) { // 只有一行
			for (int i = b; i <= d; i++)
				list.add(matrix[a][i]);
		} else if (b == d) {// 只有一列
			for (int i = a; i <= c; i++)
				list.add(matrix[i][b]);
		} else {
			// 打印一个圈
			for (int i = b; i < d; i++)
				list.add(matrix[a][i]);
			// System.out.print(matrix[a][i]+",");
			for (int i = a; i < c; i++)
				list.add(matrix[i][d]);
			// System.out.print(matrix[i][d]+",");
			for (int i = d; i > b; i--)
				list.add(matrix[c][i]);
			// System.out.print(matrix[c][i]+",");
			for (int i = c; i > a; i--)
				list.add(matrix[i][b]);
			// System.out.print(matrix[i][b]+",");
		}
	}

	/**
	 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
	 * 
	 * @author kafka
	 *
	 */
	public static class MyStack {
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;

		public MyStack() {
			this.stack1 = new Stack<Integer>();
			this.stack2 = new Stack<Integer>();
		}

		public void push(int node) {
			stack1.push(node);
			if (stack2.isEmpty())
				stack2.push(node);
			else {
				int min = stack2.peek() > node ? node : stack2.peek();
				stack2.push(min);
			}

		}

		public void pop() {
			if (stack1.isEmpty())
				throw new RuntimeException("stack is empty!");
			stack1.pop();
			stack2.pop();
		}

		public int top() {
			if (stack1.isEmpty())
				throw new RuntimeException("stack is empty!");
			return stack1.peek();
		}

		public int min() {
			if (stack1.isEmpty())
				throw new RuntimeException("stack is empty!");
			return stack2.peek();
		}

	}

	/**
	 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
	 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
	 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。 （注意：这两个序列的长度是相等的）
	 * 
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length != popA.length || pushA == null || popA == null)
			return false;
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0; // popA的下标
		for (int i = 0; i < pushA.length; i++) {
			int num = pushA[i];
			stack.push(num);
			while (!stack.isEmpty() && stack.peek() == popA[index]) {
				stack.pop();
				index++;
			}
		}
		return stack.isEmpty();
	}

	/**
	 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
	 * 
	 * @param root
	 * @return
	 */

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null)
			return null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
			list.add(node.val);
		}
		return list;
	}

	public void PrintFromTopToBottom2(TreeNode root) {
		if (root == null)
			return;
		TreeNode last, nlast;
		last = root;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + "\t");
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
			nlast = queue.peekLast();
			if (node == last) {
				System.out.println();
				last = nlast;
			}

		}

	}

	/**
	 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
	 * 
	 * @param sequence
	 * @return
	 */
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length <= 0)
			return false;
		if (sequence.length == 1)
			return true;
		return judge(sequence, 0, sequence.length - 1);
	}

	private boolean judge(int[] sequence, int start, int root) {
		if (start >= root)
			return true;
		int i = start;
		while (sequence[i] < sequence[root]) {
			i++;
		}
		for (int j = i; j < root; j++) {
			if (sequence[j] < sequence[root])
				return false;
		}

		return judge(sequence, start, i - 1) && judge(sequence, i, root - 1);
	}

	ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();

	/**
	 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
	 * 
	 * @param root
	 * @param target
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null)
			return listAll;
		list.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null)
			listAll.add(new ArrayList<Integer>(list));
		FindPath(root.left, target);
		FindPath(root.right, target);
		list.remove(list.size() - 1);
		return listAll;
	}

	/**
	 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
	 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
	 * 
	 * @param pHead
	 * @return
	 */
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null)
			return null;
		// 插入辅助节点
		insertNode(pHead);

		// 遍历新节点，为辅助节点连上任意指针
		linkRandomNode(pHead);

		// 拆分链表，返回偶数位置
		RandomListNode res = pHead.next;
		splitRandomNode(pHead, res);

		return res;
	}

	private void splitRandomNode(RandomListNode pHead, RandomListNode res) {
		if (pHead == null)
			return;
		pHead.next = pHead.next.next;
		if (res.next != null)
			res.next = res.next.next;
		splitRandomNode(pHead.next, res.next);
	}

	private void linkRandomNode(RandomListNode node) {
		if (node == null)
			return;
		if (node.random != null)
			node.next.random = node.random.next;
		linkRandomNode(node.next.next);
	}

	private void insertNode(RandomListNode node) {
		if (node == null)
			return;
		RandomListNode tmp = new RandomListNode(node.label);
		tmp.next = node.next;
		node.next = tmp;
		insertNode(tmp.next);
	}

	/**
	 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
	 * 
	 * @param pRootOfTree
	 * @return
	 */
	public TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return null;
		if (pRootOfTree.left == null && pRootOfTree.right == null)
			return pRootOfTree;
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		inTreeNode(pRootOfTree, list);
		/*
		 * for (TreeNode treeNode : list) { System.out.println(treeNode.val); }
		 */
		for (int i = 1; i < list.size(); i++) {
			list.get(i - 1).right = list.get(i);
			list.get(i).left = list.get(i - 1);
		}

		return list.get(0);
	}

	private void inTreeNode(TreeNode node, ArrayList<TreeNode> list) {
		if (node == null)
			return;
		inTreeNode(node.left, list);
		list.add(node);
		inTreeNode(node.right, list);

	}

	ArrayList<String> list2 = new ArrayList<String>();

	/**
	 * 题目描述
	 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,
	 * bac,bca,cab和cba。 输入描述: 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
	 * 
	 * @param str
	 * @return
	 */
	public ArrayList<String> Permutation(String str) {

		if (str == null || str.length() < 1)
			return list2;
		if (str.length() == 1) {
			list2.add(str);
			return list2;
		}
		char[] cs = str.toCharArray();

		getStr(str, 0);
		Collections.sort(list2);
		return list2;
		// return new ArrayList<>(new TreeSet<>(list2));
	}

	private void getStr(String str, int i) {
		if (i == str.length() - 1) {
			return;
		}

		for (int j = i; j < str.length(); j++) {
			char[] cs = str.toCharArray();
			char tmp = cs[i];
			cs[i] = cs[j];
			cs[j] = tmp;
			if (!list2.contains(String.valueOf(cs)))
				list2.add(String.valueOf(cs));
			getStr(String.valueOf(cs), i + 1);

		}

	}

	/**
	 * 求连续最大子序列和 [1,-2,3,10,-4,7,2,-5] 18
	 * 
	 * @param array
	 * @return
	 */
	public int FindGreatestSumOfSubArray(int[] array) {
		if (array.length < 2)
			return array[0];
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (sum < 0) {
				sum = 0;
				sum += array[i];
			} else {
				sum += array[i];
			}
			max = max > sum ? max : sum;
		}

		return max;
	}

	/**
	 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、
	 * 13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
	 * 
	 * @param n
	 * @return
	 */
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for (int i = 1; i <= n; i *= 10) { // i是当前的位数
			int a = n / i; // 从最高位到第i位
			int b = n % i; // i右边的数
			count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
		}
		return count;
	}

	/**
	 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
	 * 则打印出这三个数字能排成的最小数字为321323。
	 * 
	 * @param numbers
	 * @return
	 */
	public String PrintMinNumber(int[] numbers) {
		if (numbers == null || numbers.length < 1)
			return "";
		if (numbers.length == 1)
			return numbers[0] + "";
		Integer[] nums = new Integer[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			nums[i] = numbers[i];
		}
		Arrays.sort(nums, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				int a = Integer.valueOf(o1 + "" + o2);
				int b = Integer.valueOf(o2 + "" + o1);
				return a - b;
			}
		});

		String res = "";
		for (int i = 0; i < nums.length; i++)
			res += nums[i];
		return res;
	}

	/**
	 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
	 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
	 * 
	 * @param index
	 * @return
	 */
	public int GetUglyNumber_Solution(int index) {
		if (index < 7)
			return index;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int t2 = 0, t3 = 0, t5 = 0;
		list.add(1);
		while (list.size() < index) {
			int num2 = list.get(t2) * 2;
			int num3 = list.get(t3) * 3;
			int num5 = list.get(t5) * 5;
			int num = Math.min(num2, Math.min(num3, num5));
			list.add(num);
			if (num == num2)
				t2++;
			if (num == num3)
				t3++;
			if (num == num5)
				t5++;
		}
		return list.get(index - 1);
	}

	/**
	 * 输入两个链表，找出它们的第一个公共结点。
	 * 
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null)
			return null;

		ListNode node1 = hasLoop(pHead1); // 判断链表是否有环，有环则返回入环节点
		ListNode node2 = hasLoop(pHead2);

		if (node1 == null && node2 == null)
			return getCommonNode(pHead1, pHead2);

		if (node1 != null && node2 != null) {
			// 两个都有环
			if (node1 == node2) {
				// 入环节点一样
				ListNode p1 = pHead1;
				ListNode p2 = pHead2;
				int cnt = 0;
				while (p1 != node1) {
					p1 = p1.next;
					cnt++;
				}
				while (p2 != node2) {
					p2 = p2.next;
					cnt--;
				}

				p1 = pHead1;
				p2 = pHead2;
				if (cnt > 0) { // 第一个链表更长
					while (cnt > 0) {
						cnt--;
						p1 = p1.next;
					}
					while (p1 != node1) {
						if (p1 == p2)
							return p1;
						p1 = p1.next;
						p2 = p2.next;
					}

				} else if (cnt < 0) {// 第二个链表更长
					while (cnt < 0) {
						cnt++;
						p2 = p2.next;
					}
					while (p1 != node1) {
						if (p1 == p2)
							return p1;
						p1 = p1.next;
						p2 = p2.next;
					}

				} else {
					while (p1 != node1) {
						if (p1 == p2)
							return p1;
						p1 = p1.next;
						p2 = p2.next;
					}
				}
				return node1;
			} else {
				// 入环节点不一样
				ListNode p = node1;
				while (p != node1) {
					if (p == node2)
						return node2;
					p = p.next;
				}
				return null; // 两个不相交的有环链表
			}

		}

		return null;
	}

	private ListNode hasLoop(ListNode pHead1) {
		// 判断链表是否有环，有则返回入环节点
		if (pHead1.next == null)
			return null;
		ListNode p1 = pHead1; // 步进1
		ListNode p2 = pHead1; // 步进2
		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				// 在环中相遇，继续next，直到入环节点
				p1 = pHead1;
				while (p1 != p2) {
					p1 = p1.next;
					p2 = p2.next;
				}
				return p1;
			}

		}
		return null;
	}

	private ListNode getCommonNode(ListNode node1, ListNode node2) {

		// 获得两个无环链表的公共节点
		// 两个都没有环
		ListNode p1 = node1;
		ListNode p2 = node2;
		int cnt = 0;
		while (p1.next != null) {
			p1 = p1.next;
			cnt++;
		}
		while (p2.next != null) {
			p2 = p2.next;
			cnt--;
		}
		if (p1 != p2) // 最后一个节点不等，直接返回null
			return null;
		p1 = node1;
		p2 = node2;
		if (cnt > 0) { // 第一个链表更长
			while (cnt > 0) {
				cnt--;
				p1 = p1.next;
			}
			while (p1 != null) {
				if (p1 == p2)
					return p1;
				p1 = p1.next;
				p2 = p2.next;
			}

		} else if (cnt < 0) {// 第二个链表更长
			while (cnt < 0) {
				cnt++;
				p2 = p2.next;
			}
			while (p1 != null) {
				if (p1 == p2)
					return p1;
				p1 = p1.next;
				p2 = p2.next;
			}

		} else {
			while (p1 != null) {
				if (p1 == p2)
					return p1;
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		return null;
	}

	/**
	 * 返回两个无环链表的公共节点，返回null表示没有交点
	 * 
	 * @param node1
	 * @param node2
	 * @return
	 */
	private ListNode getCommonNode2(ListNode node1, ListNode node2) {
		if (node1 == null || node2 == null)
			return null;
		ListNode p1 = node1;
		ListNode p2 = node2;
		while (p1 != p2) {
			p1 = p1 == null ? node2 : p1.next;
			p2 = p2 == null ? node1 : p2.next;
		}
		return p1;
	}

	/**
	 * 统计一个数字在排序数组中出现的次数。
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int GetNumberOfK(int[] array, int k) {
		int cnt = 0;
		boolean left = true;
		boolean right = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k)
				cnt++;
		}
		return cnt;
	}

	/**
	 * 
	 * @param root
	 * @return
	 */
	public int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return Math.max(left, right) + 1;
	}

	/**
	 * 
	 * @param root
	 * @return
	 */
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		boolean leftB = IsBalanced_Solution(root.left);
		boolean rightB = IsBalanced_Solution(root.right);

		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		if (Math.abs(left - right) > 1)
			return false;

		return leftB && rightB;
	}

	public boolean IsBalanced_Solution2(TreeNode root) {

		return getDepth(root) != -1;
	}

	private int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = getDepth(root.left);
		if (left == -1)
			return -1;
		int right = getDepth(root.right);
		if (right == -1)
			return -1;
		return Math.abs(right - left) > 1 ? -1 : (1 + Math.max(left, right));
	}

	/**
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
	 * 
	 * @param array
	 * @param num1
	 * @param num2
	 */
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < array.length; i++) {
			String num = array[i] + "";
			if (list.contains(num))
				list.remove(num);
			else
				list.add(num);
		}
		num1[0] = Integer.parseInt(list.get(0));
		num2[0] = Integer.parseInt(list.get(1));
	}

	public void FindNumsAppearOnce2(int[] array, int num1[], int num2[]) {
		int tmp = 0;
		for (int i = 0; i < array.length; i++)
			tmp ^= array[i]; // tmp等于不相等的两个数的异或结果
		int index = getFirst1(tmp);
		for (int i = 0; i < array.length; i++) {
			if (isIndex1(array[i], index))
				num1[0] ^= array[i];
			else
				num2[0] ^= array[i];
		}
	}

	private int getFirst1(int num) {
		// 返回二进制中出现的第一个1的下标
		int res = 0;
		while ((num & 1) == 0) {
			num >>= 1;
			res++;
		}
		return res;
	}

	private boolean isIndex1(int num, int i) {
		// int数num的第i位是否是1
		num >>= i;
		return (num & 1) == 1;
	}

	/**
	 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
	 * 
	 * @param sum
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		if (sum <= 2) {
			return listAll;
		}
		int max = (int) Math.sqrt(sum * 2);
		int num = max;
		while (num >= 2) {
			if ((num & 1) == 1 && sum % num == 0 || sum % num * 2 == num) {
				int n = sum / num;
				for (int i = n - (num - 1) / 2; i <= n + num / 2; i++) {
					list.add(i);
				}
				listAll.add(list);
				list = new ArrayList<Integer>();

			}
			num--;
		}
		return listAll;
	}

	/**
	 * 题目描述 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
	 * 输出描述: 对应每个测试案例，输出两个数，小的先输出。
	 * 
	 * @param array
	 * @param sum
	 * @return
	 */
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (array == null || array.length < 2)
			return list;
		int start = 0, end = array.length - 1;
		while (start < end) {
			if (array[start] + array[end] < sum)
				start++;
			else if (array[start] + array[end] > sum)
				end--;
			else {
				list.add(array[start]);
				list.add(array[end]);
				break;
			}
		}
		return list;
	}

	/**
	 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
	 * 请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？
	 * OK，搞定它！
	 * 
	 * @param str
	 * @param n
	 * @return
	 */
	public String LeftRotateString(String str, int n) {
		if (str.length() < 1 || str == null)
			return "";
		int len = str.length();
		int m = n % len; // 实际左移位数
		// String left = str.substring(0,m);
		// String right = str.substring(m);
		str += str;
		return str.substring(m, m + len);
	}

	/**
	 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看
	 * ，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a
	 * student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
	 * 
	 * @param str
	 * @return
	 */
	public String ReverseSentence(String str) {
		if (str.trim().length() < 1)
			return str;
		StringBuilder sb = new StringBuilder(str);
		String strR = sb.reverse().toString();
		sb = new StringBuilder();
		String[] strs = strR.split(" ");
		for (int i = 0; i < strs.length; i++) {
			sb.append(new StringBuilder(strs[i]).reverse()).append(" ");
		}
		String res = sb.toString();
		return res.substring(0, res.length() - 1);
	}

	/**
	 * 题目描述 LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,
	 * 想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My
	 * God!”不是顺子.....LL不高兴了,他想了想,决定大\小
	 * 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So
	 * Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
	 * 
	 * @param numbers
	 * @return
	 */
	public boolean isContinuous(int[] numbers) {
		if (numbers.length != 5)
			return false;
		Arrays.sort(numbers);
		int index0 = -1; // 最后一个0的下标
		for (int i = 0; i < numbers.length; i++) {
			index0 = numbers[i] == 0 ? i : index0;
		}
		for (int i = index0 + 1; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1])
				return false;
		}
		if (numbers[4] - numbers[index0 + 1] < 5)
			return true;

		return false;
	}

	/**
	 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
	 * 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
	 * 然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
	 * 可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：
	 * 小朋友的编号是从0到n-1) f(1,m) = 0; n=1 f(n,m) = (f(n-1,m)+m)%n; n>1
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public int LastRemaining_Solution(int n, int m) {
		if (n < 1 || m < 1)
			return -1;
		int last = 0;
		for (int i = 2; i <= n; i++)
			last = (last + m) % i;
		return last;
	}

	/**
	 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
	 * 
	 * @param n
	 * @return
	 */
	public int Sum_Solution(int n) {
		int sum = n;
		boolean flag = n > 0 && (sum += Sum_Solution(n - 1)) > 1;
		return sum;
	}

	/**
	 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int Add(int num1, int num2) {
		int sum, tmp;
		while (num2 != 0) {
			sum = num1 ^ num2;
			tmp = (num1 & num2) << 1;
			num1 = sum;
			num2 = tmp;
		}
		return num1;
	}

	/**
	 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
	 * 
	 * @param str
	 * @return
	 */
	public int StrToInt(String str) {
		if (str.trim().length() < 1)
			return 0;
		int s = 1;
		int res = 0;
		if (str.charAt(0) == '-')
			s = -1;
		for (int i = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < 48 || ch > 57)
				return 0;
			res = res * 10 + ch - 48;
		}
		return res * s;

		/*
		 * if(str.charAt(0)=='-'){ //带负号的数字 int res=0; for(int
		 * i=1;i<str.length();i++){ char ch = str.charAt(i); if(ch<48||ch>57)
		 * return 0; res = res * 10 + ch - 48; } return -res; } else
		 * if(str.charAt(0)=='+'){ //带正号的数字 int res=0; for(int
		 * i=1;i<str.length();i++){ char ch = str.charAt(i); if(ch<48||ch>57)
		 * return 0; res = res * 10 + ch - 48; } return res; } else{ //不带符号的数字
		 * int res=0; for(int i=0;i<str.length();i++){ char ch = str.charAt(i);
		 * if(ch<48||ch>57) return 0; res = res * 10 + ch - 48; } return res; }
		 */
	}

	public int StrToInt2(String str) {
		if (str.trim().length() < 1)
			return 0;
		int s = 1;
		if (str.charAt(0) == '-')
			s = -1;
		int res = 0;
		for (int i = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < 48 || ch > 57)
				return 0;
			res = (res << 1) + (res << 3) + (ch & 0xf);
		}
		return res * s;
	}

	/**
	 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
	 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，
	 * 但是与"aa.a"和"ab*a"均不匹配
	 * 
	 * @param str
	 * @param pattern
	 * @return
	 */
	public boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null)
			return false;

		return match(str, 0, pattern, 0);
	}

	private boolean match(char[] str, int i, char[] pattern, int j) {
		// str和pattern都到末尾，则匹配成功
		if (i == str.length && j == pattern.length)
			return true;
		if (i != str.length && j == pattern.length)
			return false;
		// 模式第2个是*，且字符串第1个跟模式第1个匹配,分3种匹配模式；如不匹配，模式后移2位
		if (j + 1 < pattern.length && pattern[j + 1] == '*') {
			if ((i < str.length && str[i] == pattern[j]) || (pattern[j] == '.' && i < str.length))
				return match(str, i + 1, pattern, j + 2) || match(str, i + 1, pattern, j) || match(str, i, pattern, j + 2);
			else
				return match(str, i, pattern, j + 2);
		} else { // 模式第2个不是*，且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
			if ((i < str.length && str[i] == pattern[j]) || (i < str.length && pattern[j] == '.'))
				return match(str, i + 1, pattern, j + 1);
		}

		return false;
	}

	/**
	 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123",
	 * "3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
	 * 
	 * 思路： 判断第一个遇到.还是e 首位可以是 + - 除去正负号的首位必须是0-9的数字 从有效首位后一位到最后一位最多只能有一个.
	 * 且必须在e或E的前面（如果有的话）， . 的前后必须位0-9的数字 e的后面第一位可以为-，出去-号后必须全是整数
	 * 
	 * @param str
	 * @return
	 */
	public boolean isNumeric(char[] str) {
		if (str.length < 1)
			return false;
		if ((str[0] < '0' || str[0] > '9') && str.length == 1)
			return false;
		int i = (str[0] == '-' || str[0] == '+') ? 1 : 0; // 第一个有效位
		int len = str.length;
		int state = 0;
		// 0表示只有数字，1表示先遇到. 2表示先遇到E
		/*
		 * if(str[i]<'0'||str[i]>'9') return false; i++; //跳过第一个有效数字
		 */ for (; i < len; i++) {
			char ch = str[i];
			if (ch == '.') {
				state = 1;
				break;
			}
			if (ch == 'e' || ch == 'E') {
				state = 2;
				break;
			}
			if (ch < '0' || ch > '9')
				return false;
		}

		// state=1，遇到了小数点
		if (state == 1) {
			i++; // 移动到小数点的下一位
			/*
			 * if(str[i]<'0'||str[i]>'9'||i==len) return false; i++;
			 */
			for (; i < len; i++) {
				char ch = str[i];
				if (ch == 'e' || ch == 'E') {
					state = 2;
					break;
				}
				if (ch < '0' || ch > '9')
					return false;
			}
		}

		// state=2,遇到了指数位
		if (state == 2) {
			i++; // 指数位的下一位
			if (i == len)
				return false;
			if (str[i] == '-' || str[i] == '+')
				i++;
			if (i == len)
				return false;
			for (; i < len; i++) {
				char ch = str[i];
				if (ch < '0' || ch > '9')
					return false;
			}
		}
		return true;
	}

	/**
	 * 一个链表中包含环，请找出该链表的环的入口结点。
	 * 
	 * @param pHead
	 * @return
	 */
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null)
			return null;
		ListNode p1 = pHead;
		ListNode p2 = pHead;
		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2)
				break;
		}
		p1 = pHead;
		while (p1 != p2 && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

	/**
	 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5
	 * 处理后为 1->2->5
	 * 
	 * @param pHead
	 * @return
	 */
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode head = new ListNode(-1);
		head.next = pHead;
		ListNode node = pHead;
		ListNode last = head;
		while (node != null && node.next != null) {
			if (node.val == node.next.val) {
				int val = node.val;
				while (node != null && node.val == val)
					node = node.next;
				last.next = node;
			} else {
				last = node;
				node = node.next;
			}
		}
		return head.next;
	}

	/**
	 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
	 * 
	 * @param pNode
	 * @return
	 */
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		if (pNode.right != null) {// 假如当前节点有右子节点
			return leftMostChild(pNode.right);
		} else {
			// 没有右子节点，则向上查询，直到查到当前节点为左子节点，则返回其父节点
			TreeLinkNode n = pNode;
			TreeLinkNode p = n.next; // n的父节点
			while (p != null && p.left != n) {
				n = p;
				p = p.next;
			}
			return p;
		}
	}

	private TreeLinkNode leftMostChild(TreeLinkNode n) {
		// 获得当前节点的左节点
		if (n == null)
			return null;
		while (n.left != null)
			n = n.left;
		return n;
	}

	/**
	 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
	 * 
	 * @param pRoot
	 * @return
	 */
	boolean isSymmetrical(TreeNode pRoot) {
		String s1 = serialTreeNode(pRoot);
		String s2 = serialTreeNode2(pRoot);
		return s1.equals(s2);
	}

	private String serialTreeNode2(TreeNode root) {
		// 以中右左的顺序序列化二叉树
		if (root == null)
			return "#_";
		String res = root.val + "_";
		res += serialTreeNode2(root.right);
		res += serialTreeNode2(root.left);
		return res;
	}

	/**
	 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
	 * 
	 * @param pRoot
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null)
			return listAll;
		boolean flag = true; // true表示自左向右，false表示自右向左
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>(); // 双端队列存放二叉树的每一层
		queue.offer(pRoot);

		while (!queue.isEmpty()) {
			if (flag) {
				// 从左向右打印
				ArrayList<Integer> list = new ArrayList<Integer>();
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode node = queue.pollFirst();
					list.add(node.val);
					if (node.left != null)
						queue.offer(node.left);
					if (node.right != null)
						queue.offer(node.right);
				}
				listAll.add(list);
				flag = !flag;

			} else {
				// 从右向左打印
				ArrayList<Integer> list = new ArrayList<Integer>();
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode node = queue.pollLast();
					list.add(node.val);
					if (node.right != null)
						queue.offerFirst(node.right);
					if (node.left != null)
						queue.offerFirst(node.left);
				}
				listAll.add(list);
				flag = !flag;

			}
		}
		return listAll;
	}

	/**
	 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
	 * 
	 * @param pRoot
	 * @return
	 */
	ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null)
			return listAll;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>(); // 双端队列存放二叉树的每一层
		queue.offer(pRoot);
		while (!queue.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);
			}
			listAll.add(list);
		}
		return listAll;
	}

	/**
	 * 序列化二叉树
	 * 
	 * @param root
	 * @return
	 */
	String Serialize(TreeNode root) {
		if (root == null)
			return "#_";
		String res = root.val + "_";
		res += Serialize(root.left);
		res += Serialize(root.right);
		return res;
	}

	/**
	 * 反序列化二叉树
	 * 
	 * @param str
	 * @return
	 */
	TreeNode Deserialize(String str) {
		if (str.length() < 1 || str == null || str.equals("#_"))
			return null;
		String[] vals = str.split("_");
		LinkedList<String> queue = new LinkedList<String>();
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] != "#")
				queue.offer(vals[i]);
		}
		return reconPreOrder(queue);
	}

	private TreeNode reconPreOrder(LinkedList<String> queue) {
		// 重建二叉树
		String val = queue.poll();
		if (val.equals("#"))
			return null;
		TreeNode head = new TreeNode(Integer.valueOf(val));
		head.left = reconPreOrder(queue);
		head.right = reconPreOrder(queue);
		return head;
	}

	int cntNode = 0;

	/**
	 * 给定一颗二叉搜索树，请找出其中的第k小的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
	 * 
	 * @param pRoot
	 * @param k
	 * @return
	 */
	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode node = KthNode(pRoot.left, k);
			if (node != null)
				return node;
			cntNode++;
			if (cntNode == k)
				return pRoot;
			node = KthNode(pRoot.right, k);
			if (node != null)
				return node;
		}
		return null;
	}

	TreeNode KthNode2(TreeNode pRoot, int k) {
		if (pRoot != null) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			while (true) {
				while (pRoot != null) {
					stack.push(pRoot);
					pRoot = pRoot.left;
				}
				if (stack.isEmpty())
					break;
				pRoot = stack.pop();
				if (++cntNode == k)
					return pRoot;
				pRoot = pRoot.right;
			}
		}

		return null;
	}

	private int cntNum = 0;
	private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2 - o1;
		}
	});

	/**
	 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
	 * 那么中位数就是所有数值排序之后中间两个数的平均值。
	 * 
	 * @param num
	 */
	public void Insert(Integer num) {
		if ((cntNum & 1) == 0) {
			// 已有偶数个数，新加入的数填进小根堆:先进大根堆，然后弹出大根堆堆顶的数进小根堆
			maxHeap.offer(num);
			minHeap.offer(maxHeap.poll());
		} else {
			// 已有奇数个数，新的数先进小根堆筛选，然后进大根堆存放
			minHeap.offer(num);
			maxHeap.offer(minHeap.poll());
		}
		cntNum++;
	}

	public Double GetMedian() {
		if ((cntNum & 1) == 0) {
			// 偶数个数
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		} else
			return minHeap.peek() + 0.0;
	}

	/**
	 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
	 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
	 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
	 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
	 * 
	 * @param num
	 * @param size
	 * @return
	 */
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (num.length < 1 || size < 1 || num == null)
			return list;
		LinkedList<Integer> queue = new LinkedList<Integer>(); // 双端队列，存放数组元素的下标
		for (int i = 0; i < num.length; i++) {
			while (true) {
				if (queue.isEmpty()) {
					// 队列为空，直接放进去
					queue.offer(i);
					break;
				}
				if (i - queue.peekFirst() >= size) {
					// 队列顶部的下标已过时
					queue.pollFirst();
					continue;
				}
				int end = queue.peekLast();
				if (num[i] >= num[end]) {
					queue.pollLast();
				} else {
					queue.offerLast(i);
					break;
				}
			}
			if (i >= size - 1) {
				list.add(num[queue.peekFirst()]);
			}
		}
		return list;
	}

	/**
	 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上
	 * ，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 例如 a b c e s f c s a d e e
	 * 这样的3 X 4
	 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
	 * 路径不能再次进入该格子。
	 * 
	 * @param matrix
	 * @param rows
	 * @param cols
	 * @param str
	 * @return
	 */
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		int[] flag = new int[matrix.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPath(matrix, rows, cols, i, j, str, 0, flag))
					return true;
			}
		}
		return false;
	}

	private boolean hasPath(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
		int index = i * cols + j;
		if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
			return false;
		if (k == str.length - 1)
			return true;
		flag[index] = 1;
		if (hasPath(matrix, rows, cols, i - 1, j, str, k + 1, flag) || hasPath(matrix, rows, cols, i + 1, j, str, k + 1, flag)
				|| hasPath(matrix, rows, cols, i, j - 1, str, k + 1, flag) || hasPath(matrix, rows, cols, i, j + 1, str, k + 1, flag))
			return true;
		flag[index] = 0;
		return false;
	}

	/**
	 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
	 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 =
	 * 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
	 * 
	 * @param threshold
	 * @param rows
	 * @param cols
	 * @return
	 */
	public int movingCount(int threshold, int rows, int cols) {
		int[][] flag = new int[rows][cols];
		return movingCount(threshold, rows, cols, 0, 0, flag);
	}

	private int movingCount(int threshold, int rows, int cols, int i, int j, int[][] flag) {
		if (i < 0 || i >=rows || j < 0 || j >=cols || getNum(i) + getNum(j) > threshold || flag[i][j] == 1)
			return 0;
		flag[i][j] = 1;
		return movingCount(threshold, rows, cols, i - 1, j, flag) + movingCount(threshold, rows, cols, i + 1, j, flag)
				+ movingCount(threshold, rows, cols, i, j - 1, flag) + movingCount(threshold, rows, cols, i, j + 1, flag) + 1;
	}

	private int getNum(int i) {
		int sum = 0;
		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}

}
