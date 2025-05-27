package src;

import java.util.Scanner;

public class BuscaFeitico {
	public static int buscaBinaria(String[] feiticos, String alvo) {
		int esquerda = 0, direita = feiticos.length - 1;

		for (; esquerda <= direita;) {
			int meio = (esquerda + direita) / 2;
			int comparacao = feiticos[meio].compareToIgnoreCase(alvo);

			if (comparacao == 0)
				return meio;
			else if (comparacao < 0)
				esquerda = meio + 1;
			else
				direita = meio - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] feitiços = { "Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa" };

		System.out.print("Feitiço a ser encontrado: ");
		String busca = sc.nextLine();

		int posicao = buscaBinaria(feitiços, busca);
		if (posicao >= 0)
			System.out.println("Feitiço encontrado na posição " + posicao);
		else
			System.out.println("Feitiço não encontrado");

		sc.close();
	}
}
