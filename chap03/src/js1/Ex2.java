package js1;

public class Ex2 {
	public static void main(String[] args) {
		int number = 24;
		int size = 10;
		
		// 버림, 반올림, 올림
		// 123 / 10 = 12.3 >> 13
		// 122 / 10 = 13
		// 120 / 10 = 12 >> 12
		
		System.out.println(number % size == 0 ? number / size : number / size + 1);;
		System.out.println((number + 9) / size);
		
		System.out.println(number > 0 ? "양수" : number < 0 ? "음수" : 0);
		
		System.out.println(number - number % 10 + 1);
		System.out.println(number / 10 * 10 + 1);
		
		
		// num의 값보다 크면서도 가장 가까운 10의 배수
		
		
		System.out.println((number / 10 + 1) * 10 - number);
		System.out.println(10 - number % 10);
		
		// 에서 변수 num의 값을 뺀 나머지를
		
	}
}
