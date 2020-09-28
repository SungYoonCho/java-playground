package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(" ");
		
		int a = Integer.parseInt(splitedValue[0]);
		int b = Integer.parseInt(splitedValue[1]);
		
		System.out.println(a + b);

	}

}
