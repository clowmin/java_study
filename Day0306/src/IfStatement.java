
public class IfStatement {

	public static void main(String[] args) {
		f(6);
	}

	static void f(int i){
		// ¦�� ����
		if(i%2==0)
			System.out.println("¦��");
		// 3�� �������
		if(i%3==0)
			System.out.println("3�ǹ��");
		if(i%5==0)System.out.println("5x");
		else if(i%5==1)System.out.println("5x +1");
		else System.out.println("5x + 2,3,4");
	}
}
