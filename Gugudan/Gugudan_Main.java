import java.util.Scanner;

public class Gugudan_Main {

	public static void main(String[] args) {
		System.out.println("�� ���� ����Ͻðڽ��ϱ�? : ");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int[] result = Gugudan_class.calculate(times);
		Gugudan_class.print(result);

	}

}
