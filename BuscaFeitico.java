package src;

import java.util.Scanner;

public class BuscaFeitico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] feitiços = {
			"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"
		};

		System.out.print("Digite o nome do feitiço: ");
		String busca = sc.nextLine();

		int esquerda = 0;
		int direita = feitiços.length - 1;
		boolean achou = false;

		while (esquerda <= direita) {
			int meio = (esquerda + direita) / 2;
			int resultado = feitiços[meio].compareToIgnoreCase(busca);

			if (resultado == 0) {
				System.out.println("Feitiço encontrado na posição " + meio);
				achou = true;
				break;
			} else if (resultado < 0) {
				esquerda = meio + 1;
			} else {
				direita = meio - 1;
			}
		}

		if (!achou) {
			System.out.println("Feitiço não encontrado.");
		}

		sc.close();
	}
}
