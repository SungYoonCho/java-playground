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
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
	}

}
