package TongYiMoNiBiShi2;

import java.util.Scanner;

/**
 * 牛牛有两个字符串（可能包含空格）,牛牛想找出其中最长的公共连续子串,希望你能帮助他,并输出其长度。 
输入描述:
输入为两行字符串（可能包含空格），长度均小于等于50.


输出描述:
输出为一个整数，表示最长公共连续子串的长度。

输入例子1:
abcde
abgde

输出例子1:
2
 * @author kafka
 *
 */
public class Main1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		
		int len1=s1.length(),len2=s2.length();
		int count=0,max=0;
		boolean flag=false;
		String maxs="";
		String mins="";
		if(len1<len2){
			 maxs=s2;
			 mins=s1;
		}else{
			 maxs=s1;
			 mins=s2;
		}
		for(int i=1;i<=mins.length();i++){
			for(int j=0;j<mins.length()-i+1;j++){
				String temp=mins.substring(j, j+i);
				if(maxs.contains(temp)){
					if(max<i)
						max=i;
				}
			}
		}
		System.out.println(max);
		
		scanner.close();
	}
	
	
}












