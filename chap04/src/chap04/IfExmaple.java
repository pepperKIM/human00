package chap04;

public class IfExmaple {
	public static void main(String[] args) {
		
		int score = 93; 
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
			int number = 10;
			System.out.println(number);
			System.out.println(score); 
			{
				System.out.println(score);
				System.out.println(number);
				String str = "문자열";
			}
//			System.out.println(str);
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
		}
		
		System.out.println("등급은 B입니다.");
		
//		System.out.println(number);
	}
}
