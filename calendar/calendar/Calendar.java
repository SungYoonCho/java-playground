package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println(" 월    화    수   목    금    토   일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] maxDays = {28, 30, 31};
		if (n == 2) {
			System.out.println(n + "월은 " + maxDays[0] + "까지 있습니다.");
		}
		else if (n % 2 == 0) {
			System.out.println(n + "월은 " + maxDays[1] + "까지 있습니다.");
		}
		else if (n % 2 == 1){
			System.out.println(n + "월은 " + maxDays[2] + "까지 있습니다.");
		}
		scanner.close();
	}

}
