package others;

import org.junit.Test;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println(f(15));
		System.out.println(0+'\t');
	}
	
	public static int f(int n){
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		return f(n-1)+f(n-2)+f(n-3);
	}
	
	@Test
	public void run1(){
		double a = 2+Math.pow(3, 0.5);
		int num = 1;
		for(int i=0;i<80;i++){
			num=(int)(num*a)%10; 
		}
		System.out.println(num);
	}
	
	@Test
	public void run2(){
		
		System.out.println(f2(20));
	}
	
	public int f2(int n){
		if(n==0)
			return 0;
		if(n==1||n==2)
			return 1;
		if(n==3)
			return 2;
			
		return f2(n-1)+f2(n-3);
	}
}
