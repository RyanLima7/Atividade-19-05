package src;

import java.util.Random;
import java.util.Scanner;

public class Calculadora_Errada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Bem vindo a calculadora com erro de até 1%");
		System.out.print("\nDigite o primeiro número: ");
		double num1 = sc.nextDouble();

		System.out.print("\nDigite o operador (+, -, *, /): ");
		char operador = sc.next().charAt(0);

		System.out.print("\nDigite o segundo número: ");
		double num2 = sc.nextDouble();

		double resultado = 0;

		if (operador == '+') {
			resultado = num1 + num2;
		} else if (operador == '-') {
			resultado = num1 - num2;
		} else if (operador == '*') {
			resultado = num1 * num2;
		} else if (operador == '/') {
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("Erro: divisão por zero.");
				sc.close();
				return;
			}
		} else {
			System.out.println("Operador inválido.");
			sc.close();
			return;
		}

		double erro = 1 + (rand.nextDouble() * 0.01); // de 1% até quase 2%
		double resultadoComErro = resultado * erro;

		System.out.printf("\nResultado com o erro de cálculo: %.2f\n", resultadoComErro);
		sc.close();
	}
}
