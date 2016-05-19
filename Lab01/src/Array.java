import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] numeros = new int[7];
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira um número:");
			numeros[i] = leitor.nextInt();
		}
		
		System.out.println("Imprimindo na ordem fornecida...");
		// imprime na ordem fornecida 
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ",");
		}
		
		System.out.println("");
		System.out.println("Imprimindo na ordem inversa a fornecida...");
		//imprime na ordem inversa a fornecida
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
