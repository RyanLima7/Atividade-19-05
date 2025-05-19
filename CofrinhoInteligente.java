package src;

import java.util.Scanner;

public class CofrinhoInteligente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] valorMoedas = { 0.01, 0.05, 0.10, 0.25, 0.50, 1.00 };
		double[] quantidades = new double[valorMoedas.length];

		double total = 0;

		System.out.println("Informe quantas moedas você colocou de cada valor:");

		for (int i = 0; i < valorMoedas.length; i++) {
			System.out.printf("\nMoedas de R$ " + String.format("%.2f", valorMoedas[i]) + ": ");
			quantidades[i] = sc.nextInt();
			total += quantidades[i] * valorMoedas[i];
		}

		System.out.printf("\nTotal no cofre: R$ %.2f\n", total);

		double MetaSaldo = 100;
		double faltando = MetaSaldo - total;
		if (total >= MetaSaldo) {
			System.out.println("Você ultrapassou 100 Reais!");
		} else {
			System.out.printf("\nFalta R$ %.2f para alcançar 100 Reais", faltando);

			int semanas = (int) Math.ceil(faltando / total);
			System.out.println("\nSe você repetir este depósito toda semana");
			System.out.println("\nVocê vai alcançar o Saldo com a Meta de 100 Reais em aproximadamente " + semanas + " semanas");

		}
		sc.close();
	}
}
