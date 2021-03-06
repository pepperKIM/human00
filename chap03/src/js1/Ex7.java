package js1;

public class Ex7 {
	public static void main(String[] args) {
		// C = 5/9 ×(F - 32)
		
		int fahrenheit = 100;
		float celcius = (int)(5f/9 * (fahrenheit - 32) * 100 + 0.5f) / 100f; // 정수
		
		System.out.println(celcius);
		
		double num1 = 100.1 + 0.5; // 100.6 100
		double num2 = 100.4 + 0.5; // 100.9 100
		double num3 = 100.5 + 0.5; // 101.0 101
		double num4 = 100.6 + 0.5; // 101.1 101
		
		System.out.println((int)num1);
		System.out.println((int)num2);
		System.out.println((int)num3);
		System.out.println((int)num4);
		
		
		char ch = '0';
		boolean b = 
				ch >= 'a' && ch <= 'z' || // 소문자 
				ch >= 'A' && ch <= 'Z' || // 대문자
				ch >= '0' && ch <= '9'; // 숫자
		System.out.println(b);
		
		
		java.lang.System.out.println(ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch); 
		
		double z = 0.0;
		if(Double.isNaN(z) || !Double.isFinite(z)) {
			System.out.println("0.0으로 나눌수 없다.");
		}
		
	}
}
