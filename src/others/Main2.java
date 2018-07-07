package others;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		String b = in.nextLine();
		//String cString = in.next();
		System.out.println(a);
		System.out.println(b);
		//System.out.println(cString);
		in.close();
	}
}
