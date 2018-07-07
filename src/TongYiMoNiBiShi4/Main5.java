package TongYiMoNiBiShi4;

import java.util.Scanner;

/**
 * 牛牛喜欢字符串,但是他讨厌丑陋的字符串。对于牛牛来说,一个字符串的丑陋值是字符串中相同连续字符对的个数。比如字符串“ABABAABBB”的丑陋值是3,因为有一对"AA"和两对重叠的"BB"。现在给出一个字符串,字符串中包含字符'A'、'B'和'?'。牛牛现在可以把字符串中的问号改为'A'或者'B'。牛牛现在想让字符串的丑陋值最小,希望你能帮帮他。 
输入描述:
输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 50),字符串只包含'A','B','?'三种字符。


输出描述:
输出一个整数,表示最小的丑陋值

输入例子1:
A?A

输出例子1:
0
 * @author kafka
 *
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		
		//首先把?替换成A或者B
		boolean flag=false;		//找到第一个非?
		char[] cs = string.toCharArray();
		for(int i=0;i<cs.length;i++){
			if(cs[i]!='?'){
				flag=true;	//找到第一个非?
			}
				
			if(flag){
				if(cs[i]=='?'){
					if(cs[i-1]=='A')
						cs[i]='B';
					else cs[i]='A';
				}
			}
		}
		
		int count=0;
		//flag=false;
		for(int i=1;i<cs.length;i++){
			if(cs[i]=='?'){
				continue;
			}
			if(cs[i]==cs[i-1])
				count++;
		}
		System.out.println(count);
		scanner.close();
	}
}


















