package others;

/**
 * 验证初始化顺序
 * @author Watcher
 *
 */
public class A {
	//A a = new A(1);
	public A(int a){
		System.out.println(a);
	}
	
	//A a = new A(1);
	static A aa =  new A(2);
	public static void main(String[] args) {
		/*System.out.println("main");
		new A(3);*/
		
	}
}
