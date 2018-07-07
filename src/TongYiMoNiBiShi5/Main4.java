package TongYiMoNiBiShi5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 牛牛有一些字母卡片,每张卡片上都有一个小写字母,所有卡片组成一个字符串s。牛牛一直认为回文这种性质十分优雅,于是牛牛希望用这些卡片拼凑出一些回文串,但是有以下要求:
1、每张卡片只能使用一次
2、要求构成的回文串的数量最少
牛牛想知道用这些字母卡片,最少能拼凑出多少个回文串。
例如: s = "abbaa",输出1,因为最少可以拼凑出"ababa"这一个回文串
s = "abc", 输出3,因为最少只能拼凑出"a","b","c"这三个回文串
 * @author kafka
 *
 */
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int count=0;
		boolean flag=false;		//表明是否含有偶数个某字符
		for(int i=0;i<string.length();i++){
			char s=string.charAt(i);
			if(map.get(s)==null){
				map.put(s, 1);
			}else{
				int num=map.get(s);
				map.put(s, num+1);
			}
		}
		//System.out.println(map.get('a'));
		
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			if(integer%2==1)
				count++;
			else
				flag=true;
		}
		if(count==0){
			System.out.println(1);
			return;
		}
		if(flag){
			System.out.println(count);
		}
			
		else 
			System.out.println(count);
	}
}










