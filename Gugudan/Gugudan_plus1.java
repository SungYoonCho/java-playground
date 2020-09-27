import java.util.Scanner;

public class Gugudan_plus1 {
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
		System.out.println("�� ���� ����Ͻðڽ��ϱ�? : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 2; i < (n+1); i++) {
			int[] result = calculate(i, n);
			print(result);			
		}
	}
}
