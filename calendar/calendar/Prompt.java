package calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {			
			System.out.println("년도를 입력하세요. (Exit : -1)");
			System.out.print("Year> ");
			int year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print("Month> ");
			int month = scanner.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			System.out.println("첫째 날의 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("Weekday> ");
			String weekday = scanner.next();
			
			
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(year, month));
			cal.printCalendar(year, month, weekday);
		}

		System.out.println("Bye~!!!!");
		scanner.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
