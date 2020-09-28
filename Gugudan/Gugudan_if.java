import java.util.Scanner;

public class Gugudan_if {

	public static void main(String[] args) {
		System.out.println("몇 단을 출력할까요?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n >= 2 && n <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(n * i);
			}			
		}
		else {
			System.out.println("2보다 작거나 9보다 큰 값은 입력할 수 없습니다.");
		}
	}

}
