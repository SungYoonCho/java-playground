import java.util.Scanner;

public class Gugudan_loop {

	public static void main(String[] args) {
		System.out.println("�� ���� ����ұ��? : ");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// while��
/*		int i = 1;
		
		while (i < 10) {
			System.out.println(N * i);
			i++;
		}
*/
		for (int i = 1; i < 10; i++) {
			System.out.println(N * i);
		}
	}

}
