import java.util.Scanner;

// java, javax �� �����ϴ� ����� java���� �⺻���� �����ϴ� system api
public class WileLoop {

	public static void main(String[] args) {
		/*
		 * while ���� �̿��Ͽ� Ű����κ��� ���ڸ� �Է¹ް�, �Էµ� ������ ����� ���ϴ� ���α׷�
		 * 0�� �ԷµǴ� �Է��� ����Ǵ� ���α׷�
		 */
		
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		int count=0;
		
		while ((n=sc.nextInt())!=0){
			count++;
			sum+=n;
		}
		System.out.println("�Էµ� ����  " +count+ "�Էµ� �հ� " +sum+ "���" +(double)sum/count);
		
	}

}
