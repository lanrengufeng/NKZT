package TongYiMoNiBiShi3;

import java.util.Scanner;

/**
 * 牛牛手里有一个字符串A，羊羊的手里有一个字符串B，B的长度大于等于A，所以牛牛想把A串变得和B串一样长，这样羊羊就愿意和牛牛一起玩了。
而且A的长度增加到和B串一样长的时候，对应的每一位相等的越多，羊羊就越喜欢。比如"abc"和"abd"对应相等的位数为2，为前两位。
牛牛可以在A的开头或者结尾添加任意字符，使得长度和B一样。现在问牛牛对A串添加完字符之后，不相等的位数最少有多少位？
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		
		int len1=s1.length();
		int len2=s2.length();
		int count=0,max=0;
		
		for(int i=0;i<=len2-len1;i++){
			for(int j=0;j<len1;j++){
				if(s1.charAt(j)==s2.charAt(j+i))
					count++;
			}
			if(max<count){
				max=count;
			}
			
			count=0;
		}
		
		System.out.println(len1-max);
		scanner.close();
	}
}










