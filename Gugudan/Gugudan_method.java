import java.util.Scanner;

public class Gugudan_method {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("몇 단을 출력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		
		int[] result = calculate(times);
		print(result);
	}
}
