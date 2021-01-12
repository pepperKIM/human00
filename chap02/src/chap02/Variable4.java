package chap02;

public class Variable4 {
	public static void main(String[] args) {
		// 변수의 타입
		// 기본타입, 참조타입
		// 기본타입의 종류는 정수 5개, 실수 2개, 논리 1개
		
		// bit, byte
		// 정보기억의 최소단위 bit (binary digit) 0,1
		// 8bit > 1byte
		
		// byte 1, short 2, int 4, long 8
		
		//
		
		// 0000 0000
		// 1111 1111
		// -128 ~ 127
		
		// 0 000 0000 최상위비트 > 부호를 결정 0 양수 1 음수
		// 0 001 0101 > 21
		
		// 음수 저장 까다로움
		// 2의 보수 표기
		
		// 10진수
		// 12345에 대한 9의 보수를 구하여라
		// 87654
		
		// -2 
		// 1 0000010 : 부호 절대값
		// 1 1111101 : 1의 보수
		// +       1
		// 1 1111110 : 2의 보수 
		
		// int : 부호비트 1개, 31개의 숫자 비트
		
		// 11111111 11111111 11111111 11111110
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(2));
		
		// 정수형 부호비트 + 수치비트
		
		
	}
}
