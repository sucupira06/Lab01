import java.util.Scanner;

public class Faculdade {

	public static void main(String[] args) {
		int aprovado = 0;
		int n = 10;
		Scanner leitor = new Scanner(System.in);
		
		String melhorAluno = null, piorAluno = null;
		double melhorNota = 0, piorNota = 100;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Insira o nome: ");
			String nome = leitor.next();
			
			System.out.println("Insira uma nota:");
			double nota = leitor.nextDouble();
			
			if (nota >=60) {
				aprovado++;
			}
			
			if (nota > melhorNota) {
				melhorAluno = nome;
				melhorNota = nota;
			}
			
			if (nota < piorNota) {
				piorNota = nota;
				piorAluno = nome;
			}
		}
		
		System.out.println(aprovado + " alunos aprovados e " + (n - aprovado) + " alunos reprovados!");
		
		System.out.println("Parab�ns " + melhorAluno + "! Voc� tirou " + melhorNota + " pontos!");
		
		System.out.println(piorAluno + ", voc� precisa se esfor�ar mais. Voc� tirou " + piorNota + " pontos!");
		
		if (aprovado >= 8) {
			System.out.println("Excelente resultado!");
		} else if (aprovado >= 5) {
			System.out.println("Resultado aceit�vel!");
		} else {
			System.out.println("Resultado ruim!");
		}
	}

}
