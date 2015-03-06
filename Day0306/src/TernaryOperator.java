import java.io.IOException;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) throws IOException { 

		// 두수의 차를 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("a입력"); a=sc.nextInt();
		System.out.print("b입력"); b=sc.nextInt();
		System.out.println("두 수의 차는 " + (( a > b) ? a-b : b-a ));
	}

}
