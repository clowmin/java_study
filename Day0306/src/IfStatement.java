
public class IfStatement {

	public static void main(String[] args) {
		f(6);
	}

	static void f(int i){
		// 짝수 인지
		if(i%2==0)
			System.out.println("짝수");
		// 3의 배수인지
		if(i%3==0)
			System.out.println("3의배수");
		if(i%5==0)System.out.println("5x");
		else if(i%5==1)System.out.println("5x +1");
		else System.out.println("5x + 2,3,4");
	}
}
