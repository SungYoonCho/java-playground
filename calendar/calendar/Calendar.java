package calendar;

public class Calendar {
	
	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] Leap_Max_Days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] Weekdays = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };
	
	public int getIndexOfWeekdays(String weekday) {
		for (int i = 0; i < 7; i++) {
			if (weekday.contentEquals(Weekdays[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return Leap_Max_Days[month - 1];
		}
		else {
			return Max_Days[month - 1];
		}
	}
	
	public void printCalendar(int year, int month, String weekday) {
		System.out.printf("\n    <<%4d년%3d월>>\n", year, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int weekdayidx = getIndexOfWeekdays(weekday);
		
		for (int i = 0; i < weekdayidx; i++) {
			System.out.print("   ");			
		}
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%2d ", i);
			if ((i + weekdayidx) % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");		
	}
}
