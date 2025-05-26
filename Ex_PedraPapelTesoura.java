package src;

import java.util.Random;
import java.util.Scanner;

public class Ex_PedraPapelTesoura {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println(" == Seja bem vindo ao jogo Pedra, Papel, Tesoura ==");
		
		String[] opcoes = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };
		
		System.out.println("\nDigite o seu nome por favor: ");
			String nome = sc.nextLine() ;
		System.out.println("Escolha uma opção: ");
		
		for (int i = 0; i < opcoes.length; i++)
			System.out.println(i + " - " + opcoes[i]);
		int jogador = sc.nextInt();
		if (jogador < 0 || jogador >= opcoes.length) {
			System.out.println("Opção inválida.");
			return;
		}
		int computador = rand.nextInt(5);
		System.out.println(nome + "\n: " + opcoes[jogador]);
		System.out.println("Computador: " + opcoes[computador]);
		if (jogador == computador) {
			System.out.println("Empate!");
		} else if ((jogador == 2 && computador == 1) || (jogador == 1 && computador == 0)
				|| (jogador == 0 && computador == 3) || (jogador == 3 && computador == 4)
				|| (jogador == 4 && computador == 2) || (jogador == 2 && computador == 3)
				|| (jogador == 3 && computador == 1) || (jogador == 1 && computador == 4)
				|| (jogador == 4 && computador == 0) || (jogador == 0 && computador == 2)) {
			System.out.println("Você venceu!");
		} else {
			System.out.println("Você " + nome + " perdeu!");
		}
	}
}
