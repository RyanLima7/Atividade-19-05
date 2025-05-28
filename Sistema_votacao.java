package src;

import java.util.Scanner;

public class Sistema_votacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Olá, quantos mascotes serão candidatos? ");
		int Mascotes = sc.nextInt();
		sc.nextLine();

		String[] nomes = new String[Mascotes];
		int[] votos = new int[Mascotes];
		System.out.println("\nAbaixo digite o nome dos mascotes");
		for (int i = 0; i < Mascotes; i++) {
			System.out.print("\nMascote n° " + (i + 1) + ": ");
			nomes[i] = sc.nextLine();
			votos[i] = 0;
		}

		System.out.println("\nDigite o nome do mascote para votar ");
		System.out.println("Se desejar encerrar, digite 'fim')");
		for (String entrada = ""; !entrada.equalsIgnoreCase("fim");) {
			System.out.print("Seu voto: ");
			entrada = sc.nextLine();

			if (!entrada.equalsIgnoreCase("fim")) {
				boolean encontrado = false;
				for (int i = 0; i < Mascotes; i++) {
					if (nomes[i].equalsIgnoreCase(entrada)) {
						votos[i]++;
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Mascote não encontrado. Tente novamente.");
				}
			}
		}

		int totalVotos = 0;
		for (int i = 0; i < Mascotes; i++) {
			totalVotos += votos[i];
		}

		System.out.println("\n == Resultado da Votação ==");
		for (int i = 0; i < Mascotes; i++) {
			double percentual = totalVotos > 0 ? (votos[i] * 100.0) / totalVotos : 0;
			System.out.printf("%s: %d voto(s) - %.1f%%\n", nomes[i], votos[i], percentual);
		}

		System.out.println("\nFim da votação. Obrigado!");
		sc.close();
	}
}
