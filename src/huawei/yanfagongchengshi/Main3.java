package huawei.yanfagongchengshi;

import java.util.Scanner;


/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）


输入描述:
输入一个十六进制的数值字符串。



输出描述:
输出该数值的十进制字符串。


输入例子1:
0xA

输出例子1:
10
 * @author kafka
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String data = scanner.next();
			System.out.println(Integer.parseInt(data.substring(2), 16));
			
			
		}
		
		scanner.close();
	}
}



