package src;

import java.util.Scanner;

public class Ilha_codigos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" == Bem-vindo à Ilha dos Códigos Perdidos! ==");
		System.out.println("\nQuantos códigos você vai digitar? ");
		System.out.print("Por exemplo (2H) ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		String resultado = "";

		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Digite o código " + i + " : ");
			String codigo = sc.nextLine();

			char numeroChar = codigo.charAt(0);
			char letra = codigo.charAt(1);
			int vezes = numeroChar - '0';

			for (int j = 0; j < vezes; j++) {
				resultado += letra;
			}
		}

		System.out.println("\nAqui está o seu Código reconstruído:");
		System.out.println(resultado);

		System.out.println("\nFim do programa, obrigado por explorar a ilha!");
		sc.close();
	}
}
