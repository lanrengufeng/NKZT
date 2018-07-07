package TongYiMoNiBiShi5;

import java.util.Scanner;


/**
 * 如果一个字符串由两个相同字符串连接而成,就称这个字符串是偶串。例如"xyzxyz"和"aaaaaa"是偶串,但是"ababab"和"xyzxy"却不是。
牛牛现在给你一个只包含小写字母的偶串s,你可以从字符串s的末尾删除1和或者多个字符,保证删除之后的字符串还是一个偶串,牛牛想知道删除之后得到最长偶串长度是多少。 
输入描述:
输入包括一个字符串s,字符串长度length(2 ≤ length ≤ 200),保证s是一个偶串且由小写字母构成


输出描述:
输出一个整数,表示删除之后能得到的最长偶串长度是多少。保证测试数据有非零解

输入例子1:
abaababaab

输出例子1:
6
 * @author kafka
 *
 */
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		if(string.length()%2==1){
			System.out.println(-1);
			return;
		}
		
		int count=0;
		int length=string.length();
		while(string.length()>0){
			string=string.substring(0,string.length()-2);
			count+=2;
			if(isOddString(string)){
				System.out.println(length-count);
				return;
			}
			
		}
		
		
	}
	
	public static boolean isOddString(String s){
		if(s.length()%2==1)
			return false;
		if(s.substring(0, s.length()/2).equals(s.substring(s.length()/2)))
			return true;
		
		
		return false;
	}
}







