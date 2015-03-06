
public class BitShiftOperator {

	public static void main(String[] args) {

		short a= (short)0x55ff;
		short b=0x7fff;  // 형변환 안해도 컴파일러가 알아서??? //7까진 괜찮내 8부터 에러네 // 처음 비트를 부호 비트로 봐서 overflow 확률있으므로 8부터 에러!!
		// unsigned 하면 될거 같은데 없다고 하네??

		
		// 비트 연산
		System.out.printf("%x \n",a & b); // a & b
		System.out.printf("%x \n", a | b);
		System.out.printf("%x \n", a ^ b);
		System.out.printf("%x \n", ~a);		// a -> int 로 취급 해서 연산된다
		
		System.out.printf("%x \n",(short)-a);
		
		byte c= 20; 
		byte d= -8;
		// 쉬프트 연산
		System.out.printf("%x \n", c<<2);
		System.out.printf("%x \n", c>>2);
		System.out.printf("%x \n", d>>2);
		System.out.printf("%x \n", d>>>2);
		}

}
