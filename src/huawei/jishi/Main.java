package huawei.jishi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		lastStringLength();
	}
	
	
	public static void lastStringLength(){
		Scanner in = new Scanner(System.in);
		String[] arr = in.nextLine().split(" ");
		System.out.println(arr[arr.length-1].length());
		in.close();
	}
	
	
	
	
	
	
	
}
