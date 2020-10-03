package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();

			if (month == -1) {
				break;
			}

			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
			cal.printCalendar(2020, month);
		}

		System.out.println("반복이 완료되었습니다.");
		scanner.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
