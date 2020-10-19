package calendar;

import java.util.Scanner;

public class Prompt {
    
	public static Scanner scanner = new Scanner(System.in);
	
	public void uiPrompt() {
		Prompt prompt = new Prompt();
		
		prompt.printHelp();
		
		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print("> ");

			char command = scanner.nextLine().charAt(0);
			
			if (command == '1') {
				prompt.runPrompt1();
			}
			else if (command == '2') {
				prompt.runPrompt2();
			}
			else if (command == '3') {
				prompt.runPrompt3();
			}
			else if (command == 'h') {
				prompt.printHelp();
			}
			else if (command == 'q') {
				break;
			}	
		}
		
		System.out.println("Bye~!!!!");
	}
	
	public void printHelp() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말       q. 종료");
		System.out.println("+----------------------+");
	}
	
	public void runPrompt1() {
		Calendar cal = new Calendar();
		
		System.out.println("[일정 등록] 날짜를 입력하세요.");
		System.out.print("> ");
		String date = scanner.nextLine();
		System.out.println("일정을 입력하세요.");
		System.out.print("> ");			
		String content = scanner.nextLine();
		cal.saveSchedule(date, content);
		System.out.println("일정이 등록되었습니다.");
	}
	
	public void runPrompt2() {
		Calendar cal = new Calendar();
		
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.print("> ");
		String date = scanner.nextLine();
		cal.printSchedule(date);
	}
	
	public void runPrompt3() {
		Calendar cal = new Calendar();

		while (true) {			
			System.out.println("년도를 입력하세요. (Exit : -1)");
			System.out.print("Year> ");
			int year = scanner.nextInt();
			scanner.nextLine();
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
			
			
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(year, month));
			cal.printCalendar(year, month);
		}
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.uiPrompt();
	}
	
}
