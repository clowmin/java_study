import java.io.IOException;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) throws IOException { 

		// �μ��� ���� ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("a�Է�"); a=sc.nextInt();
		System.out.print("b�Է�"); b=sc.nextInt();
		System.out.println("�� ���� ���� " + (( a > b) ? a-b : b-a ));
	}

}
