package ITXiaoZhaoMay;

import java.util.Scanner;

/**
 * 最近天气太热了，牛牛每天都要吃雪糕。雪糕有一盒一份、一盒两份、一盒三份这三种包装，牛牛一天可以吃多盒雪糕，但是只能吃六份，吃多了就会肚子疼，吃少了就会中暑
 * 。而且贪吃的牛牛一旦打开一盒雪糕，就一定会把它吃完。请问牛牛能健康地度过这段高温期么？ 输入描述: 每个输入包含多个测试用例。
 * 输入的第一行包括一个正整数，表示数据组数T(1<=T<=100)。
 * 接下来N行，每行包含四个正整数，表示高温期持续的天数N(1<=N<=10000)，一盒一份包装的雪糕数量A(1<=A<=100000)，
 * 一盒两份包装的雪糕数量B(1<=B<=100000)，一盒三份包装的雪糕数量C(1<=A<=100000)。 输出描述:
 * 对于每个用例，在单独的一行中输出结果。如果牛牛可以健康地度过高温期则输出"Yes"，否则输出"No"。 示例1 输入 4 1 1 1 1 2 0 0 4
 * 3 0 2 5 4 24 0 0 输出 Yes Yes No Yes
 * 
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			if (n > a && n > b && n > c) {
				System.out.println("No");
				continue;
			}

			int dayC = c / 2; // 三份装能吃几天
			int dayB = b / 3; // 两份装能吃几天
			// int dayA = a/6;
			// int rA = a%6;
			int rC = c % 2; // 三份装剩余数量
			int rB = b % 3; // 两份装剩余数量
			int day = dayC + dayB;
			if (a > 0) {

				if (rC == 1 && rB > 0) {
					rC--;
					rB--;
					a--;
					day++; // 3 2 1 一天
				} else if (rC == 1 && a > 2) {
					a -= 3;
					day++;
				}

				if (rB == 2 && a > 1) {
					a -= 2;
					rB -= 2;
					day++;
				}
				if (rB == 1 && a > 3) {
					a -= 4;
					day++;
				}
			}
			day += (a / 6);
			if (day >= n) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

		scanner.close();
	}
}
