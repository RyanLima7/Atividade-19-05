package src;

import java.util.Scanner;

class Heroi {
	String nome;
	int forca;
	int inteligencia;
	int velocidade;

	Heroi(String nome, int forca, int inteligencia, int velocidade) {
		this.nome = nome;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.velocidade = velocidade;
	}

	int poderTotal() {
		return forca * 2 + inteligencia * 3 + velocidade;
	}

	public String toString() {
		return nome + " - Poder: " + poderTotal();
	}
}

public class Superherois_Ranking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Heroi[] herois = new Heroi[3]; // pode mudar para mais heróis

		System.out.println("Digite os dados dos heróis:");

		for (int i = 0; i < herois.length; i++) {
			System.out.println("\nHerói #" + (i + 1) + ":");

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Força (número inteiro): ");
			int forca = sc.nextInt();

			System.out.print("Inteligência (número inteiro): ");
			int inteligencia = sc.nextInt();

			System.out.print("Velocidade (número inteiro): ");
			int velocidade = sc.nextInt();

			sc.nextLine(); // para consumir o ENTER depois do número

			herois[i] = new Heroi(nome, forca, inteligencia, velocidade);
		}

		System.out.println("\nPoder total dos heróis:");
		for (Heroi h : herois) {
			System.out.println(h);
		}

		java.util.Arrays.sort(herois, (a, b) -> b.poderTotal() - a.poderTotal());

		System.out.println("\n🏆 Ranking dos Heróis:");
		for (int i = 0; i < herois.length; i++) {
			System.out.println((i + 1) + "º - " + herois[i]);
		}

		if (herois.length >= 2) {
			Heroi h1 = herois[0];
			Heroi h2 = herois[1];

			System.out.println("\n🔍 Comparando " + h1.nome + " e " + h2.nome + ":");
			if (h1.poderTotal() > h2.poderTotal()) {
				System.out.println(h1.nome + " é mais poderoso!");
			} else if (h2.poderTotal() > h1.poderTotal()) {
				System.out.println(h2.nome + " é mais poderoso!");
			} else {
				System.out.println("Empate!");
			}
		}

		sc.close();
	}
}
