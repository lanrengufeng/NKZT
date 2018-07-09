package others;

public class Main3 {

	public static void main(String[] args) {
		
		System.out.println(String.format("%.6f", 1.2));
		System.out.println((double)Math.round(5*1000000.0 / 2.0)/1000000.0);
		System.out.println((double)Math.round(1.12345*100)/100);
		
		
		
		
		
		
		/*System.out.println(numOf1(5));
		System.out.println(numOf1(-5));*/
	}
	
	
	public static int numOf1(int n){
		int cnt=0;
		while(n!=0){
			cnt++;
			n&=n-1;
		}
		return cnt;
	}
}
