package chap03;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
//		double pieceUnit = 0.1;
		int number = 7;
		
		
		int temp = apple * 10 - number; // 정수
		double result = temp / 10.0;
		
		System.out.println("사과 "+apple+"개 에서");
		System.out.println(number / 10.0 + "조각을 빼면");
		System.out.println(result + "조각이 남는다");
		
		// 국어 영어 수학
		int kor = 90;
		int eng = 80;
		int mat = 81;
		
		int total = kor + eng + mat;
		double avg = total * 100 / 3 / 100.0;
		System.out.println(total);
		System.out.println(avg);
		
		
		
		
		
	}
}
