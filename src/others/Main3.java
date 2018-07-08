package others;

public class Main3 {

	public static void main(String[] args) {
		System.out.println(numOf1(5));
		System.out.println(numOf1(-5));
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
