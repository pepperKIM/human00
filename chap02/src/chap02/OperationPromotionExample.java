package chap02;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteVakue2 = 20;
//		byte byteVakue3 = byteValue1 + byteVakue2 ;
		
		int intValue1 = byteValue1 + byteVakue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		
		System.out.println("유니코드 : " +  intValue2);
		System.out.println("출력문자 : " +  (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		// 연산 당시의 피연산자의 데이터타입을 주의해서 보시면됩니다.
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		// 클래스변수, 인스턴스변수, 지역변수
		
		// 
	}
}
