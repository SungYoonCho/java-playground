import java.util.Scanner;

public class Gugudan_if {

	public static void main(String[] args) {
		System.out.println("�� ���� ����ұ��?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n >= 2 && n <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(n * i);
			}			
		}
		else {
			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
		}
	}

}
