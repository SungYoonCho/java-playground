package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String inputValue = scanner.nextLine();
//		String[] splitedValue = inputValue.split(" ");
//		
//		int a = Integer.parseInt(splitedValue[0]);
//		int b = Integer.parseInt(splitedValue[1]);
//		
//		System.out.println(a + b);
		
//		Other Solution
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
		scanner.close();
	}

}
