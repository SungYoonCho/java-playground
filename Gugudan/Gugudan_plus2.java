import java.util.Scanner;

public class Gugudan_plus2 {
	public static int[] calculate(int times, int n) {
		int[] result = new int[n]; 
		for (int i = 0; i < n; i++) {
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
		System.out.println("몇 단을 출력하시겠습니까? : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int i = 2; i < (first+1); i++) {
			int[] result = calculate(i, second);
			print(result);			
		}
	}
}
