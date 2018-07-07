package TongYiMoNiBiShi5;

import java.util.Scanner;

/**
 * 牛牛从生物科研工作者那里获得一段字符串数据s,牛牛需要帮助科研工作者从中找出最长的DNA序列。DNA序列指的是序列中只包括'A','T','C','G'。牛牛觉得这个问题太简单了,就把问题交给你来解决。
例如: s = "ABCBOATER"中包含最长的DNA片段是"AT",所以最长的长度是2。
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string = scanner.nextLine();
		
		if(string.length()==1){
			if(string.equals("A")||string.equals("T")||string.equals("C")||string.equals("G")){
				System.out.println(1);
				return;
			}else{
				System.out.println(0);
				return;
			}
				
		}
		int count=0,max=0;
		for(int i=0;i<string.length();i++){
			if(isInclude(string.charAt(i))){
				count++;
				if(count>max)
					max=count;
			}else{
				count=0;
			}
			
		}
		
		System.out.println(max);
		scanner.close();
	}
	
	
	public static boolean isInclude(char ch){
		if(ch=='A'||ch=='C'||ch=='G'||ch=='T')
			return true;
		else
			return false;
	}
}












