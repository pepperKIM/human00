package chap03;

public class LogicExam {
	public static void main(String[] args) {
		// AND &&, OR ||
		// true 1 false 0
		
		// AND : 두 항이 전부 참일 때만 참
		// 0 0	0
		// 0 1	0
		// 1 0  0
		// 1 1  1
		
		// OR : 두 항이 전부 거짓일 때만 거짓
		// 0 0 	0
		// 0 1  1
		// 1 0  1
		// 1 1 	1
		
		// NOT ! : 참 > 거짓 , 거짓 > 참
		
		int i = 100;
		int j = 1;
		
		if(i == 100 || i / j == 0) { // 25
			System.out.println("25번 줄 통과");
		}
		if(i == 100 | i / j == 0) { // 28
			System.out.println("28번 줄 통과");
		}
		
		// && &, || | 두개짜리 사용시 불필요한 연산 하지 않음 > 두개짜리가 성능에서 이득
		
		
	}
}
