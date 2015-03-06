import java.util.Scanner;

// java, javax 로 시작하는 얘들은 java에서 기본으로 제공하는 system api
public class WileLoop {

	public static void main(String[] args) {
		/*
		 * while 문을 이용하여 키보드로부터 숫자를 입력받고, 입력된 숫자의 평균을 구하는 프로그램
		 * 0이 입력되는 입력이 종료되는 프로그램
		 */
		
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		int count=0;
		
		while ((n=sc.nextInt())!=0){
			count++;
			sum+=n;
		}
		System.out.println("입력된 갯수  " +count+ "입력된 합계 " +sum+ "평균" +(double)sum/count);
		
	}

}
