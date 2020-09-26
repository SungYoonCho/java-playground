import java.util.Scanner;

public class Gugudan_Main {

	public static void main(String[] args) {
		System.out.println("몇 단을 출력하시겠습니까? : ");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int[] result = Gugudan_class.calculate(times);
		Gugudan_class.print(result);

	}

}
