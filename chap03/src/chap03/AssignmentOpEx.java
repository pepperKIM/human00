package chap03;

public class AssignmentOpEx {
	public static void main(String[] args) {
		int result = 0;
		result += 10; // result = result + 10;
		System.out.println("result=" + result);
		result -= 5; // result = result - 5;
		System.out.println("result=" + result);
		result *= 3; // result = result * 3;
		System.out.println("result=" + result);
		result /= 5; // result = result / 5;
		System.out.println("result=" + result);
		result %= 3; // result = result % 3;
		System.out.println("result=" + result);
		
		int i = 0;
		i++;
		i=i+1;
		i+=1;
		
		String str = "<table>";
		str += "<tr><td>1</td></tr>";
		str += "<tr><td>1</td></tr>";
		str += "<tr><td>1</td></tr>";
		str += "<tr><td>1</td></tr>";
		str += "<tr><td>1</td></tr>";
		str += "</table>";
		System.out.println(str);
	}
}
