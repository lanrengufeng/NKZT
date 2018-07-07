package TongYiMoNiBiShi1;

import java.util.Scanner;

/**
 * DNA分子是以4种脱氧核苷酸为单位连接而成的长链，这4种脱氧核苷酸分别含有A,T,C,G四种碱基。碱基互补配对原则：A和T是配对的，C和G是配对的。如果两条碱基链长度是相同的并且每个位置的碱基是配对的，那么他们就可以配对合成为DNA的双螺旋结构。现在给出两条碱基链，允许在其中一条上做替换操作：把序列上的某个位置的碱基更换为另外一种碱基。问最少需要多少次让两条碱基链配对成功 
输入描述:
输入包括一行： 包括两个字符串,分别表示两条链,两个字符串长度相同且长度均小于等于50。


输出描述:
输出一个整数，即最少需要多少次让两条碱基链配对成功

输入例子1:
ACGT TGCA

输出例子1:
0
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		int cnt = 0;
		for(int i=0;i<s1.length();i++){
			if(!isMatch(s1.charAt(i), s2.charAt(i)))
				cnt++;
		}
		System.out.println(cnt);
		scanner.close();
	}
	
	private static boolean isMatch(char ch1,char ch2){
		if((ch1=='A'&&ch2=='T')||(ch1=='C'&&ch2=='G')||(ch1=='G'&&ch2=='C')||(ch1=='T'&&ch2=='A'))
			return true;
		
		
		return false;
	}
}









