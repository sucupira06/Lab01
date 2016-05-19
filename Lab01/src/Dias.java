import java.util.Scanner;

public class Dias {

	public static void main(String[] args) {
		String[] dias = { "Dom", "Seg", "Ter", "Quar", "Qui", "Sex", "Sab" };

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um n�mero (1 a 7):");
		int num = leitor.nextInt();
		
		if (num < 1 || num > 7) {
			System.err.println("N�mero digitado � inv�lido.");
			System.exit(1);
		}
		
		System.out.println("Dia da semana �: " + dias[num -1]);
	}

}
