
public class BitShiftOperator {

	public static void main(String[] args) {

		short a= (short)0x55ff;
		short b=0x7fff;  // ����ȯ ���ص� �����Ϸ��� �˾Ƽ�??? //7���� ������ 8���� ������ // ó�� ��Ʈ�� ��ȣ ��Ʈ�� ���� overflow Ȯ�������Ƿ� 8���� ����!!
		// unsigned �ϸ� �ɰ� ������ ���ٰ� �ϳ�??

		
		// ��Ʈ ����
		System.out.printf("%x \n",a & b); // a & b
		System.out.printf("%x \n", a | b);
		System.out.printf("%x \n", a ^ b);
		System.out.printf("%x \n", ~a);		// a -> int �� ��� �ؼ� ����ȴ�
		
		System.out.printf("%x \n",(short)-a);
		
		byte c= 20; 
		byte d= -8;
		// ����Ʈ ����
		System.out.printf("%x \n", c<<2);
		System.out.printf("%x \n", c>>2);
		System.out.printf("%x \n", d>>2);
		System.out.printf("%x \n", d>>>2);
		}

}
